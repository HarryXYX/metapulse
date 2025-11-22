#!/bin/bash
# MetaPulse 服务器环境检查和安装脚本
# 适用于 CentOS/Ubuntu/Debian Linux

set -e

echo "================================="
echo "MetaPulse 服务器环境检查"
echo "================================="

# 颜色输出
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# 检查函数
check_command() {
    if command -v $1 &> /dev/null; then
        echo -e "${GREEN}✓${NC} $1 已安装: $(command -v $1)"
        if [ ! -z "$2" ]; then
            VERSION=$($1 $2 2>&1 | head -1)
            echo "  版本: $VERSION"
        fi
        return 0
    else
        echo -e "${RED}✗${NC} $1 未安装"
        return 1
    fi
}

# 检测操作系统
detect_os() {
    if [ -f /etc/os-release ]; then
        . /etc/os-release
        OS=$ID
        VER=$VERSION_ID
    else
        echo -e "${RED}无法检测操作系统${NC}"
        exit 1
    fi
    echo -e "${GREEN}操作系统:${NC} $PRETTY_NAME"
}

# 检查 Java
check_java() {
    echo ""
    echo "=== 检查 Java 环境 ==="

    if check_command java "-version"; then
        JAVA_VERSION=$(java -version 2>&1 | awk -F '"' '/version/ {print $2}' | cut -d'.' -f1)
        if [ "$JAVA_VERSION" -ge 17 ]; then
            echo -e "${GREEN}✓ Java 版本满足要求 (>= 17)${NC}"
            return 0
        else
            echo -e "${YELLOW}⚠ Java 版本过低，需要 JDK 17+${NC}"
            return 1
        fi
    else
        echo -e "${RED}✗ 未安装 Java${NC}"
        return 1
    fi
}

# 安装 JDK 17
install_java() {
    echo ""
    echo "=== 安装 OpenJDK 17 ==="

    if [ "$OS" = "ubuntu" ] || [ "$OS" = "debian" ]; then
        sudo apt-get update
        sudo apt-get install -y openjdk-17-jdk
    elif [ "$OS" = "centos" ] || [ "$OS" = "rhel" ]; then
        sudo yum install -y java-17-openjdk-devel
    else
        echo -e "${RED}不支持的操作系统: $OS${NC}"
        echo "请手动安装 OpenJDK 17"
        exit 1
    fi

    # 验证安装
    if check_java; then
        echo -e "${GREEN}✓ Java 安装成功${NC}"
    else
        echo -e "${RED}✗ Java 安装失败${NC}"
        exit 1
    fi
}

# 检查 Git
check_git() {
    echo ""
    echo "=== 检查 Git ==="
    check_command git "--version"
}

# 安装 Git
install_git() {
    echo ""
    echo "=== 安装 Git ==="

    if [ "$OS" = "ubuntu" ] || [ "$OS" = "debian" ]; then
        sudo apt-get update
        sudo apt-get install -y git
    elif [ "$OS" = "centos" ] || [ "$OS" = "rhel" ]; then
        sudo yum install -y git
    fi

    if check_git; then
        echo -e "${GREEN}✓ Git 安装成功${NC}"
    fi
}

# 检查中间件连接
check_middleware() {
    echo ""
    echo "=== 检查中间件连接 ==="

    # 检查 MySQL
    if command -v mysql &> /dev/null; then
        if mysql -h localhost -P 3306 -u metapulse -pmetapulse -e "SELECT 1" &> /dev/null; then
            echo -e "${GREEN}✓${NC} MySQL 连接成功 (localhost:3306)"
        else
            echo -e "${YELLOW}⚠${NC} MySQL 连接失败，请检查配置"
        fi
    else
        if nc -z localhost 3306 2>/dev/null; then
            echo -e "${GREEN}✓${NC} MySQL 端口开放 (localhost:3306)"
        else
            echo -e "${YELLOW}⚠${NC} MySQL 端口未开放 (localhost:3306)"
        fi
    fi

    # 检查 Elasticsearch
    if curl -s http://localhost:9200 &> /dev/null; then
        echo -e "${GREEN}✓${NC} Elasticsearch 连接成功 (localhost:9200)"
    else
        echo -e "${YELLOW}⚠${NC} Elasticsearch 连接失败"
    fi

    # 检查 Kafka
    if nc -z localhost 9092 2>/dev/null; then
        echo -e "${GREEN}✓${NC} Kafka 端口开放 (localhost:9092)"
    else
        echo -e "${YELLOW}⚠${NC} Kafka 端口未开放 (localhost:9092)"
    fi
}

# 检查磁盘空间
check_disk() {
    echo ""
    echo "=== 检查磁盘空间 ==="

    AVAILABLE=$(df -h . | awk 'NR==2 {print $4}')
    echo "可用空间: $AVAILABLE"

    AVAILABLE_GB=$(df -BG . | awk 'NR==2 {print $4}' | sed 's/G//')
    if [ "$AVAILABLE_GB" -lt 5 ]; then
        echo -e "${YELLOW}⚠ 磁盘空间不足 5GB，建议清理${NC}"
    else
        echo -e "${GREEN}✓ 磁盘空间充足${NC}"
    fi
}

# 检查内存
check_memory() {
    echo ""
    echo "=== 检查内存 ==="

    TOTAL_MEM=$(free -h | awk '/^Mem:/ {print $2}')
    AVAILABLE_MEM=$(free -h | awk '/^Mem:/ {print $7}')
    echo "总内存: $TOTAL_MEM"
    echo "可用内存: $AVAILABLE_MEM"

    AVAILABLE_MEM_GB=$(free -g | awk '/^Mem:/ {print $7}')
    if [ "$AVAILABLE_MEM_GB" -lt 2 ]; then
        echo -e "${YELLOW}⚠ 可用内存不足 2GB，运行可能较慢${NC}"
    else
        echo -e "${GREEN}✓ 内存充足${NC}"
    fi
}

# 设置 JAVA_HOME
setup_java_home() {
    echo ""
    echo "=== 配置 JAVA_HOME ==="

    JAVA_PATH=$(readlink -f $(which java))
    JAVA_HOME_PATH=$(dirname $(dirname $JAVA_PATH))

    if grep -q "JAVA_HOME" ~/.bashrc; then
        echo "JAVA_HOME 已配置"
    else
        echo "export JAVA_HOME=$JAVA_HOME_PATH" >> ~/.bashrc
        echo "export PATH=\$JAVA_HOME/bin:\$PATH" >> ~/.bashrc
        echo -e "${GREEN}✓ JAVA_HOME 已添加到 ~/.bashrc${NC}"
        echo "请执行: source ~/.bashrc"
    fi

    echo "JAVA_HOME=$JAVA_HOME_PATH"
}

# 主流程
main() {
    detect_os

    # 检查环境
    NEED_INSTALL=false

    if ! check_java; then
        NEED_INSTALL=true
        INSTALL_JAVA=true
    fi

    if ! check_git; then
        NEED_INSTALL=true
        INSTALL_GIT=true
    fi

    check_middleware
    check_disk
    check_memory

    # 询问是否安装
    if [ "$NEED_INSTALL" = true ]; then
        echo ""
        echo "================================="
        echo "需要安装以下软件:"
        [ "$INSTALL_JAVA" = true ] && echo "  - OpenJDK 17"
        [ "$INSTALL_GIT" = true ] && echo "  - Git"
        echo "================================="

        read -p "是否继续安装? (y/n): " -n 1 -r
        echo
        if [[ $REPLY =~ ^[Yy]$ ]]; then
            [ "$INSTALL_JAVA" = true ] && install_java
            [ "$INSTALL_GIT" = true ] && install_git
            setup_java_home
        fi
    else
        echo ""
        echo -e "${GREEN}=================================${NC}"
        echo -e "${GREEN}✓ 所有必需环境已就绪！${NC}"
        echo -e "${GREEN}=================================${NC}"
        setup_java_home
    fi

    echo ""
    echo "=== 下一步 ==="
    echo "1. 克隆代码: git clone <your-repo-url> metapulse"
    echo "2. 进入目录: cd metapulse/backend"
    echo "3. 构建项目: ./gradlew :metadata-service:war:build -x test"
    echo "4. 启动应用: java -jar metadata-service/war/build/libs/war.war"
}

# 执行主流程
main

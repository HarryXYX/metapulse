#!/bin/bash
set -e

echo "🚀 MetaPulse 项目环境初始化"
echo "================================"

# 检查 Java 环境
echo "📋 检查 Java 环境..."
if ! command -v java &> /dev/null; then
    echo "❌ 未找到 Java，请安装 JDK 17+"
    exit 1
fi
java_version=$(java -version 2>&1 | awk -F '"' '/version/ {print $2}' | cut -d'.' -f1)
if [ "$java_version" -lt 17 ]; then
    echo "❌ Java 版本过低，需要 JDK 17+，当前版本: $java_version"
    exit 1
fi
echo "✅ Java 版本: $(java -version 2>&1 | head -n 1)"

# 检查 Node.js 环境
echo ""
echo "📋 检查 Node.js 环境..."
if ! command -v node &> /dev/null; then
    echo "❌ 未找到 Node.js，请安装 Node.js 18+"
    exit 1
fi
node_version=$(node -v | cut -d'v' -f2 | cut -d'.' -f1)
if [ "$node_version" -lt 18 ]; then
    echo "⚠️  Node.js 版本建议 18+，当前: $(node -v)"
fi
echo "✅ Node.js 版本: $(node -v)"

# 检查 Yarn
echo ""
echo "📋 检查 Yarn..."
if ! command -v yarn &> /dev/null; then
    echo "⚙️  安装 Yarn..."
    npm install -g yarn
fi
echo "✅ Yarn 版本: $(yarn -v)"

# 初始化后端
echo ""
echo "🔧 初始化后端环境..."
cd backend
./gradlew --version
echo "✅ Gradle 环境正常"
cd ..

# 初始化前端
echo ""
echo "🔧 初始化前端环境..."
cd frontend
echo "📦 安装前端依赖..."
yarn install
echo "✅ 前端依赖安装完成"
cd ..

# 复制环境变量文件
echo ""
echo "📝 配置环境变量..."
if [ ! -f .env ]; then
    if [ -f .env.example ]; then
        cp .env.example .env
        echo "✅ 已创建 .env 文件，请根据需要修改配置"
    else
        echo "⚠️  未找到 .env.example 文件"
    fi
else
    echo "ℹ️  .env 文件已存在"
fi

# 验证前端环境变量文件
if [ ! -f frontend/.env.development ]; then
    echo "⚠️  前端开发环境配置文件不存在: frontend/.env.development"
else
    echo "✅ 前端开发环境配置文件已就绪"
fi

# 启动 Docker 服务（可选）
echo ""
echo "🐳 Docker 服务配置..."
read -p "是否启动 Docker 服务 (PostgreSQL, Elasticsearch, Kafka)? (y/n): " -n 1 -r
echo
if [[ $REPLY =~ ^[Yy]$ ]]; then
    if ! command -v docker &> /dev/null; then
        echo "❌ 未找到 Docker，请先安装 Docker"
    else
        docker-compose up -d postgres elasticsearch kafka
        echo "✅ Docker 服务已启动"
        echo "ℹ️  等待服务就绪（约 30 秒）..."
        sleep 30
    fi
fi

echo ""
echo "✅ 环境初始化完成！"
echo ""
echo "📚 下一步操作："
echo "  1. 检查并修改 .env 文件配置"
echo "  2. 启动后端: cd backend && ./gradlew bootRun"
echo "  3. 启动前端: cd frontend && yarn dev"
echo "  4. 或使用快捷脚本:"
echo "     - ./scripts/dev.sh backend  # 仅启动后端"
echo "     - ./scripts/dev.sh frontend # 仅启动前端"
echo "  5. 完整构建: ./scripts/build.sh"
echo ""

#!/bin/bash
set -e

echo "🚀 MetaPulse 本地开发环境初始化"
echo "================================"
echo ""

# 检查 Java 环境
echo "📋 检查 Java 环境..."
if ! command -v java &> /dev/null; then
    echo "❌ 未找到 Java，请安装 JDK 17+"
    echo "   下载地址: https://adoptium.net/"
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
    echo "   下载地址: https://nodejs.org/"
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

# 验证 Gradle Wrapper
echo ""
echo "🔧 验证后端环境..."
cd "$(dirname "$0")/../../backend"
if [ ! -f "gradlew" ]; then
    echo "❌ 未找到 Gradle Wrapper (gradlew)"
    exit 1
fi
./gradlew --version > /dev/null 2>&1
echo "✅ Gradle 环境正常"
cd - > /dev/null

# 安装前端依赖
echo ""
echo "📦 安装前端依赖..."
cd "$(dirname "$0")/../../frontend"

if [ -d "node_modules" ]; then
    echo "ℹ️  node_modules 已存在，跳过安装"
    read -p "是否重新安装？(y/n): " -n 1 -r
    echo
    if [[ $REPLY =~ ^[Yy]$ ]]; then
        rm -rf node_modules yarn.lock
        yarn install
    fi
else
    yarn install
fi
echo "✅ 前端依赖安装完成"
cd - > /dev/null

# 验证配置文件
echo ""
echo "📝 检查配置文件..."

# 检查后端配置
BACKEND_CONFIG="$(dirname "$0")/../../backend/metadata-service/war/src/main/resources/application-dev.yml"
if [ -f "$BACKEND_CONFIG" ]; then
    echo "✅ 后端开发配置: application-dev.yml"
else
    echo "⚠️  未找到后端开发配置文件"
fi

# 检查前端配置
FRONTEND_CONFIG="$(dirname "$0")/../../frontend/.env.development"
if [ -f "$FRONTEND_CONFIG" ]; then
    echo "✅ 前端开发配置: .env.development"
else
    echo "⚠️  未找到前端开发配置文件"
fi

# 完成提示
echo ""
echo "================================"
echo "✅ 本地开发环境初始化完成！"
echo ""
echo "📚 下一步操作："
echo ""
echo "1️⃣  在服务器 (47.80.65.112) 上启动依赖服务："
echo "   ssh user@47.80.65.112"
echo "   cd /path/to/metapulse"
echo "   ./scripts/deploy/deps-only.sh"
echo ""
echo "2️⃣  本地启动后端（IntelliJ IDEA）："
echo "   • 打开 backend 目录"
echo "   • 运行配置: GMSApplication-dev"
echo "   • Active profiles: dev"
echo "   或命令行："
echo "   cd backend && ./gradlew bootRun --args='--spring.profiles.active=dev'"
echo ""
echo "3️⃣  本地启动前端（VSCode）："
echo "   cd frontend && yarn dev"
echo ""
echo "4️⃣  访问应用："
echo "   • 前端: http://localhost:3000"
echo "   • 后端: http://localhost:8080"
echo "   • GraphQL: http://localhost:8080/api/graphql"
echo ""

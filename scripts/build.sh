#!/bin/bash
set -e

echo "🏗️  MetaPulse 完整构建流程"
echo "================================"

BUILD_MODE=${1:-full}
SKIP_TESTS=${2:-false}

# 构建前端
build_frontend() {
    echo ""
    echo "📦 [1/3] 构建前端应用..."
    cd frontend

    # 清理旧构建产物
    rm -rf dist

    # 检查依赖
    if [ ! -d "node_modules" ]; then
        echo "📥 安装前端依赖..."
        yarn install
    fi

    # 执行构建
    echo "⚙️  执行前端构建..."
    NODE_ENV=production yarn build

    # 验证构建产物
    if [ ! -d "dist" ] || [ -z "$(ls -A dist)" ]; then
        echo "❌ 前端构建失败"
        exit 1
    fi

    echo "✅ 前端构建完成: $(du -sh dist | cut -f1)"
    cd ..
}

# 集成前端资源到后端
integrate_frontend() {
    echo ""
    echo "🔗 [2/3] 集成前端资源到后端..."

    STATIC_DIR="backend/metadata-service/war/src/main/resources/static"

    # 清理旧资源
    rm -rf "$STATIC_DIR"
    mkdir -p "$STATIC_DIR"

    # 复制前端构建产物
    cp -r frontend/dist/* "$STATIC_DIR/"

    echo "✅ 前端资源集成完成 ($(du -sh $STATIC_DIR | cut -f1))"
}

# 构建后端
build_backend() {
    echo ""
    echo "🏗️  [3/3] 构建后端应用..."
    cd backend

    if [ "$SKIP_TESTS" = "true" ]; then
        echo "⚠️  跳过测试"
        ./gradlew clean build -x test
    else
        echo "🧪 运行测试..."
        ./gradlew clean build
    fi

    # 验证构建产物
    WAR_FILE="metadata-service/war/build/libs/war.war"
    if [ ! -f "$WAR_FILE" ]; then
        echo "❌ 后端构建失败"
        exit 1
    fi

    echo "✅ 后端构建完成: $(du -sh $WAR_FILE | cut -f1)"
    cd ..
}

# 执行构建
case $BUILD_MODE in
  full)
    echo "🔨 完整构建模式"
    build_frontend
    integrate_frontend
    build_backend
    ;;

  backend-only)
    echo "🔨 仅构建后端"
    build_backend
    ;;

  frontend-only)
    echo "🔨 仅构建前端"
    build_frontend
    ;;

  help|--help|-h)
    echo "MetaPulse 构建脚本"
    echo ""
    echo "用法: ./scripts/build.sh [模式] [选项]"
    echo ""
    echo "模式:"
    echo "  full            - 完整构建（前端 + 后端）[默认]"
    echo "  backend-only    - 仅构建后端"
    echo "  frontend-only   - 仅构建前端"
    echo "  help            - 显示此帮助信息"
    echo ""
    echo "选项:"
    echo "  skip-tests      - 跳过测试（仅在构建后端时有效）"
    echo ""
    echo "示例:"
    echo "  ./scripts/build.sh                    # 完整构建（包含测试）"
    echo "  ./scripts/build.sh full skip-tests    # 完整构建（跳过测试）"
    echo "  ./scripts/build.sh backend-only       # 仅构建后端"
    echo "  ./scripts/build.sh frontend-only      # 仅构建前端"
    echo ""
    exit 0
    ;;

  *)
    echo "❌ 未知构建模式: $BUILD_MODE"
    echo "运行 './scripts/build.sh help' 查看帮助信息"
    exit 1
    ;;
esac

# 构建摘要
echo ""
echo "================================"
echo "✅ 构建完成！"
echo ""
echo "📦 构建产物:"
if [ -d "frontend/dist" ]; then
    echo "  - 前端: frontend/dist ($(du -sh frontend/dist | cut -f1))"
fi
if [ -f "backend/metadata-service/war/build/libs/war.war" ]; then
    echo "  - 后端: backend/metadata-service/war/build/libs/war.war ($(du -sh backend/metadata-service/war/build/libs/war.war | cut -f1))"
fi
echo ""
echo "🚀 部署命令:"
echo "  java -jar backend/metadata-service/war/build/libs/war.war"
echo "  或"
echo "  docker-compose -f docker-compose.yml up"
echo ""

#!/bin/bash
set -e

echo "🏗️  MetaPulse 应用构建"
echo "========================================"
echo "内存配置: 保守优化为 8GB 内存环境"
echo "  • 前端: 2GB Node.js 堆内存"
echo "  • 后端: 2GB Gradle JVM 堆内存"
echo "  • Workers: 单线程（降低并发开销）"
echo "  • 系统保留: ~4GB（充足冗余）"
echo "========================================"
echo ""

BUILD_MODE=${1:-full}
SKIP_TESTS=${2:-false}

# 进入项目目录
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"
cd "$PROJECT_ROOT"

# 构建前端
build_frontend() {
    echo "📦 [1/3] 构建前端应用..."
    cd frontend

    # 清理旧构建产物
    if [ -d "dist" ]; then
        echo "   清理旧构建产物..."
        rm -rf dist
    fi

    # 检查依赖
    if [ ! -d "node_modules" ]; then
        echo "   📥 安装前端依赖..."
        yarn install
    fi

    # 执行构建
    echo "   ⚙️  执行前端构建..."
    NODE_ENV=production yarn build

    # 验证构建产物
    if [ ! -d "dist" ] || [ -z "$(ls -A dist)" ]; then
        echo "   ❌ 前端构建失败"
        exit 1
    fi

    BUILD_SIZE=$(du -sh dist | cut -f1)
    echo "   ✅ 前端构建完成: $BUILD_SIZE"

    # 清理缓存释放内存
    echo "   🧹 清理构建缓存..."
    rm -rf node_modules/.cache 2>/dev/null || true
    rm -rf .vite 2>/dev/null || true

    cd ..
}

# 集成前端资源到后端
integrate_frontend() {
    echo ""
    echo "🔗 [2/3] 集成前端资源到后端..."

    STATIC_DIR="backend/metadata-service/war/src/main/resources/static"

    # 清理旧资源
    if [ -d "$STATIC_DIR" ]; then
        echo "   清理旧静态资源..."
        rm -rf "$STATIC_DIR"
    fi
    mkdir -p "$STATIC_DIR"

    # 复制前端构建产物
    echo "   复制前端资源..."
    cp -r frontend/dist/* "$STATIC_DIR/"

    STATIC_SIZE=$(du -sh "$STATIC_DIR" | cut -f1)
    echo "   ✅ 前端资源集成完成: $STATIC_SIZE"
}

# 构建后端
build_backend() {
    echo ""
    echo "🏗️  [3/3] 构建后端应用..."
    cd backend

    # 清理旧构建产物
    echo "   清理旧构建产物..."
    ./gradlew clean

    # 执行构建
    if [ "$SKIP_TESTS" = "skip-tests" ] || [ "$SKIP_TESTS" = "true" ]; then
        echo "   ⚠️  跳过测试和spotless"
        ./gradlew build -x test -x spotlessCheck
    else
        echo "   🧪 运行测试并构建..."
        ./gradlew build
    fi

    # 验证构建产物
    WAR_FILE="metadata-service/war/build/libs/war.war"
    if [ ! -f "$WAR_FILE" ]; then
        echo "   ❌ 后端构建失败: 未找到 WAR 包"
        exit 1
    fi

    WAR_SIZE=$(du -sh "$WAR_FILE" | cut -f1)
    echo "   ✅ 后端构建完成: $WAR_SIZE"
    cd ..
}

# 显示帮助
show_help() {
    echo "MetaPulse 应用构建脚本"
    echo ""
    echo "用法: ./scripts/deploy/build.sh [模式] [选项]"
    echo ""
    echo "模式:"
    echo "  full            - 完整构建（前端 + 后端）[默认]"
    echo "  backend-only    - 仅构建后端"
    echo "  frontend-only   - 仅构建前端"
    echo "  help            - 显示此帮助信息"
    echo ""
    echo "选项:"
    echo "  skip-tests      - 跳过后端测试"
    echo ""
    echo "示例:"
    echo "  ./scripts/deploy/build.sh                    # 完整构建（包含测试）"
    echo "  ./scripts/deploy/build.sh full skip-tests    # 完整构建（跳过测试）"
    echo "  ./scripts/deploy/build.sh backend-only       # 仅构建后端"
    echo "  ./scripts/deploy/build.sh frontend-only      # 仅构建前端"
    echo ""
    exit 0
}

# 执行构建
case $BUILD_MODE in
    full)
        echo "🔨 完整构建模式（分步执行，避免内存峰值）"
        echo ""
        build_frontend

        # 等待内存释放
        echo ""
        echo "⏸️  暂停 10 秒，等待内存释放..."
        sleep 10

        integrate_frontend

        # 再次等待内存释放
        echo ""
        echo "⏸️  暂停 10 秒，等待内存释放..."
        sleep 10

        build_backend
        ;;

    backend-only)
        echo "🔨 仅构建后端"
        echo ""
        build_backend
        ;;

    frontend-only)
        echo "🔨 仅构建前端"
        echo ""
        build_frontend
        ;;

    help|--help|-h)
        show_help
        ;;

    *)
        echo "❌ 未知构建模式: $BUILD_MODE"
        echo "运行 './scripts/deploy/build.sh help' 查看帮助信息"
        exit 1
        ;;
esac

# 构建摘要
echo ""
echo "========================================"
echo "✅ 构建完成！"
echo ""
echo "📦 构建产物:"

if [ -d "frontend/dist" ]; then
    FRONTEND_SIZE=$(du -sh frontend/dist | cut -f1)
    echo "  • 前端: frontend/dist ($FRONTEND_SIZE)"
fi

if [ -f "backend/metadata-service/war/build/libs/war.war" ]; then
    WAR_SIZE=$(du -sh backend/metadata-service/war/build/libs/war.war | cut -f1)
    echo "  • 后端: backend/metadata-service/war/build/libs/war.war ($WAR_SIZE)"
fi

echo ""
echo "🚀 部署方式："
echo ""
echo "  方式1 - 直接运行 WAR 包:"
echo "    java -jar backend/metadata-service/war/build/libs/war.war"
echo ""
echo "  方式2 - 使用 Docker Compose:"
echo "    ./scripts/deploy/full.sh"
echo ""
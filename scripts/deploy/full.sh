#!/bin/bash
set -e

echo "🚀 部署 MetaPulse 完整应用"
echo "========================================"
echo ""
echo "ℹ️  此脚本部署所有服务（依赖 + 应用）"
echo "   适用于: 演示、测试、生产部署"
echo ""

# 检查 Docker
if ! command -v docker &> /dev/null; then
    echo "❌ 未找到 Docker，请先安装 Docker"
    exit 1
fi

if ! docker ps &> /dev/null; then
    echo "❌ Docker 未运行或权限不足"
    exit 1
fi

# 进入项目目录
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"
cd "$PROJECT_ROOT"

# 检查配置文件
if [ ! -f "docker-compose.yml" ]; then
    echo "❌ 未找到 docker-compose.yml"
    exit 1
fi

# 检查构建产物
WAR_FILE="backend/metadata-service/war/build/libs/war.war"
if [ ! -f "$WAR_FILE" ]; then
    echo "⚠️  未找到 WAR 包: $WAR_FILE"
    echo ""
    read -p "是否先执行构建？(y/n): " -n 1 -r
    echo ""
    if [[ $REPLY =~ ^[Yy]$ ]]; then
        echo "🏗️  执行构建..."
        ./scripts/deploy/build.sh full skip-tests
        echo ""
    else
        echo "❌ 需要先构建应用"
        echo "   运行: ./scripts/deploy/build.sh"
        exit 1
    fi
fi

# 显示当前状态
echo "📋 当前服务状态："
docker-compose ps 2>/dev/null || echo "   (无运行中的服务)"
echo ""

# 询问操作
echo "选择操作："
echo "  1 - 启动所有服务"
echo "  2 - 重启所有服务"
echo "  3 - 停止所有服务"
echo "  4 - 查看应用日志"
echo "  5 - 重新构建并部署"
read -p "请选择 [1-5]: " -n 1 -r
echo ""

case $REPLY in
    1)
        echo "🚀 启动所有服务..."
        docker-compose up -d
        echo ""
        echo "⏳ 等待应用就绪（约 60 秒）..."
        echo "   (应用启动需要初始化 Consumers)"
        sleep 60
        echo ""
        echo "📊 服务状态："
        docker-compose ps
        echo ""
        echo "🧪 验证应用健康状态..."
        if curl -f http://localhost:8080/actuator/health &> /dev/null; then
            echo "✅ 应用已就绪！"
        else
            echo "⚠️  应用可能还在启动中，请稍后访问"
        fi
        ;;
    2)
        echo "🔄 重启所有服务..."
        docker-compose restart
        echo ""
        echo "⏳ 等待应用就绪（约 60 秒）..."
        sleep 60
        echo ""
        echo "📊 服务状态："
        docker-compose ps
        echo ""
        echo "✅ 服务已重启！"
        ;;
    3)
        echo "🛑 停止所有服务..."
        docker-compose stop
        echo ""
        echo "✅ 所有服务已停止"
        ;;
    4)
        echo "📋 查看应用日志（Ctrl+C 退出）..."
        echo ""
        docker-compose logs -f metapulse
        ;;
    5)
        echo "🏗️  重新构建并部署..."
        echo ""

        # 停止当前服务
        echo "1️⃣  停止当前服务..."
        docker-compose down

        # 执行构建
        echo ""
        echo "2️⃣  执行构建..."
        ./scripts/deploy/build.sh full skip-tests

        # 启动服务
        echo ""
        echo "3️⃣  启动服务..."
        docker-compose up -d

        echo ""
        echo "⏳ 等待应用就绪（约 60 秒）..."
        sleep 60

        echo ""
        echo "📊 服务状态："
        docker-compose ps

        echo ""
        echo "✅ 重新部署完成！"
        ;;
    *)
        echo "❌ 无效选项"
        exit 1
        ;;
esac

echo ""
echo "================================"
echo "📚 访问地址："
echo ""
echo "  • 前端应用:      http://localhost:8080"
echo "  • GraphQL API:   http://localhost:8080/api/graphql"
echo "  • 健康检查:      http://localhost:8080/actuator/health"
echo ""
echo "📚 常用命令："
echo ""
echo "  • 查看状态:      docker-compose ps"
echo "  • 查看应用日志:  docker-compose logs -f metapulse"
echo "  • 查看所有日志:  docker-compose logs -f"
echo "  • 重启应用:      docker-compose restart metapulse"
echo "  • 停止服务:      docker-compose stop"
echo "  • 删除容器:      docker-compose down"
echo ""
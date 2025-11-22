#!/bin/bash
set -e

echo "🐳 启动 MetaPulse 依赖服务（开发模式）"
echo "========================================"
echo ""
echo "ℹ️  此脚本仅启动依赖服务，供本地开发使用"
echo "   服务器 IP: 47.80.65.112"
echo "   - PostgreSQL    :5432"
echo "   - Elasticsearch :9200"
echo "   - Kafka         :9092"
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
if [ ! -f "docker-compose.services.yml" ]; then
    echo "❌ 未找到 docker-compose.services.yml"
    exit 1
fi

# 显示当前状态
echo "📋 当前服务状态："
docker compose -f docker-compose.services.yml ps 2>/dev/null || echo "   (无运行中的服务)"
echo ""

# 询问操作
read -p "选择操作 [1=启动, 2=重启, 3=停止, 4=查看日志]: " -n 1 -r
echo ""

case $REPLY in
    1)
        echo "🚀 启动依赖服务..."
        docker compose -f docker-compose.services.yml up -d
        echo ""
        echo "⏳ 等待服务就绪（约 30 秒）..."
        sleep 30
        echo ""
        echo "📊 服务状态："
        docker compose -f docker-compose.services.yml ps
        echo ""
        echo "✅ 依赖服务已启动！"
        ;;
    2)
        echo "🔄 重启依赖服务..."
        docker compose -f docker-compose.services.yml restart
        echo ""
        echo "⏳ 等待服务就绪（约 30 秒）..."
        sleep 30
        echo ""
        echo "📊 服务状态："
        docker compose -f docker-compose.services.yml ps
        echo ""
        echo "✅ 依赖服务已重启！"
        ;;
    3)
        echo "🛑 停止依赖服务..."
        docker compose -f docker-compose.services.yml stop
        echo ""
        echo "✅ 依赖服务已停止"
        ;;
    4)
        echo "📋 查看服务日志（Ctrl+C 退出）..."
        docker compose -f docker-compose.services.yml logs -f
        ;;
    *)
        echo "❌ 无效选项"
        exit 1
        ;;
esac

echo ""
echo "================================"
echo "📚 常用命令："
echo ""
echo "  • 查看状态:  docker compose -f docker-compose.services.yml ps"
echo "  • 查看日志:  docker compose -f docker-compose.services.yml logs -f"
echo "  • 重启服务:  docker compose -f docker-compose.services.yml restart"
echo "  • 停止服务:  docker compose -f docker-compose.services.yml stop"
echo "  • 删除容器:  docker compose -f docker-compose.services.yml down"
echo ""
echo "🧪 服务验证："
echo ""
echo "  • PostgreSQL:     psql -h localhost -U metapulse -d metapulse -p 5432"
echo "  • Elasticsearch:  curl http://localhost:9200/_cluster/health"
echo "  • Kafka:          kcat -L -b localhost:9092"
echo ""
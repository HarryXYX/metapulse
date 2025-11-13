#!/bin/bash
set -e

MODE=${1:-help}

case $MODE in
  backend)
    echo "🚀 启动后端开发服务器..."
    cd backend
    ./gradlew bootRun --args='--spring.profiles.active=development'
    ;;

  frontend)
    echo "🚀 启动前端开发服务器..."
    echo "ℹ️  前端将运行在 http://localhost:3000"
    echo "ℹ️  API 请求将代理到后端 http://localhost:8080"
    cd frontend
    yarn dev
    ;;

  all)
    echo "🚀 启动完整开发环境..."
    echo ""
    echo "⚠️  建议使用两个终端分别运行:"
    echo "    终端1: ./scripts/dev.sh backend"
    echo "    终端2: ./scripts/dev.sh frontend"
    echo ""
    echo "或者使用 Docker Compose:"
    echo "    docker-compose up"
    echo ""
    ;;

  help|--help|-h)
    echo "MetaPulse 开发环境启动脚本"
    echo ""
    echo "用法: ./scripts/dev.sh [模式]"
    echo ""
    echo "模式:"
    echo "  backend   - 仅启动后端服务 (端口 8080)"
    echo "  frontend  - 仅启动前端服务 (端口 3000)"
    echo "  all       - 显示完整环境启动说明"
    echo "  help      - 显示此帮助信息"
    echo ""
    echo "示例:"
    echo "  ./scripts/dev.sh backend   # 启动后端"
    echo "  ./scripts/dev.sh frontend  # 启动前端"
    echo ""
    ;;

  *)
    echo "❌ 未知模式: $MODE"
    echo "运行 './scripts/dev.sh help' 查看帮助信息"
    exit 1
    ;;
esac

#!/bin/bash
# MetaPulse Backend 启动脚本（包含 Kafka Consumers）
# 用法：bash start-with-consumers.sh

echo "正在启动 MetaPulse 后端服务（All-in-One 模式：Web + Kafka Consumers）..."

# 设置 JVM 参数
JVM_OPTS="-Xmx2g -Xms512m"

# 设置 Spring 配置
SPRING_OPTS="-Dspring.profiles.active=dev"
SPRING_OPTS="$SPRING_OPTS -Dauthentication.enabled=false"

# 🔑 关键配置：启用所有 Kafka Consumers
CONSUMER_OPTS="-DMCE_CONSUMER_ENABLED=true"
CONSUMER_OPTS="$CONSUMER_OPTS -DMCP_CONSUMER_ENABLED=true"
CONSUMER_OPTS="$CONSUMER_OPTS -DMAE_CONSUMER_ENABLED=true"
CONSUMER_OPTS="$CONSUMER_OPTS -DPE_CONSUMER_ENABLED=true"

# Kafka 配置（如果需要覆盖）
# KAFKA_OPTS="-DKAFKA_BOOTSTRAP_SERVER=47.80.65.112:9092"

# 数据库配置（如果需要覆盖）
# DB_OPTS="-DDB_HOST=47.80.65.112 -DDB_PORT=3306"

# 合并所有参数
ALL_OPTS="$JVM_OPTS $SPRING_OPTS $CONSUMER_OPTS $KAFKA_OPTS $DB_OPTS"

# 启动应用
WAR_FILE="metadata-service/war/build/libs/war.war"

if [ ! -f "$WAR_FILE" ]; then
    echo "错误：找不到 WAR 文件：$WAR_FILE"
    echo "请先运行 ./gradlew build 构建项目"
    exit 1
fi

echo "启动参数：$ALL_OPTS"
echo ""
echo "正在启动服务..."
echo "日志输出到：logs/metapulse.log"
echo "使用 Ctrl+C 停止服务"
echo ""

# 创建日志目录
mkdir -p logs

# 启动服务并输出日志
java $ALL_OPTS -jar "$WAR_FILE" 2>&1 | tee logs/metapulse.log

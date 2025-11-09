# SwotData - All-in-One 元数据管理平台

基于DataHub的二次开发项目，采用完全单体架构（Web服务 + Kafka Consumers集成）。

## 🏗️ 架构特点

- ✅ **All-in-One部署**：单个JAR包包含所有功能
- ✅ **Web服务**：REST API + GraphQL + OpenAPI
- ✅ **Kafka Consumers**：MCE/MAE/PE消费者内置
- ✅ **无微服务依赖**：不需要服务发现、API网关等
- ✅ **资源高效**：单JVM，共享连接池和缓存

## 📋 前置要求

- Java 17+
- Docker & Docker Compose
- 至少8GB内存
- 至少20GB磁盘空间

## 🚀 快速启动

### 1. 复制环境配置

```bash
cp .env.example .env
# 根据需要修改.env中的配置
```

### 2. 构建项目

```bash
# 清理并构建
./gradlew clean build -x test

# 检查war包
ls -lh metadata-service/war/build/libs/war.war
```

### 3. 启动基础设施

```bash
# 启动PostgreSQL, Elasticsearch, Kafka
docker-compose up -d postgres elasticsearch kafka zookeeper

# 等待所有服务健康
docker-compose ps
```

### 4. 启动SwotData应用

#### 方式A：使用Docker（推荐）

```bash
# 构建并启动所有服务
docker-compose up -d

# 查看日志
docker-compose logs -f swotdata
```

#### 方式B：本地运行（开发模式）

```bash
# 使用Gradle
./gradlew :metadata-service:war:bootRun

# 或直接运行JAR
java -Xms2g -Xmx4g \\
  -DMAE_CONSUMER_ENABLED=true \\
  -DMCE_CONSUMER_ENABLED=true \\
  -DMCP_CONSUMER_ENABLED=true \\
  -jar metadata-service/war/build/libs/war.war
```

### 5. 验证部署

```bash
# 检查健康状态
curl http://localhost:8080/health

# 检查配置
curl http://localhost:8080/config

# 测试GraphQL API
curl -X POST http://localhost:8080/api/graphql \\
  -H "Content-Type: application/json" \\
  -d '{"query": "{ __schema { types { name } } }"}'
```

## 📊 监控端点

- Health Check: http://localhost:8080/actuator/health
- Metrics: http://localhost:8080/actuator/metrics
- Prometheus: http://localhost:8080/actuator/prometheus

## 🔧 配置说明

### All-in-One模式关键配置

在`application.yml`或环境变量中设置：

```yaml
# 启用所有Consumer（All-in-One模式）
MAE_CONSUMER_ENABLED: true
MCE_CONSUMER_ENABLED: true
MCP_CONSUMER_ENABLED: true
PE_CONSUMER_ENABLED: true

# 使用本地JavaEntityClient（无HTTP调用）
entityClient:
  impl: java
```

### 资源配置建议

| 环境 | CPU | 内存 | 磁盘 |
|------|-----|------|------|
| 开发 | 2核 | 4GB | 20GB |
| 测试 | 4核 | 8GB | 50GB |
| 生产（小规模） | 4核 | 8GB | 100GB |
| 生产（中规模） | 8核 | 16GB | 200GB |

## 🛠️ 常用命令

```bash
# 查看所有服务状态
docker-compose ps

# 停止所有服务
docker-compose down

# 停止并删除数据卷（⚠️ 会删除所有数据）
docker-compose down -v

# 重启SwotData应用
docker-compose restart swotdata

# 查看应用日志
docker-compose logs -f swotdata

# 进入应用容器
docker-compose exec swotdata sh
```

## 📁 项目结构

```
swotdata/
├── metadata-service/        # Web服务模块
│   ├── war/                # 主应用（All-in-One）
│   ├── factories/          # Spring Bean工厂
│   ├── *-servlet-impl/     # 各种Servlet实现
│   └── ...
├── metadata-jobs/          # Kafka Consumer模块
│   ├── mce-consumer/      # 元数据变更事件消费者
│   ├── mae-consumer/      # 元数据审计事件消费者
│   └── pe-consumer/       # 平台事件消费者
├── metadata-models/        # 数据模型
├── metadata-io/           # IO操作
├── docker/                # Docker配置
├── docker-compose.yml     # Docker Compose配置
└── README.md             # 本文件
```

## ⚠️ 注意事项

1. **内存要求**：All-in-One模式需要至少4GB JVM堆内存
2. **端口占用**：确保8080(App)、5432(PG)、9200(ES)、9092(Kafka)端口可用
3. **Consumer延迟**：监控Kafka Consumer lag，如有堆积可增加并发数
4. **数据库连接**：默认连接池50，根据负载调整

## 🐛 故障排查

### 应用启动失败

```bash
# 查看详细日志
docker-compose logs swotdata

# 检查JVM内存是否足够
docker-compose exec swotdata sh -c 'echo $JAVA_OPTS'

# 检查数据库连接
docker-compose exec swotdata sh -c 'nc -zv postgres 5432'
```

### Consumer消费延迟

```bash
# 检查Kafka Consumer lag
docker-compose exec kafka kafka-consumer-groups \\
  --bootstrap-server localhost:29092 \\
  --describe --group swotdata-consumers

# 增加Consumer并发（修改application.yml）
kafka.listeners.concurrency: 8  # 从4增加到8
```

### 数据库连接池耗尽

```bash
# 修改application.yml
spring.datasource.hikari.maximum-pool-size: 100  # 从50增加到100
```

## 📝 开发指南

### 添加新功能

1. 修改相应的模块代码
2. 重新构建：`./gradlew clean build -x test`
3. 重启应用：`docker-compose restart swotdata`

### 调试模式

```bash
# 启用远程调试
JAVA_OPTS="-Xms2g -Xmx4g -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" \\
./gradlew :metadata-service:war:bootRun
```

## 📚 相关文档

- [DataHub官方文档](https://datahubproject.io/docs/)
- [Spring Boot文档](https://spring.io/projects/spring-boot)
- [Kafka文档](https://kafka.apache.org/documentation/)

## 🤝 贡献

本项目基于DataHub进行二次开发，保持与上游项目的兼容性。

## 📄 许可

继承DataHub的Apache 2.0许可证。

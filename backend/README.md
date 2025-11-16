# MetaPulse Backend - 后端开发指南

> All-in-One 架构的元数据管理平台后端服务

---

## 📋 目录

- [架构概览](#-架构概览)
- [技术栈](#-技术栈)
- [快速开始](#-快速开始)
- [项目结构](#-项目结构)
- [开发指南](#-开发指南)
- [构建部署](#-构建部署)
- [配置详解](#-配置详解)
- [常见问题](#-常见问题)

---

## 🏗️ 架构概览

### All-in-One 单体架构

MetaPulse 后端采用 **All-in-One** 架构，将 Web 服务和 Kafka Consumers 整合在一个 WAR 包中。

```
┌──────────────────────────────────────────────┐
│         GMSApplication (单一进程)              │
│                                              │
│  ┌─────────────┐      ┌──────────────────┐ │
│  │  Web 服务    │      │ Kafka Consumers  │ │
│  │             │      │                  │ │
│  │ • REST API  │      │ • MAE Consumer   │ │
│  │ • GraphQL   │      │ • MCE Consumer   │ │
│  │ • Auth      │      │ • PE Consumer    │ │
│  └─────────────┘      └──────────────────┘ │
│                                              │
│         ↓ 共享资源 ↓                          │
│  • 数据库连接池 • 缓存 • 线程池                 │
└──────────────────────────────────────────────┘
         ↓                   ↓
    PostgreSQL          Elasticsearch + Kafka
```

### 关键特性

- ✅ **单一部署单元**：一个 WAR 包包含所有功能
- ✅ **本地方法调用**：EntityClient 使用 `java` 模式，无 HTTP 调用开销
- ✅ **资源共享**：Web 和 Consumer 共享数据库连接池和缓存
- ✅ **简化运维**：一个进程，易于监控、调试和管理

### 与 DataHub 微服务架构的区别

| 特性 | DataHub 微服务 | MetaPulse All-in-One |
|------|---------------|---------------------|
| 部署单元 | GMS + MAE + MCE + PE (4个) | 单一 WAR 包 |
| EntityClient | `restli` (HTTP 调用) | `java` (本地方法调用) |
| 资源占用 | 高（4 个独立 JVM） | 低（1 个 JVM） |
| 运维复杂度 | 高 | 低 |
| 适用场景 | 大规模分布式部署 | 中小规模集中式部署 |

---

## 🔧 技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| **Java** | 17 | 编程语言 |
| **Spring Boot** | 3.4.5 | Web 框架 |
| **Spring Kafka** | 3.3.8 | Kafka 集成 |
| **Gradle** | 8.14.3 | 构建工具 |
| **PostgreSQL** | 14+ | 主数据库 |
| **Elasticsearch** | 8.11.0 | 搜索引擎 |
| **Kafka** | 7.6.0 (Confluent) | 消息队列 |
| **Hibernate** | 6.x | ORM 框架 |
| **GraphQL Java** | - | GraphQL 实现 |

---

## 🚀 快速开始

### 前置要求

- **Java 17+** - [下载链接](https://adoptium.net/)
- **Gradle 8.14+** (使用 Gradle Wrapper，无需手动安装)
- **Docker** (用于运行依赖服务)

### 1. 启动依赖服务

```bash
# 在服务器或本地启动 PostgreSQL, Elasticsearch, Kafka
cd /path/to/metapulse
docker-compose -f docker-compose.services.yml up -d
```

### 2. 编译项目

```bash
cd backend

# 首次编译（包含 PDL → Java 代码生成）
./gradlew :metadata-service:war:classes

# 或完整构建
./gradlew build
```

### 3. 启动应用

```bash
# 方式一：命令行启动
./gradlew bootRun --args='--spring.profiles.active=dev'

# 方式二：直接运行 WAR 包
java -jar metadata-service/war/build/libs/war.war --spring.profiles.active=dev
```

### 4. 验证启动

```bash
# 健康检查
curl http://localhost:8080/actuator/health

# GraphQL Playground
# 浏览器打开: http://localhost:8080/api/graphql
```

---

## 📁 项目结构

### Gradle 模块层次

共 **75 个 Gradle 模块**，按功能分层：

```
backend/
├── metadata-service/           # 服务层（Web + API）
│   ├── war/                   # ⭐ All-in-One WAR 应用（主模块）
│   ├── graphql-servlet-impl/  # GraphQL 实现
│   ├── restli-servlet-impl/   # REST API 实现
│   ├── auth-servlet-impl/     # 认证服务
│   ├── servlet-filter/        # Servlet 过滤器
│   └── configuration/         # 配置管理
│
├── metadata-jobs/             # 消费者层（Kafka Consumers）
│   ├── mae-consumer-job/      # Metadata Audit Event Consumer
│   ├── mce-consumer-job/      # Metadata Change Event Consumer
│   ├── mcp-consumer/          # Metadata Change Proposal Consumer
│   └── pe-consumer/           # Platform Event Consumer
│
├── metadata-io/               # 数据访问层
│   ├── Elasticsearch 操作
│   ├── 数据库 DAO
│   └── 实体操作接口
│
├── metadata-models/           # 数据模型层
│   ├── src/main/pegasus/      # PDL 定义（源文件）
│   └── src/mainGeneratedDataTemplate/  # PDL 生成的 Java 类
│
├── li-utils/                  # 基础工具层
│   ├── 通用工具类
│   ├── 基础数据结构（AuditStamp 等）
│   └── Pegasus 工具
│
├── entity-registry/           # 实体注册表
├── metadata-auth/             # 认证授权模块
└── datahub-graphql-core/      # GraphQL 核心

build.gradle                   # Gradle 根配置
settings.gradle                # 模块配置
gradlew                        # Gradle Wrapper (Unix)
gradlew.bat                    # Gradle Wrapper (Windows)
```

### 模块依赖关系

```
li-utils (基础层)
    ↓
metadata-models (数据模型层)
    ↓
metadata-io (数据访问层)
    ↓
metadata-jobs (消费者层) + metadata-service (服务层)
    ↓
metadata-service/war (All-in-One WAR)
```

### 关键文件

| 文件路径 | 说明 |
|---------|------|
| `metadata-service/war/src/main/java/com/linkedin/gms/GMSApplication.java` | 主应用入口 |
| `metadata-service/war/src/main/resources/application.yml` | 基础配置（环境变量占位符） |
| `metadata-service/war/src/main/resources/application-dev.yml` | 开发环境配置（硬编码服务器 IP） |
| `build.gradle` | Gradle 根配置 |
| `settings.gradle` | Gradle 模块声明 |

---

## 💻 开发指南

### 在 IntelliJ IDEA 中开发

#### 1. 导入项目

1. 打开 IDEA
2. File → Open → 选择 `backend` 目录
3. 选择 "Import Gradle Project"
4. 等待 Gradle 同步完成

#### 2. 配置运行参数

**Run → Edit Configurations... → 添加 Spring Boot 配置**：

| 参数 | 值 |
|------|---|
| Name | `GMSApplication-dev` |
| Main class | `com.linkedin.gms.GMSApplication` |
| Module | `metadata-service.war.main` |
| JRE | Java 17 |
| Active profiles | `dev` |
| VM options | `-Xms2g -Xmx4g -XX:+UseG1GC` |

#### 3. 运行应用

点击运行按钮 (▶️) 或按 `Shift+F10`

### Gradle 常用任务

```bash
# 编译
./gradlew classes                           # 编译所有模块
./gradlew :metadata-service:war:classes     # 编译 WAR 模块

# 构建
./gradlew build                             # 完整构建（包含测试）
./gradlew build -x test                     # 构建（跳过测试）
./gradlew assemble                          # 构建（不运行测试）

# 测试
./gradlew test                              # 运行所有测试
./gradlew :metadata-service:war:test        # 运行特定模块测试
./gradlew test --tests "MyTestClass"        # 运行特定测试类

# 清理
./gradlew clean                             # 清理构建产物
./gradlew clean build                       # 清理后重新构建

# 运行
./gradlew bootRun                           # 启动应用（默认 profile）
./gradlew bootRun --args='--spring.profiles.active=dev'  # 指定 profile

# 依赖管理
./gradlew dependencies                      # 查看依赖树
./gradlew :metadata-service:war:dependencies  # 查看特定模块依赖

# 生成 WAR 包
./gradlew :metadata-service:war:bootWar     # 生成可执行 WAR
```

### PDL (Pegasus Data Language) 开发

#### 什么是 PDL？

PDL 是 LinkedIn 开源的数据建模语言，用于定义数据结构和 REST API。

#### PDL 文件位置

```
metadata-models/src/main/pegasus/com/linkedin/
├── common/          # 通用数据类型（AuditStamp, Urn 等）
├── dataset/         # 数据集相关模型
├── dashboard/       # 仪表盘相关模型
└── ...
```

#### PDL 编译流程

```
PDL 源文件 (.pdl)
    ↓ Gradle Task: generateDataTemplate
Java 源代码 (.java)
    ↓ src/mainGeneratedDataTemplate/
编译后的 .class 文件
    ↓ build/classes/
JAR 包
    ↓ build/libs/
其他模块依赖
```

#### 修改 PDL 后的步骤

```bash
# 1. 修改 PDL 文件
vim metadata-models/src/main/pegasus/com/linkedin/common/MyModel.pdl

# 2. 重新生成 Java 代码
./gradlew :metadata-models:generateDataTemplate

# 3. 编译
./gradlew :metadata-models:classes

# 4. 重新构建依赖此模块的服务
./gradlew :metadata-service:war:classes
```

### 代码导航

#### 跳转到 PDL 定义

在 IDEA 中：
1. 按住 `Cmd` (Mac) 或 `Ctrl` (Win/Linux)
2. 点击类名（如 `AuditStamp`）
3. 会跳转到生成的 Java 文件

**如何查看 PDL 源文件**：
- 找到类的包路径，如 `com.linkedin.common.AuditStamp`
- 打开 `metadata-models/src/main/pegasus/com/linkedin/common/AuditStamp.pdl`

#### External Libraries 中的 JAR 包

在开发过程中，你会看到类似 `metadata-models-196efa0-SNAPSHOT.jar` 的依赖。这是 Gradle 构建的中间产物：

- **来源**：`./gradlew build` 生成的 JAR 包
- **位置**：`metadata-models/build/libs/`
- **用途**：作为其他模块的依赖
- **跳转**：点击会进入 JAR 内的 `.class` 文件

**单体项目中的模块依赖**：
- Gradle 支持模块间直接依赖（如 `implementation project(":metadata-models")`）
- 编译时会先构建依赖模块，生成 JAR 包
- 在 IDEA 中，模块间跳转会优先跳转到源代码，而非 JAR 包

---

## 🏗️ 构建部署

### 本地构建

```bash
# 完整构建
./gradlew build

# 生成 WAR 包
./gradlew :metadata-service:war:bootWar

# 输出位置
ls -lh metadata-service/war/build/libs/war.war
```

### 集成前端资源

```bash
# 前端构建
cd ../frontend
yarn build

# 将前端资源复制到后端
cd ../backend
./gradlew :metadata-service:war:copyFrontendDist

# 验证
ls -la metadata-service/war/src/main/resources/static/
```

### Docker 构建

```bash
# 构建 Docker 镜像
./gradlew docker

# 生成镜像：metapulse:latest
docker images | grep metapulse
```

### 运行 WAR 包

```bash
# 开发模式
java -jar metadata-service/war/build/libs/war.war \
  --spring.profiles.active=dev

# 生产模式
java -Xms4g -Xmx8g -XX:+UseG1GC \
  -jar metadata-service/war/build/libs/war.war \
  --spring.profiles.active=production \
  --spring.datasource.url=jdbc:postgresql://db-host:5432/metapulse \
  --spring.datasource.username=metapulse \
  --spring.datasource.password=your-password \
  --elasticsearch.host=es-host \
  --kafka.bootstrap.servers=kafka-host:9092
```

---

## ⚙️ 配置详解

### Spring Profile 配置策略

| Profile | 文件 | 用途 | 配置方式 |
|---------|------|------|---------|
| 默认 | `application.yml` | 通用配置 | 环境变量占位符 |
| dev | `application-dev.yml` | 本地开发 | 硬编码服务器 IP |
| production | 环境变量 | 生产环境 | 运行时传递 |

### application.yml（基础配置）

使用环境变量占位符 `${VAR:default}`：

```yaml
spring:
  datasource:
    url: jdbc:${DB_TYPE:postgresql}://${DB_HOST:localhost}:${DB_PORT:5432}/${DB_DATABASE:metapulse}
    username: ${DB_USERNAME:metapulse}
    password: ${DB_PASSWORD:metapulse}

kafka:
  bootstrap:
    servers: ${KAFKA_BOOTSTRAP_SERVERS:localhost:9092}

elasticsearch:
  host: ${ELASTICSEARCH_HOST:localhost}
  port: ${ELASTICSEARCH_PORT:9200}

# Consumer 开关
environment:
  MAE_CONSUMER_ENABLED: "${MAE_CONSUMER_ENABLED:true}"
  MCE_CONSUMER_ENABLED: "${MCE_CONSUMER_ENABLED:true}"
  MCP_CONSUMER_ENABLED: "${MCP_CONSUMER_ENABLED:true}"
  PE_CONSUMER_ENABLED: "${PE_CONSUMER_ENABLED:true}"

# EntityClient 模式
entityClient:
  impl: ${ENTITY_CLIENT_IMPL:java}  # java=本地调用, restli=HTTP调用
```

### application-dev.yml（开发配置）

硬编码服务器地址 `47.80.65.112`：

```yaml
spring:
  datasource:
    url: jdbc:postgresql://47.80.65.112:5432/metapulse
    username: metapulse
    password: metapulse
    hikari:
      maximum-pool-size: 20
      minimum-idle: 5

  jpa:
    show-sql: true  # 显示 SQL
    properties:
      hibernate:
        format_sql: true  # 格式化 SQL

kafka:
  bootstrap:
    servers: 47.80.65.112:9092
  schema:
    registry:
      url: http://localhost:8080/schema-registry/api
      type: INTERNAL
  consumer:
    group-id: metapulse-dev-consumers
    auto-offset-reset: earliest
  listeners:
    concurrency: 2  # 开发环境减少并发

elasticsearch:
  host: 47.80.65.112
  port: 9200
  scheme: http
  threadCount: 2  # 开发环境减少线程

# 所有 Consumer 启用
environment:
  MAE_CONSUMER_ENABLED: true
  MCE_CONSUMER_ENABLED: true
  MCP_CONSUMER_ENABLED: true
  PE_CONSUMER_ENABLED: true

# 本地方法调用
entityClient:
  impl: java

# 关闭认证（方便开发）
authentication:
  enabled: false

# 详细日志
logging:
  level:
    root: INFO
    com.linkedin: DEBUG
    com.linkedin.gms: DEBUG
    com.linkedin.metadata: DEBUG
    org.springframework.web: DEBUG
    org.apache.kafka: WARN
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE  # 显示 SQL 参数
```

### Consumer 配置说明

在 All-in-One 模式下，Consumer 通过环境变量控制启停：

| Consumer | 环境变量 | 功能 |
|----------|---------|------|
| MAE Consumer | `MAE_CONSUMER_ENABLED` | 消费元数据审计事件 |
| MCE Consumer | `MCE_CONSUMER_ENABLED` | 消费元数据变更事件 |
| MCP Consumer | `MCP_CONSUMER_ENABLED` | 消费元数据变更提议 |
| PE Consumer | `PE_CONSUMER_ENABLED` | 消费平台事件 |

**注意**：在 All-in-One 架构中，独立的 Consumer 配置文件（如 `metadata-jobs/mae-consumer-job/application.properties`）已被删除，所有配置统一在 `metadata-service/war` 中管理。

### EntityClient 模式

| 模式 | 值 | 说明 | 适用场景 |
|------|---|------|---------|
| Java | `java` | 本地方法调用 | All-in-One 部署 |
| RestLi | `restli` | HTTP 调用 | 微服务部署 |

---

## ❓ 常见问题

### 1. 编译失败：找不到 PDL 生成的类

**症状**：
```
error: cannot find symbol
  symbol:   class AuditStamp
  location: package com.linkedin.common
```

**解决方法**：

```bash
# 生成 PDL Java 代码
./gradlew :metadata-models:generateDataTemplate

# 编译
./gradlew :metadata-models:classes

# 重新构建依赖模块
./gradlew :metadata-service:war:classes
```

### 2. 启动失败：无法连接数据库

**症状**：
```
Caused by: org.postgresql.util.PSQLException: Connection refused
```

**解决方法**：

```bash
# 检查 PostgreSQL 是否运行
docker-compose -f docker-compose.services.yml ps postgres

# 测试连接
psql -h 47.80.65.112 -U metapulse -d metapulse -p 5432

# 检查配置文件
cat metadata-service/war/src/main/resources/application-dev.yml | grep jdbc
```

### 3. Kafka Consumer 无法启动

**症状**：
```
org.apache.kafka.common.errors.TimeoutException: Failed to update metadata
```

**解决方法**：

```bash
# 检查 Kafka 是否运行
docker-compose -f docker-compose.services.yml ps kafka

# 测试 Kafka 连接
kcat -L -b 47.80.65.112:9092

# 检查 Consumer 配置
cat metadata-service/war/src/main/resources/application-dev.yml | grep bootstrap
```

### 4. IDEA 中跳转到 JAR 包而非源代码

**症状**：点击类名跳转到 `.class` 文件而非 `.java` 源文件

**原因**：Gradle 缓存或索引问题

**解决方法**：

```bash
# 1. 重新构建
./gradlew clean build

# 2. IDEA 中刷新 Gradle
File → Invalidate Caches / Restart...

# 3. 重新同步 Gradle
右键 build.gradle → Gradle → Refresh Gradle Project
```

### 5. 内存溢出（OOM）

**症状**：
```
java.lang.OutOfMemoryError: Java heap space
```

**解决方法**：

调整 JVM 参数：

```bash
# 命令行运行
export JAVA_OPTS="-Xms4g -Xmx8g"
./gradlew bootRun

# IDEA 运行配置
VM options: -Xms4g -Xmx8g -XX:+UseG1GC -XX:MaxGCPauseMillis=200
```

### 6. GraphQL Schema 找不到

**症状**：GraphQL Playground 显示 "Schema not found"

**解决方法**：

```bash
# 确认 GraphQL 模块已编译
./gradlew :datahub-graphql-core:classes
./gradlew :metadata-service:graphql-servlet-impl:classes

# 检查启动日志
# 应包含: "GraphQL schema registered successfully"
```

---

## 🔗 相关资源

### 内部文档

- [项目主 README](../README.md) - 项目总览
- [前端开发指南](../frontend/README.md) - 前端开发
- [部署指南](../docs/DEPLOYMENT.md) - 部署详细步骤
- [CLAUDE.md](../CLAUDE.md) - Claude Code 项目指引

### 外部文档

- [DataHub 官方文档](https://datahubproject.io/docs/)
- [Spring Boot 文档](https://spring.io/projects/spring-boot)
- [Gradle 文档](https://docs.gradle.org/)
- [Pegasus (PDL) 文档](https://linkedin.github.io/rest.li/pdl_schema)

---

<p align="center">
  <b>Happy Coding! 🚀</b>
</p>

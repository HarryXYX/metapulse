# CLAUDE.md

本文件为 Claude Code (claude.ai/code) 在此仓库中工作时提供指导。

## ⚠️ 重要约定

### 日志读取规范
**后端日志必须从以下位置读取**：
- **主日志文件**: `/tmp/datahub/logs/gms/gms.log`（包含所有日志）
- **GraphQL 日志**: `/tmp/datahub/logs/gms/gms.graphql.log`（仅 GraphQL 日志）
- **日志目录**: `/tmp/datahub/logs/gms/`

❌ **错误示例**：不要从 `/tmp/metapulse-boot.log` 或其他临时位置读取
✅ **正确示例**：始终使用 `tail -100 /tmp/datahub/logs/gms/gms.log`

### DataHub 源码位置
- 本地 DataHub 源码路径: `/project/datahub`
- 所有关于 DataHub 的问题都应该查询本地源码解答

## 项目概览

MetaPulse 是一个基于 DataHub 的企业级元数据管理平台，采用**前后端分离的 Monorepo 架构**和**All-in-One 后端部署**方式。

### 关键架构特点

- **Monorepo 结构**：前端和后端代码位于同一仓库
- **All-in-One 后端**：单一 WAR 包包含 Web 服务和 Kafka Consumers
- **独立开发**：前端和后端可以独立开发、构建和测试
- **本地方法调用**：EntityClient 使用 Java 实现，无 HTTP 开销

### 目录结构

```
metapulse/
├── frontend/              # React + TypeScript + Vite 前端
├── backend/               # Gradle 多模块 Java 后端
├── scripts/               # 构建和开发脚本
├── docker/                # Docker 配置
└── docker-compose.yml     # 服务编排
```

## 开发命令

### 环境设置

```bash
# 初始化环境（检查依赖、安装包）
./scripts/dev/setup-local-env.sh

# 启动依赖服务（MySQL、Elasticsearch、Kafka）
docker-compose up -d mysql elasticsearch kafka
```

### 前端开发（推荐使用 VSCode）

```bash
cd frontend

# 安装依赖
yarn install

# 启动开发服务器 localhost:3000（支持热重载）
yarn dev

# 从 GraphQL schemas 生成 TypeScript 类型
yarn generate

# 代码检查和格式化
yarn lint              # 运行代码检查
yarn lint --fix        # 修复代码检查问题
yarn format            # 运行 Prettier

# 类型检查
yarn type-check

# 测试
yarn test              # 运行所有测试
yarn test path/to/file.test.tsx --run  # 运行特定测试

# 生产构建
yarn build
```

**前端注意事项**：
- 开发服务器运行在 `http://localhost:3000`
- API 请求代理到 `http://localhost:8080`
- 启用了热模块替换（HMR）
- 详细的样式指南请查看 `frontend/CLAUDE.md`

### 后端开发（推荐使用 IntelliJ IDEA）

```bash
cd backend

# 启动开发服务器
./gradlew bootRun

# 使用特定 profile 启动
./gradlew bootRun --args='--spring.profiles.active=development'

# 测试
./gradlew test                           # 运行所有测试
./gradlew :metadata-service:war:test    # 运行特定模块测试

# 构建
./gradlew build                          # 构建所有模块
./gradlew build -x test                 # 构建但跳过测试
./gradlew clean                         # 清理构建产物
```

**后端注意事项**：
- 后端运行在 `http://localhost:8080`
- GraphQL Playground: `http://localhost:8080/api/graphql`
- 健康检查: `http://localhost:8080/actuator/health`

**日志位置**（通过 IDEA 启动 GMSApplication 时）：
- 日志目录: `/tmp/datahub/logs/gms/`
- 主日志文件: `/tmp/datahub/logs/gms/gms.log`（包含所有级别的日志）
- GraphQL 日志: `/tmp/datahub/logs/gms/gms.graphql.log`（仅 GraphQL 相关日志）
- 可通过环境变量 `LOG_DIR` 自定义日志目录
- 日志配置: `backend/metadata-service/war/src/main/resources/logback.xml`


### 集成构建

```bash
# 构建所有内容（前端 + 后端）
./scripts/deploy/build-app.sh

# 仅构建前端
./scripts/deploy/build-app.sh frontend-only

# 仅构建后端
./scripts/deploy/build-app.sh backend-only

# 构建但跳过测试
./scripts/deploy/build-app.sh full skip-tests

# 将前端资源集成到后端
cd backend
./gradlew :metadata-service:war:integrateFrontend
```

**构建输出**：
- 前端: `frontend/dist/`
- 后端 WAR（包含前端）: `backend/metadata-service/war/build/libs/war.war`

### 开发环境运行

**方式 1：分离进程（推荐用于开发）**
```bash
# 终端 1 - 后端
cd backend && ./gradlew bootRun

# 终端 2 - 前端
cd frontend && yarn dev
```

**方式 2：Docker Compose**
```bash
# 先构建
./scripts/deploy/build-app.sh

# 启动所有服务
./scripts/deploy/start-all.sh

# 查看日志
docker-compose logs -f metapulse
```

## 架构详情

### 后端 Gradle 模块（共75个）

**核心模块**：
- `entity-registry` - 实体类型定义
- `metadata-models` - 数据模型和 schemas
- `metadata-io` - I/O 操作和持久化
- `metadata-auth` - 认证和授权
- `metadata-utils` - 共享工具类

**服务模块**（`metadata-service/`）：
- `war/` - **主要的 All-in-One WAR 应用**
- `graphql-servlet-impl/` - GraphQL API 实现
- `restli-servlet-impl/` - REST API 实现
- `auth-servlet-impl/` - 认证 servlet
- `configuration/` - 应用配置

**Consumer 模块**（`metadata-jobs/`）：
- `mce-consumer-job` - Metadata Change Event consumer
- `mae-consumer-job` - Metadata Audit Event consumer
- `pe-consumer` - Platform Event consumer

所有 consumers 都嵌入在 WAR 中以实现 All-in-One 部署。

### 前端架构

- **框架**: React 17 + TypeScript + Vite
- **GraphQL 客户端**: Apollo Client 3.3.19
- **UI 库**: Ant Design 4.24.7
- **可视化**: Visx 3.x
- **样式**: styled-components

**关键目录**：
- `src/app/` - 应用组件（按页面组织）
- `src/graphql/` - GraphQL 查询和生成的类型
- `src/conf/` - 全局配置
- 详细的组件组织请查看 `frontend/CLAUDE.md`

### 技术栈

| 层级 | 技术 | 版本 |
|-------|-----------|---------|
| 后端 | Java | 17 |
| 后端 | Spring Boot | 3.4.5 |
| 后端 | Gradle | 8.14.3 |
| 前端 | React | 17 |
| 前端 | TypeScript | Latest |
| 前端 | Vite | Latest |
| 搜索 | Elasticsearch | 8.17.4 |
| 数据库 | MySQL | 8.0+ |
| 消息队列 | Kafka | 8.0.0 |

## 常见开发工作流

### 添加 GraphQL 查询

1. 在 `frontend/src/graphql/*.graphql` 中定义查询
2. 运行 `yarn generate` 创建 TypeScript 类型
3. 在组件中导入和使用生成的类型

### 本地测试更改

1. 启动后端: `cd backend && ./gradlew bootRun`
2. 启动前端: `cd frontend && yarn dev`
3. 访问 `http://localhost:3000`

### 生产构建

```bash
# 完整构建
./scripts/deploy/build-app.sh

# 部署 WAR 文件
java -jar backend/metadata-service/war/build/libs/war.war
```

### 使用 Docker

```bash
# 构建 Docker 镜像
cd backend
./gradlew docker

# 使用 Docker Compose 启动
docker-compose up -d

# 查看特定服务日志
docker-compose logs -f metapulse
```

## 环境配置

### 后端环境变量

关键变量（完整列表见 `.env.example`）：
- `SERVER_PORT` - 服务端口（默认: 8080）
- `DB_HOST`, `DB_PORT`, `DB_DATABASE` - MySQL 连接
- `ELASTICSEARCH_HOST`, `ELASTICSEARCH_PORT` - 搜索引擎
- `KAFKA_BOOTSTRAP_SERVERS` - 消息队列
- `MAE_CONSUMER_ENABLED`, `MCE_CONSUMER_ENABLED`, `PE_CONSUMER_ENABLED` - 启用/禁用 consumers

### 前端环境变量

**开发环境**（`.env.development`）：
- `VITE_BACKEND_URL=http://localhost:8080`
- `VITE_GRAPHQL_ENDPOINT=/api/graphql`
- `VITE_APP_ENV=development`

**生产环境**（`.env.production`）：
- `VITE_BACKEND_URL=`（空表示同源）
- `VITE_GRAPHQL_ENDPOINT=/api/graphql`
- `VITE_APP_ENV=production`

## 代码质量标准

### 前端
- 遵循 Airbnb JavaScript 风格指南
- 使用 TypeScript interfaces 定义 props
- 优先使用 `type` 而非 `interface`
- 使用 styled-components 进行样式设计
- 提交前运行 linter 和类型检查

### 后端
- 遵循 Google Java 风格指南
- 为所有新代码编写单元测试
- 使用 Spring Boot 最佳实践
- 用 Javadoc 文档化公共 API

### Git 提交
- 使用 Conventional Commits 格式
- 包含有意义的提交消息
- 在适用时引用 issue 编号

## 故障排除

### 前端构建失败
```bash
cd frontend
rm -rf node_modules yarn.lock .cache
yarn install
yarn build
```

### 后端启动问题
- **查看后端日志**: `tail -100 /tmp/datahub/logs/gms/gms.log`
- **实时监控日志**: `tail -f /tmp/datahub/logs/gms/gms.log`
- **搜索特定日志**: `grep "ERROR\|WARN" /tmp/datahub/logs/gms/gms.log | tail -50`
- 检查 MySQL: `docker-compose ps mysql`
- 检查 Elasticsearch: `curl http://localhost:9200`
- 检查 Kafka: `docker-compose logs kafka`

### GraphQL 代理失败
- 验证后端运行在 8080 端口
- 检查前端 `.env.development` 中的 `VITE_BACKEND_URL`
- 测试 GraphQL 端点: `curl http://localhost:8080/api/graphql`

## 重要说明

- **All-in-One 架构**：WAR 文件包含 Web 服务和 Kafka consumers
- **前端集成**：前端资源单独构建后集成到 WAR 中
- **开发隔离**：前端和后端可以独立开发
- **Monorepo 优势**：统一版本控制，更容易跨栈重构
- 根目录里的 datahub 项目就是 datahub 的源码，具体路径是 `/project/datahub`，所有问到的 datahub 问题都通过本地源码解答
- 后台日志都从/tmp/datahub/logs/gms文件夹下读取
- 生成的文档都以.md格式存储

## 开发环境中间件配置

开发环境使用远程服务器上的中间件服务，配置文件位于：
`backend/metadata-service/war/src/main/resources/application-dev.yml`

### 中间件连接信息

| 中间件 | 地址 | 端口 | 用户名 | 密码 |
|--------|------|------|--------|------|
| **MySQL** | 47.80.65.112 | 3306 | metapulse | metapulse |
| **Kafka** | 47.80.65.112 | 9092 | - | - |
| **Elasticsearch** | 47.80.65.112 | 9200 | - | - |

### 中间件状态检查命令

查看中间件状态时，请使用以下命令从服务器检查：

```bash
# ===== MySQL 状态检查 =====
# 测试连接
mysql -h 47.80.65.112 -P 3306 -u metapulse -pmetapulse -e "SELECT 1"

# 查看数据库列表
mysql -h 47.80.65.112 -P 3306 -u metapulse -pmetapulse -e "SHOW DATABASES"

# 查看 metapulse 数据库表
mysql -h 47.80.65.112 -P 3306 -u metapulse -pmetapulse metapulse -e "SHOW TABLES"

# 查看连接状态
mysql -h 47.80.65.112 -P 3306 -u metapulse -pmetapulse -e "SHOW STATUS LIKE 'Threads_connected'"

# ===== Kafka 状态检查 =====
# 测试连接（需要本地安装 kafka 客户端或使用 nc）
nc -zv 47.80.65.112 9092

# 列出所有 topics（需要 kafka 客户端）
# kafka-topics.sh --bootstrap-server 47.80.65.112:9092 --list

# ===== Elasticsearch 状态检查 =====
# 检查集群健康状态
curl -s http://47.80.65.112:9200/_cluster/health | python3 -m json.tool

# 检查节点信息
curl -s http://47.80.65.112:9200/_cat/nodes?v

# 查看所有索引
curl -s http://47.80.65.112:9200/_cat/indices?v

# 查看集群状态
curl -s http://47.80.65.112:9200
```

### 数据库连接池配置

```yaml
hikari:
  maximum-pool-size: 30      # 最大连接数
  minimum-idle: 10           # 最小空闲连接
  connection-timeout: 30000  # 连接超时：30秒
  idle-timeout: 600000       # 空闲超时：10分钟
  max-lifetime: 1800000      # 最大生命周期：30分钟
```

### Kafka Producer/Consumer 配置

```yaml
producer:
  requestTimeoutMs: 120000   # 请求超时：120秒
  deliveryTimeoutMs: 180000  # 投递超时：180秒
  maxBlockMs: 180000         # 最大阻塞：180秒

consumer:
  groupId: metapulse-dev-consumers
  autoOffsetReset: earliest
```

### 默认登录账号（开发环境）

| 用户名 | 密码 | 说明 |
|--------|------|------|
| metapulse-admin | metapulse-admin | 开发环境默认管理员 |
# MetaPulse - 企业级元数据管理平台

> 基于 DataHub 二次开发的 All-in-One 元数据管理平台，采用前后端分离的 Monorepo 架构

[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![React](https://img.shields.io/badge/React-17-blue.svg)](https://reactjs.org/)

---

## 📋 目录

- [项目简介](#-项目简介)
- [核心特性](#-核心特性)
- [技术栈](#-技术栈)
- [快速开始](#-快速开始)
- [开发模式](#-开发模式)
- [项目结构](#-项目结构)
- [配置说明](#-配置说明)
- [常见问题](#-常见问题)
- [文档索引](#-文档索引)

---

## 📖 项目简介

MetaPulse 是一个企业级元数据管理平台，提供数据发现、血缘分析、数据治理和知识图谱等核心功能。

### 架构特点

#### 🎯 All-in-One 单体架构
- **单一 WAR 包部署**：Web 服务 + Kafka Consumers 合一
- **本地方法调用**：EntityClient 使用 Java 实现，无 HTTP 开销
- **资源高效利用**：共享数据库连接池、缓存和线程池
- **简化运维管理**：一个进程，易于监控和调试

#### 🏗️ 前后端分离 Monorepo
- **统一版本管理**：前后端代码在同一仓库
- **独立开发部署**：可单独开发、测试和构建
- **清晰职责划分**：backend/ 和 frontend/ 目录结构清晰

---

## ⚡ 核心特性

- 🔍 **数据发现**：快速搜索和浏览企业数据资产
- 📊 **数据血缘**：可视化数据流转关系和影响分析
- ✅ **数据治理**：数据质量监控和合规性管理
- 🧠 **知识图谱**：构建企业数据知识体系
- 🎨 **可视化界面**：基于 React + Ant Design 的现代化 UI
- 🚀 **GraphQL API**：高效的数据查询接口

---

## 🔧 技术栈

### 后端技术

| 技术 | 版本 | 说明 |
|------|------|------|
| Java | 17 | 编程语言 |
| Spring Boot | 3.4.5 | Web 框架 |
| Spring Kafka | 3.3.8 | 消息队列集成 |
| Gradle | 8.14.3 | 构建工具 |
| PostgreSQL | 14+ | 关系型数据库 |
| Elasticsearch | 8.11.0 | 搜索引擎 |
| Kafka | 7.6.0 | 消息队列 |

### 前端技术

| 技术 | 版本 | 说明 |
|------|------|------|
| React | 17 | UI 框架 |
| TypeScript | Latest | 类型系统 |
| Vite | Latest | 构建工具 |
| Apollo Client | 3.3.19 | GraphQL 客户端 |
| Ant Design | 4.24.7 | UI 组件库 |
| Visx | 3.x | 数据可视化 |

---

## 🚀 快速开始

### 前置要求

- **Java 17+** - [下载链接](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Node.js 18+** - [下载链接](https://nodejs.org/)
- **Yarn** - `npm install -g yarn`
- **Docker & Docker Compose** (服务器端) - [下载链接](https://www.docker.com/)

### 方式一：完整 Docker 部署（演示/测试）

适用于快速体验或生产部署。

```bash
# 1. 克隆项目
git clone <repository-url>
cd metapulse

# 2. 构建项目
./scripts/build.sh

# 3. 启动所有服务
docker-compose up -d

# 4. 访问应用
# 浏览器打开: http://localhost:8080
```

### 方式二：本地开发模式（推荐）

适用于日常开发，服务器运行依赖服务，本地运行前后端。

**步骤详见** → [开发模式](#-开发模式)

---

## 💻 开发模式

### 架构说明

```
┌─────────────────────────────────────────┐
│  服务器 (47.80.65.112)                   │
│  ├─ PostgreSQL      :5432               │
│  ├─ Elasticsearch   :9200               │
│  └─ Kafka          :9092                │
└─────────────────────────────────────────┘
                  ↓  网络连接
┌─────────────────────────────────────────┐
│  本地开发机器                             │
│  ├─ 后端 (IDEA)     :8080               │
│  └─ 前端 (VSCode)   :3000               │
└─────────────────────────────────────────┘
```

### 🖥️ 服务器端配置

#### 1. 开放防火墙端口

```bash
# CentOS/RHEL
sudo firewall-cmd --permanent --add-port=5432/tcp
sudo firewall-cmd --permanent --add-port=9200/tcp
sudo firewall-cmd --permanent --add-port=9092/tcp
sudo firewall-cmd --reload

# Ubuntu/Debian
sudo ufw allow 5432/tcp
sudo ufw allow 9200/tcp
sudo ufw allow 9092/tcp
sudo ufw reload
```

#### 2. 启动依赖服务

```bash
cd /path/to/metapulse

# 启动依赖服务（仅 PostgreSQL, Elasticsearch, Kafka）
docker-compose -f docker-compose.services.yml up -d

# 查看服务状态
docker-compose -f docker-compose.services.yml ps
```

#### 3. 验证服务

```bash
# 测试 PostgreSQL
psql -h 47.80.65.112 -U metapulse -d metapulse -p 5432

# 测试 Elasticsearch
curl http://47.80.65.112:9200/_cluster/health

# 测试 Kafka
echo "test" | kcat -P -b 47.80.65.112:9092 -t test-topic
```

### 💻 本地开发环境

#### 后端开发（IntelliJ IDEA）

```bash
# 1. 进入后端目录
cd backend

# 2. 首次编译（可选）
./gradlew :metadata-service:war:classes

# 3. 启动开发服务器
./gradlew bootRun --args='--spring.profiles.active=dev'

# 或在 IDEA 中创建运行配置：
# - Main class: com.linkedin.gms.GMSApplication
# - VM options: -Xms2g -Xmx4g
# - Active profiles: dev
```

**后端会自动连接到服务器 (47.80.65.112) 的依赖服务。**

访问：
- 健康检查：http://localhost:8080/actuator/health
- GraphQL Playground：http://localhost:8080/api/graphql

#### 前端开发（VSCode）

```bash
# 1. 进入前端目录
cd frontend

# 2. 安装依赖
yarn install

# 3. 启动开发服务器
yarn dev

# 4. 访问应用
# 浏览器打开: http://localhost:3000
```

**前端会自动代理 API 请求到本地后端 (localhost:8080)。**

#### 日常工作流程

```bash
# 1. 服务器端：启动依赖服务
ssh user@47.80.65.112
cd /path/to/metapulse
docker-compose -f docker-compose.services.yml up -d

# 2. 本地：启动后端（Terminal 1）
cd backend
./gradlew bootRun --args='--spring.profiles.active=dev'

# 3. 本地：启动前端（Terminal 2）
cd frontend
yarn dev

# 4. 开始开发！
# 前端: http://localhost:3000
# 后端 API: http://localhost:8080
```

---

## 📁 项目结构

```
metapulse/
├── backend/                    # 后端根目录
│   ├── metadata-service/      # 元数据服务
│   │   └── war/              # ⭐ All-in-One WAR 应用
│   │       └── src/main/resources/
│   │           ├── application.yml         # 基础配置
│   │           └── application-dev.yml     # 开发环境配置（硬编码服务器IP）
│   ├── metadata-models/       # 数据模型（PDL 定义）
│   ├── metadata-jobs/         # Kafka Consumers（嵌入式）
│   ├── build.gradle          # Gradle 根配置
│   └── gradlew               # Gradle Wrapper
│
├── frontend/                   # 前端根目录
│   ├── src/
│   │   ├── app/              # 应用组件
│   │   ├── graphql/          # GraphQL Schema
│   │   └── conf/             # 配置文件
│   ├── .env.development       # 开发环境变量
│   ├── .env.production        # 生产环境变量
│   ├── package.json
│   └── vite.config.ts
│
├── scripts/                    # 工具脚本
│   ├── setup.sh               # 环境初始化
│   ├── dev.sh                 # 开发启动
│   └── build.sh               # 构建脚本
│
├── docs/                       # 文档目录
│   ├── DEPLOYMENT.md          # 部署指南（详细）
│   └── DEVELOPMENT.md         # 开发指南（详细）
│
├── docker/                     # Docker 配置
├── docker-compose.yml          # 完整部署配置
├── docker-compose.services.yml # 仅依赖服务配置
├── CLAUDE.md                   # Claude Code 项目指引
└── README.md                   # 本文档
```

**详细结构说明**：
- 后端共 75 个 Gradle 模块，采用分层架构
- 前端采用基于页面的组件组织方式
- 详见：[backend/README.md](backend/README.md) | [frontend/README.md](frontend/README.md)

---

## ⚙️ 配置说明

### 后端配置文件

#### application.yml（基础配置）

使用环境变量占位符，适用于 Docker 部署：

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
```

#### application-dev.yml（开发配置）

**硬编码服务器地址**，用于本地开发：

```yaml
spring:
  datasource:
    url: jdbc:postgresql://47.80.65.112:5432/metapulse
    username: metapulse
    password: metapulse

kafka:
  bootstrap:
    servers: 47.80.65.112:9092

elasticsearch:
  host: 47.80.65.112
  port: 9200

# 开发环境关闭认证
authentication:
  enabled: false

# 开启详细日志
logging:
  level:
    com.linkedin: DEBUG
    org.springframework.web: DEBUG
```

**无需修改配置**，直接使用 `--spring.profiles.active=dev` 启动即可。

### 前端环境变量

#### .env.development（开发环境）

```env
VITE_BACKEND_URL=http://localhost:8080
VITE_GRAPHQL_ENDPOINT=/api/graphql
VITE_APP_ENV=development
VITE_LOG_LEVEL=debug
```

#### .env.production（生产环境）

```env
VITE_BACKEND_URL=
VITE_GRAPHQL_ENDPOINT=/api/graphql
VITE_APP_ENV=production
VITE_LOG_LEVEL=error
```

### Kafka 双监听器配置

支持容器内通信和外部连接：

```yaml
KAFKA_ADVERTISED_LISTENERS: INTERNAL://kafka:29092,EXTERNAL://47.80.65.112:9092
KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: INTERNAL:PLAINTEXT,EXTERNAL:PLAINTEXT
KAFKA_INTER_BROKER_LISTENER_NAME: INTERNAL
KAFKA_LISTENERS: INTERNAL://0.0.0.0:29092,EXTERNAL://0.0.0.0:9092
```

| 监听器 | 地址 | 用途 |
|--------|------|------|
| INTERNAL | kafka:29092 | Docker 容器内通信 |
| EXTERNAL | 47.80.65.112:9092 | 本地开发环境连接 |

---

## 🛠️ 常用命令

### 前端开发

```bash
cd frontend

yarn install          # 安装依赖
yarn dev             # 启动开发服务器
yarn build           # 生产构建
yarn lint            # 代码检查
yarn lint --fix      # 自动修复问题
yarn type-check      # 类型检查
yarn test            # 运行测试
yarn generate        # 生成 GraphQL 类型
```

### 后端开发

```bash
cd backend

./gradlew bootRun                    # 启动应用
./gradlew bootRun --args='--spring.profiles.active=dev'  # 指定 profile
./gradlew build                      # 完整构建
./gradlew build -x test              # 构建（跳过测试）
./gradlew test                       # 运行测试
./gradlew :metadata-service:war:test # 运行特定模块测试
./gradlew clean                      # 清理构建产物
```

### 集成构建

```bash
./scripts/build.sh                   # 完整构建（前端+后端）
./scripts/build.sh frontend-only     # 仅构建前端
./scripts/build.sh backend-only      # 仅构建后端
./scripts/build.sh full skip-tests   # 跳过测试的完整构建
```

### Docker 服务管理

```bash
# 仅依赖服务
docker-compose -f docker-compose.services.yml up -d      # 启动
docker-compose -f docker-compose.services.yml ps         # 查看状态
docker-compose -f docker-compose.services.yml logs -f    # 查看日志
docker-compose -f docker-compose.services.yml stop       # 停止
docker-compose -f docker-compose.services.yml down       # 停止并删除容器

# 完整部署
docker-compose up -d                 # 启动所有服务
docker-compose ps                    # 查看状态
docker-compose logs -f metapulse     # 查看应用日志
docker-compose restart metapulse     # 重启应用
docker-compose down                  # 停止所有服务
docker-compose down -v               # 停止并删除数据卷（⚠️ 会删除数据）
```

---

## ❓ 常见问题

### 1. 无法连接到服务器依赖服务

**症状**：本地应用无法连接到 47.80.65.112

**解决方法**：

```bash
# 1. 检查服务器防火墙
ssh user@47.80.65.112
sudo firewall-cmd --list-ports  # 应包含 5432, 9092, 9200

# 2. 检查服务状态
docker-compose -f docker-compose.services.yml ps

# 3. 测试网络连通性
ping 47.80.65.112
telnet 47.80.65.112 5432
telnet 47.80.65.112 9092
telnet 47.80.65.112 9200
```

### 2. Kafka 连接失败

**症状**：`Connection to node -1 could not be established`

**解决方法**：

```bash
# 检查 Kafka 双监听器配置
docker-compose -f docker-compose.services.yml exec kafka \
  kafka-broker-api-versions --bootstrap-server localhost:29092

# 重启 Kafka
docker-compose -f docker-compose.services.yml restart kafka
sleep 30

# 测试连接
echo "test" | kcat -P -b 47.80.65.112:9092 -t test-topic
```

### 3. 后端启动失败

**排查步骤**：

```bash
# 1. 检查 Java 版本
java -version  # 需要 Java 17

# 2. 验证依赖服务
psql -h 47.80.65.112 -U metapulse -d metapulse
curl http://47.80.65.112:9200
kcat -L -b 47.80.65.112:9092

# 3. 查看详细日志（在 IDEA 控制台）
```

### 4. 前端代理失败

**症状**：GraphQL 请求 `ERR_CONNECTION_REFUSED`

**解决方法**：

```bash
# 1. 确认后端运行
curl http://localhost:8080/actuator/health

# 2. 检查前端配置
cat frontend/.env.development
# 应包含: VITE_BACKEND_URL=http://localhost:8080

# 3. 重启前端服务器
cd frontend
yarn dev
```

### 5. 前端构建失败

```bash
cd frontend
rm -rf node_modules yarn.lock .cache
yarn install
yarn build
```

### 6. 静态资源 404

```bash
# 构建前端并复制到后端
cd frontend && yarn build && cd ..
cd backend && ./gradlew :metadata-service:war:copyFrontendDist

# 验证
ls -la backend/metadata-service/war/src/main/resources/static/
```

---

## 📚 文档索引

### 核心文档

- **[后端开发指南](backend/README.md)** - Gradle 模块、PDL 编译、All-in-One 架构
- **[前端开发指南](frontend/README.md)** - React 组件、GraphQL、样式规范
- **[部署指南](docs/DEPLOYMENT.md)** - 详细的部署步骤和故障排查
- **[开发指南](docs/DEVELOPMENT.md)** - 详细的开发流程和最佳实践
- **[CLAUDE.md](CLAUDE.md)** - Claude Code AI 助手项目指引

### 外部参考

- [DataHub 官方文档](https://datahubproject.io/docs/)
- [Spring Boot 文档](https://spring.io/projects/spring-boot)
- [React 文档](https://reactjs.org/)
- [Vite 文档](https://vitejs.dev/)
- [GraphQL 文档](https://graphql.org/)

---

## 🤝 贡献指南

### 代码规范

- **Java**：遵循 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- **TypeScript/React**：遵循 [Airbnb JavaScript Style Guide](https://github.com/airbnb/javascript)
- **Git Commit**：使用 [Conventional Commits](https://www.conventionalcommits.org/) 规范

### 提交流程

1. Fork 本仓库
2. 创建特性分支：`git checkout -b feature/amazing-feature`
3. 提交更改：`git commit -m 'feat: add amazing feature'`
4. 推送分支：`git push origin feature/amazing-feature`
5. 创建 Pull Request

---

## 📄 许可证

本项目基于 DataHub 进行二次开发，继承 [Apache 2.0 许可证](LICENSE)。

---

## 📧 联系方式

- **问题反馈**：[GitHub Issues](https://github.com/your-org/metapulse/issues)
- **项目主页**：[GitHub Repository](https://github.com/your-org/metapulse)

---

<p align="center">
  <b>MetaPulse Team</b> - 让数据治理更简单 🚀
</p>
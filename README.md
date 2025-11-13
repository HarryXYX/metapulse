# MetaPulse - 元数据管理平台

> 基于 DataHub 二次开发的 All-in-One 元数据管理平台，采用前后端分离的 Monorepo 架构。

[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Node.js](https://img.shields.io/badge/Node.js-18+-green.svg)](https://nodejs.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![React](https://img.shields.io/badge/React-17-blue.svg)](https://reactjs.org/)

## 📚 目录

- [项目简介](#项目简介)
- [架构特点](#架构特点)
- [技术栈](#技术栈)
- [项目结构](#项目结构)
- [快速开始](#快速开始)
- [开发指南](#开发指南)
- [构建部署](#构建部署)
- [环境配置](#环境配置)
- [常见问题](#常见问题)

## 📖 项目简介

MetaPulse 是一个企业级元数据管理平台，提供以下核心功能：

- **数据发现**：快速搜索和浏览企业数据资产
- **数据血缘**：可视化数据流转关系和影响分析
- **数据治理**：数据质量监控和合规性管理
- **知识图谱**：构建企业数据知识体系
- **All-in-One 架构**：单一进程运行，简化部署和运维

## 🏗️ 架构特点

### 前后端分离 Monorepo

- ✅ **统一仓库管理**：前后端代码在同一仓库，便于版本管理
- ✅ **独立开发部署**：前后端可以独立开发、构建和测试
- ✅ **清晰的职责分离**：backend/ 和 frontend/ 目录结构清晰

### All-in-One 后端

- ✅ **单一 WAR 包**：包含 Web 服务和 Kafka Consumers
- ✅ **资源高效**：共享数据库连接池、缓存和线程池
- ✅ **本地方法调用**：EntityClient 使用 Java 实现，无 HTTP 开销
- ✅ **简化运维**：只需部署一个服务

### 前端技术栈

- ✅ **React 17 + TypeScript**：现代化前端框架
- ✅ **Vite 构建**：极速的开发和构建体验
- ✅ **GraphQL**：高效的数据查询
- ✅ **Ant Design**：企业级 UI 组件库

## 🔧 技术栈

### 后端技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| Java | 17 | 编程语言 |
| Spring Boot | 3.4.5 | Web 框架 |
| Spring Kafka | 3.3.8 | 消息队列集成 |
| GraphQL | - | API 查询语言 |
| Elasticsearch | 8.17.4 | 搜索引擎 |
| PostgreSQL | 14+ | 关系型数据库 |
| Kafka | 8.0.0 | 消息队列 |
| Gradle | 8.14.3 | 构建工具 |

### 前端技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| React | 17 | UI 框架 |
| TypeScript | - | 类型系统 |
| Vite | - | 构建工具 |
| Apollo Client | 3.3.19 | GraphQL 客户端 |
| Ant Design | 4.24.7 | UI 组件库 |
| Visx | 3.x | 数据可视化 |

## 📁 项目结构

```
metapulse/
├── 📁 backend/              # 后端根目录
│   ├── build.gradle        # Gradle 根配置
│   ├── settings.gradle     # Gradle 模块配置
│   ├── gradlew             # Gradle Wrapper
│   ├── metadata-service/   # 元数据服务模块
│   │   ├── war/           # ⭐ All-in-One WAR 应用
│   │   ├── graphql-servlet-impl/
│   │   └── ...
│   ├── metadata-models/    # 数据模型
│   ├── metadata-jobs/      # Kafka Consumers
│   └── ...                 # 其他 75 个模块
│
├── 📁 frontend/             # 前端根目录
│   ├── package.json        # NPM 依赖配置
│   ├── vite.config.ts      # Vite 构建配置
│   ├── src/                # 源代码
│   │   ├── app/           # 应用主目录
│   │   ├── graphql/       # GraphQL Schema
│   │   └── ...
│   ├── .env.development    # 开发环境配置
│   └── .env.production     # 生产环境配置
│
├── 📁 scripts/              # 🛠️ 工具脚本
│   ├── setup.sh            # 环境初始化
│   ├── dev.sh              # 开发启动
│   └── build.sh            # 构建脚本
│
├── 📁 docs/                 # 📚 文档目录
├── 📁 docker/               # 🐳 Docker 配置
├── docker-compose.yml       # Docker Compose 配置
├── .env.example             # 环境变量示例
├── .gitignore               # Git 忽略配置
└── README.md                # 本文档
```

## 🚀 快速开始

### 前置要求

- **Java 17+** - [下载链接](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Node.js 18+** - [下载链接](https://nodejs.org/)
- **Yarn** - `npm install -g yarn`
- **Docker & Docker Compose** (可选) - [下载链接](https://www.docker.com/)

### 1. 环境初始化

```bash
# 克隆项目
git clone https://github.com/your-org/metapulse.git
cd metapulse

# 运行初始化脚本（会自动检查环境、安装依赖）
chmod +x scripts/*.sh
./scripts/setup.sh
```

### 2. 启动依赖服务

使用 Docker Compose 启动 PostgreSQL、Elasticsearch、Kafka：

```bash
docker-compose up -d postgres elasticsearch kafka
```

### 3. 启动开发服务

**方式一：分别启动（推荐用于开发）**

```bash
# 终端 1 - 启动后端（端口 8080）
./scripts/dev.sh backend

# 终端 2 - 启动前端（端口 3000）
./scripts/dev.sh frontend
```

**方式二：使用 Docker Compose**

```bash
# 先构建前端和后端
./scripts/build.sh

# 启动所有服务
docker-compose up -d
```

### 4. 访问应用

- **前端应用**: http://localhost:3000
- **后端 API**: http://localhost:8080
- **GraphQL Playground**: http://localhost:8080/api/graphql
- **健康检查**: http://localhost:8080/actuator/health

## 💻 开发指南

### 前端开发

```bash
cd frontend

# 安装依赖
yarn install

# 启动开发服务器（带热更新）
yarn dev

# 运行 Linter
yarn lint

# 修复 Linter 问题
yarn lint --fix

# 运行类型检查
yarn type-check

# 运行测试
yarn test

# 生成 GraphQL 类型
yarn generate

# 构建生产版本
yarn build
```

**开发服务器配置:**
- 前端运行在 `http://localhost:3000`
- API 请求会自动代理到 `http://localhost:8080`
- 支持热模块替换 (HMR)

### 后端开发

```bash
cd backend

# 启动开发服务器
./gradlew bootRun

# 启动开发服务器（指定 profile）
./gradlew bootRun --args='--spring.profiles.active=development'

# 运行测试
./gradlew test

# 运行特定模块的测试
./gradlew :metadata-service:war:test

# 构建 WAR 包
./gradlew build

# 构建并跳过测试
./gradlew build -x test

# 清理构建产物
./gradlew clean
```

### 前后端集成开发

```bash
# 完整构建（前端 + 后端）
./scripts/build.sh

# 仅构建前端
./scripts/build.sh frontend-only

# 仅构建后端
./scripts/build.sh backend-only

# 跳过测试的完整构建
./scripts/build.sh full skip-tests

# 后端构建时自动集成前端资源
cd backend
./gradlew :metadata-service:war:integrateFrontend
```

## 🏗️ 构建部署

### 本地构建

```bash
# 完整构建
./scripts/build.sh

# 输出产物:
# - frontend/dist/                                    (前端静态资源)
# - backend/metadata-service/war/build/libs/war.war   (后端 WAR 包，已包含前端)
```

### Docker 构建

```bash
# 构建 Docker 镜像
cd backend
./gradlew docker

# 生成镜像: metapulse:latest
```

### 部署到生产环境

**方式一：直接运行 WAR 包**

```bash
java -Xms2g -Xmx4g \
  -jar backend/metadata-service/war/build/libs/war.war \
  --spring.profiles.active=production \
  --spring.datasource.url=jdbc:postgresql://db-host:5432/metapulse \
  --spring.datasource.username=metapulse \
  --spring.datasource.password=your-password \
  --elasticsearch.host=es-host \
  --kafka.bootstrap.servers=kafka-host:9092
```

**方式二：使用 Docker Compose**

```bash
# 生产环境配置
docker-compose -f docker-compose.prod.yml up -d
```

## ⚙️ 环境配置

### 后端环境变量

| 变量名 | 默认值 | 说明 |
|--------|--------|------|
| `SERVER_PORT` | 8080 | 服务端口 |
| `DB_HOST` | localhost | PostgreSQL 主机 |
| `DB_PORT` | 5432 | PostgreSQL 端口 |
| `DB_DATABASE` | metapulse | 数据库名称 |
| `DB_USERNAME` | metapulse | 数据库用户名 |
| `DB_PASSWORD` | metapulse | 数据库密码 |
| `ELASTICSEARCH_HOST` | localhost | Elasticsearch 主机 |
| `ELASTICSEARCH_PORT` | 9200 | Elasticsearch 端口 |
| `KAFKA_BOOTSTRAP_SERVERS` | localhost:9092 | Kafka 地址 |
| `MAE_CONSUMER_ENABLED` | true | 启用 MAE Consumer |
| `MCE_CONSUMER_ENABLED` | true | 启用 MCE Consumer |
| `PE_CONSUMER_ENABLED` | true | 启用 PE Consumer |

### 前端环境变量

**开发环境** (`frontend/.env.development`):
```env
VITE_BACKEND_URL=http://localhost:8080
VITE_GRAPHQL_ENDPOINT=/api/graphql
VITE_APP_ENV=development
VITE_LOG_LEVEL=debug
```

**生产环境** (`frontend/.env.production`):
```env
VITE_BACKEND_URL=
VITE_GRAPHQL_ENDPOINT=/api/graphql
VITE_APP_ENV=production
VITE_LOG_LEVEL=error
```

详细配置请参考 `.env.example`。

### 资源配置建议

| 环境 | CPU | 内存 | 磁盘 | 说明 |
|------|-----|------|------|------|
| 开发 | 2核 | 4GB | 20GB | 本地开发环境 |
| 测试 | 4核 | 8GB | 50GB | 集成测试环境 |
| 生产（小） | 4核 | 8GB | 100GB | < 10万元数据 |
| 生产（中） | 8核 | 16GB | 200GB | 10-100万元数据 |
| 生产（大） | 16核 | 32GB | 500GB | > 100万元数据 |

## ❓ 常见问题

### 1. 端口冲突

如果 8080 或 3000 端口被占用：

```bash
# 修改后端端口
export SERVER_PORT=8081
./scripts/dev.sh backend

# 修改前端端口（vite.config.ts 中配置）
cd frontend
# 编辑 vite.config.ts，修改 server.port
```

### 2. 前端构建失败

```bash
# 清理缓存并重新安装依赖
cd frontend
rm -rf node_modules yarn.lock .cache
yarn install
yarn build
```

### 3. 后端启动失败

检查依赖服务是否正常运行：

```bash
# 检查 PostgreSQL
docker-compose ps postgres
psql -h localhost -U metapulse -d metapulse

# 检查 Elasticsearch
curl http://localhost:9200

# 检查 Kafka
docker-compose logs kafka
```

### 4. GraphQL 代理失败

确保前端 `.env.development` 中的配置正确：

```env
VITE_BACKEND_URL=http://localhost:8080
```

检查后端是否正常运行：
```bash
curl http://localhost:8080/api/graphql
```

### 5. 静态资源 404

如果访问前端页面出现 404：

```bash
# 确保前端资源已构建并复制到后端
cd frontend
yarn build

cd ../backend
./gradlew :metadata-service:war:copyFrontendDist

# 验证静态资源目录
ls -la metadata-service/war/src/main/resources/static/
```

### 6. Consumer 消费延迟

```bash
# 检查 Kafka Consumer Lag
docker-compose exec kafka kafka-consumer-groups \
  --bootstrap-server localhost:9092 \
  --describe --group metapulse-consumers

# 增加 Consumer 并发（修改 application.yml）
kafka.listeners.concurrency: 8  # 从 4 增加到 8
```

## 🛠️ 常用命令

```bash
# 查看所有服务状态
docker-compose ps

# 停止所有服务
docker-compose down

# 停止并删除数据卷（⚠️ 会删除所有数据）
docker-compose down -v

# 重启 MetaPulse 应用
docker-compose restart metapulse

# 查看应用日志
docker-compose logs -f metapulse

# 查看后端日志
cd backend && ./gradlew bootRun

# 查看前端日志
cd frontend && yarn dev
```

## 📚 相关文档

- **内部文档**:
  - [架构设计](docs/architecture.md)
  - [开发指南](docs/development-guide.md)
  - [部署指南](docs/deployment-guide.md)
  - [API 参考](docs/api-reference.md)

- **外部参考**:
  - [DataHub 官方文档](https://datahubproject.io/docs/)
  - [Spring Boot 文档](https://spring.io/projects/spring-boot)
  - [React 文档](https://reactjs.org/)
  - [Vite 文档](https://vitejs.dev/)

## 🤝 贡献指南

欢迎贡献代码！请遵循以下流程：

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/amazing-feature`)
3. 提交更改 (`git commit -m 'Add amazing feature'`)
4. 推送到分支 (`git push origin feature/amazing-feature`)
5. 创建 Pull Request

### 代码规范

- **Java**: 遵循 Google Java Style Guide
- **TypeScript/React**: 遵循 Airbnb JavaScript Style Guide
- **Git Commit**: 使用 Conventional Commits 规范

## 📄 许可证

本项目基于 DataHub 进行二次开发，继承 [Apache 2.0 许可证](LICENSE)。

## 📧 联系方式

- **项目主页**: https://github.com/your-org/metapulse
- **问题反馈**: https://github.com/your-org/metapulse/issues
- **文档**: https://docs.metapulse.io

---

**MetaPulse Team** - 让数据治理更简单 🚀

# MetaPulse 脚本工具

本目录包含 MetaPulse 项目的自动化脚本，分为**开发**和**部署**两类。

---

## 📁 目录结构

```
scripts/
├── dev/                    # 开发相关脚本（本地运行）
│   └── setup.sh           # 初始化本地开发环境
│
└── deploy/                 # 部署相关脚本（服务器运行）
    ├── deps-only.sh       # 启动依赖服务（开发模式）
    ├── full.sh            # 完整应用部署
    └── build.sh           # 构建应用
```

---

## 🛠️ 开发脚本（本地运行）

### dev/setup.sh - 初始化开发环境

**功能**：
- 检查 Java、Node.js、Yarn 环境
- 验证 Gradle Wrapper
- 安装前端依赖
- 检查配置文件

**使用场景**：首次设置开发环境或重置环境

**运行方式**：
```bash
# 在本地机器运行
./scripts/dev/setup.sh
```

**执行后续步骤**：
1. 在服务器启动依赖服务：`./scripts/deploy/deps-only.sh`
2. 本地 IDEA 启动后端（profile: dev）
3. 本地 VSCode 启动前端（`yarn dev`）

---

## 🚀 部署脚本（服务器运行）

### deploy/deps-only.sh - 启动依赖服务

**功能**：
- 仅启动 PostgreSQL、Elasticsearch、Kafka
- 供本地开发使用（服务器提供依赖服务）
- 使用 `docker-compose.services.yml`

**使用场景**：日常开发时在服务器上启动依赖服务

**运行方式**：
```bash
# SSH 到服务器
ssh user@47.80.65.112
cd /path/to/metapulse

# 运行脚本
./scripts/deploy/deps-only.sh
```

**交互选项**：
- `1` - 启动依赖服务
- `2` - 重启依赖服务
- `3` - 停止依赖服务
- `4` - 查看服务日志

**服务端口**：
- PostgreSQL: 5432
- Elasticsearch: 9200
- Kafka: 9092

---

### deploy/build.sh - 构建应用

**功能**：
- 构建前端（React + Vite）
- 集成前端资源到后端
- 构建后端 WAR 包

**使用场景**：生产部署前的构建

**运行方式**：
```bash
# 完整构建（包含测试）
./scripts/deploy/build.sh

# 完整构建（跳过测试，推荐）
./scripts/deploy/build.sh full skip-tests

# 仅构建后端
./scripts/deploy/build.sh backend-only

# 仅构建前端
./scripts/deploy/build.sh frontend-only
```

**构建产物**：
- 前端：`frontend/dist/`
- 后端：`backend/metadata-service/war/build/libs/war.war`

---

### deploy/full.sh - 完整应用部署

**功能**：
- 部署所有服务（依赖 + 应用）
- 使用 `docker-compose.yml`
- 自动检查构建产物

**使用场景**：演示、测试、生产部署

**运行方式**：
```bash
# SSH 到服务器
ssh user@47.80.65.112
cd /path/to/metapulse

# 运行脚本
./scripts/deploy/full.sh
```

**交互选项**：
- `1` - 启动所有服务
- `2` - 重启所有服务
- `3` - 停止所有服务
- `4` - 查看应用日志
- `5` - 重新构建并部署

**访问地址**：
- 前端应用: http://47.80.65.112:8080
- GraphQL API: http://47.80.65.112:8080/api/graphql
- 健康检查: http://47.80.65.112:8080/actuator/health

---

## 📋 使用流程

### 场景一：首次开发环境设置

**本地机器**：
```bash
# 1. 初始化开发环境
./scripts/dev/setup.sh
```

**服务器**：
```bash
# 2. 启动依赖服务
ssh user@47.80.65.112
cd /path/to/metapulse
./scripts/deploy/deps-only.sh
# 选择: 1 (启动)
```

**本地机器**：
```bash
# 3. 启动后端（IDEA 或命令行）
cd backend
./gradlew bootRun --args='--spring.profiles.active=dev'

# 4. 启动前端（VSCode 或命令行）
cd frontend
yarn dev

# 5. 访问应用
# http://localhost:3000
```

---

### 场景二：日常开发工作流

**服务器（仅第一次或重启后）**：
```bash
# 确保依赖服务运行
./scripts/deploy/deps-only.sh
# 选择: 1 (启动)
```

**本地机器**：
```bash
# 启动后端
cd backend && ./gradlew bootRun --args='--spring.profiles.active=dev'

# 启动前端（另一个终端）
cd frontend && yarn dev
```

---

### 场景三：生产部署

**服务器**：
```bash
# 1. 构建应用
./scripts/deploy/build.sh full skip-tests

# 2. 部署应用
./scripts/deploy/full.sh
# 选择: 1 (启动所有服务)

# 3. 验证部署
curl http://localhost:8080/actuator/health
```

---

### 场景四：更新部署

**服务器**：
```bash
# 方式一：使用脚本自动化
./scripts/deploy/full.sh
# 选择: 5 (重新构建并部署)

# 方式二：手动步骤
./scripts/deploy/build.sh full skip-tests
docker-compose down
docker-compose up -d
```

---

## 🔍 故障排查

### 依赖服务无法启动

```bash
# 查看详细日志
docker-compose -f docker-compose.services.yml logs

# 检查端口占用
netstat -tuln | grep -E '5432|9092|9200'

# 重启服务
./scripts/deploy/deps-only.sh
# 选择: 2 (重启)
```

### 应用构建失败

```bash
# 检查前端构建
cd frontend
yarn install
yarn build

# 检查后端构建
cd backend
./gradlew clean build --stacktrace
```

### 应用部署失败

```bash
# 查看应用日志
docker-compose logs -f metapulse

# 检查健康状态
curl http://localhost:8080/actuator/health

# 重启应用
docker-compose restart metapulse
```

---

## 📚 相关文档

- [项目主 README](../README.md) - 项目总览
- [部署指南](../README.md#-开发模式) - 详细部署步骤
- [后端开发指南](../backend/README.md) - 后端开发
- [前端开发指南](../frontend/README.md) - 前端开发

---

## ⚠️ 注意事项

1. **脚本运行位置**：
   - `dev/setup.sh` - 在本地运行
   - `deploy/*` - 在服务器运行

2. **服务器 IP**：
   - 当前配置：`47.80.65.112`
   - 修改位置：`application-dev.yml` 和 `docker-compose.services.yml`

3. **Docker 依赖**：
   - 部署脚本需要 Docker 和 Docker Compose
   - 确保 Docker 服务运行：`docker ps`

4. **端口开放**：
   - 服务器防火墙需开放端口：5432, 9092, 9200, 8080

---

<p align="center">
  <b>Happy Deploying! 🚀</b>
</p>

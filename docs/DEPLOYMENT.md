# MetaPulse 部署指南

本文档详细说明 MetaPulse 的两种部署场景，以及服务器和本地开发环境的配置方法。

---

## 📋 目录

- [架构说明](#架构说明)
- [场景 A：本地开发模式](#场景-a本地开发模式)
- [场景 B：完整部署模式](#场景-b完整部署模式)
- [故障排查](#故障排查)
- [附录：网络配置](#附录网络配置)

---

## 架构说明

### 服务器信息
- **IP 地址**: 47.80.65.112
- **操作系统**: Linux
- **容器管理**: Docker + Docker Compose

### 技术栈
- **数据库**: PostgreSQL 14
- **搜索引擎**: Elasticsearch 8.11.0
- **消息队列**: Kafka 7.6.0 (Confluent)
- **后端**: Spring Boot 3.4.5 (Java 17)
- **前端**: React 17 + TypeScript + Vite

### 两种部署场景

| 场景 | 服务器运行 | 本地运行 | 使用场景 |
|------|-----------|---------|---------|
| **场景 A** | 依赖服务 (PostgreSQL, Kafka, Elasticsearch) | 前端 + 后端 | 日常开发 |
| **场景 B** | 所有服务（依赖服务 + 前后端应用） | 无 | 演示、测试、部署验证 |

---

## 场景 A：本地开发模式

**适用场景**：日常开发，本地运行前后端应用，连接服务器依赖服务

### 🖥️ 服务器端配置

#### 1. 防火墙配置

确保开放以下端口：

```bash
# CentOS/RHEL
sudo firewall-cmd --permanent --add-port=5432/tcp    # PostgreSQL
sudo firewall-cmd --permanent --add-port=9200/tcp    # Elasticsearch
sudo firewall-cmd --permanent --add-port=9092/tcp    # Kafka
sudo firewall-cmd --reload

# Ubuntu/Debian
sudo ufw allow 5432/tcp    # PostgreSQL
sudo ufw allow 9200/tcp    # Elasticsearch
sudo ufw allow 9092/tcp    # Kafka
sudo ufw reload
```

#### 2. 启动依赖服务

```bash
# 进入项目目录
cd /path/to/metapulse

# 启动依赖服务（仅 PostgreSQL, Elasticsearch, Kafka）
docker-compose -f docker-compose.services.yml up -d

# 查看服务状态
docker-compose -f docker-compose.services.yml ps

# 预期输出：
# NAME                      STATUS    PORTS
# metapulse-postgres        Up        0.0.0.0:5432->5432/tcp
# metapulse-elasticsearch   Up        0.0.0.0:9200->9200/tcp
# metapulse-kafka           Up        0.0.0.0:9092->9092/tcp
# metapulse-zookeeper       Up
```

#### 3. 验证服务可访问性

从**本地机器**验证：

```bash
# 测试 PostgreSQL 连接
psql -h 47.80.65.112 -U metapulse -d metapulse -p 5432
# 输入密码: metapulse

# 测试 Elasticsearch
curl http://47.80.65.112:9200/_cluster/health

# 测试 Kafka (需要安装 kafkacat 或 kcat)
echo "test" | kcat -P -b 47.80.65.112:9092 -t test-topic
kcat -C -b 47.80.65.112:9092 -t test-topic -o beginning -c 1
```

#### 4. 查看服务日志

```bash
# 查看所有日志
docker-compose -f docker-compose.services.yml logs -f

# 查看特定服务日志
docker-compose -f docker-compose.services.yml logs -f postgres
docker-compose -f docker-compose.services.yml logs -f kafka
docker-compose -f docker-compose.services.yml logs -f elasticsearch
```

---

### 💻 本地开发环境配置

#### 1. 后端配置（IntelliJ IDEA）

##### a. 克隆项目

```bash
git clone <repository-url>
cd metapulse
```

##### b. 配置文件说明

后端已配置 `application-dev.yml`，所有依赖服务指向 `47.80.65.112`：

```yaml
# backend/metadata-service/war/src/main/resources/application-dev.yml
spring:
  datasource:
    url: jdbc:postgresql://47.80.65.112:5432/metapulse

kafka:
  bootstrap:
    servers: 47.80.65.112:9092

elasticsearch:
  host: 47.80.65.112
  port: 9200
```

**无需修改配置文件**。

##### c. 在 IDEA 中创建运行配置

1. **打开运行配置**：Run → Edit Configurations...
2. **创建 Spring Boot 配置**：
   - 点击 "+" → "Spring Boot"
   - **Name**: `GMSApplication-dev`
   - **Main class**: `com.linkedin.gms.GMSApplication`
   - **Module**: `metadata-service.war.main`
   - **JRE**: Java 17
   - **Active profiles**: `dev`
   - **VM options** (可选):
     ```
     -Xms2g -Xmx4g -XX:+UseG1GC
     ```

3. **保存并运行**：
   - 选择 `GMSApplication-dev` 配置
   - 点击运行按钮 (▶️) 或按 `Shift+F10`

##### d. 验证后端启动

```bash
# 健康检查
curl http://localhost:8080/actuator/health

# GraphQL Playground
# 浏览器打开: http://localhost:8080/api/graphql
```

##### e. 首次运行建议

```bash
# 编译项目（首次运行建议）
cd backend
./gradlew :metadata-service:war:classes
```

---

#### 2. 前端配置（VSCode）

##### a. 进入前端目录

```bash
cd frontend
```

##### b. 配置文件说明

前端已配置 `.env.development`，后端代理指向本地：

```env
# frontend/.env.development
VITE_BACKEND_URL=http://localhost:8080
VITE_GRAPHQL_ENDPOINT=/api/graphql
VITE_APP_ENV=development
```

**无需修改配置文件**。

##### c. 安装依赖并启动

```bash
# 安装依赖
yarn install

# 启动开发服务器
yarn dev

# 输出：
# ➜  Local:   http://localhost:3000/
# ➜  Network: use --host to expose
```

##### d. 访问应用

浏览器打开：`http://localhost:3000`

##### e. 开发工具

```bash
# 代码检查
yarn lint

# 类型检查
yarn type-check

# 运行测试
yarn test

# 生成 GraphQL 类型
yarn generate
```

---

### 🔄 场景 A：日常工作流程

```bash
# 1. 服务器端：启动依赖服务（每天开始工作前）
ssh user@47.80.65.112
cd /path/to/metapulse
docker-compose -f docker-compose.services.yml up -d

# 2. 本地：启动后端（Terminal 1）
cd /path/to/metapulse/backend
./gradlew bootRun --args='--spring.profiles.active=dev'

# 3. 本地：启动前端（Terminal 2）
cd /path/to/metapulse/frontend
yarn dev

# 4. 访问应用
# 前端: http://localhost:3000
# 后端: http://localhost:8080
# GraphQL: http://localhost:8080/api/graphql

# 5. 结束工作（可选）
# 服务器端停止依赖服务
docker-compose -f docker-compose.services.yml stop
```

---

## 场景 B：完整部署模式

**适用场景**：演示、测试、部署验证、生产环境

### 🖥️ 服务器端配置

#### 1. 防火墙配置

除了依赖服务端口，还需开放应用端口：

```bash
# CentOS/RHEL
sudo firewall-cmd --permanent --add-port=8080/tcp    # MetaPulse 应用
sudo firewall-cmd --reload

# Ubuntu/Debian
sudo ufw allow 8080/tcp    # MetaPulse 应用
sudo ufw reload
```

#### 2. 构建应用

```bash
# 在本地或服务器构建
cd /path/to/metapulse

# 完整构建（前端 + 后端）
./scripts/build.sh

# 或分别构建
cd frontend && yarn build && cd ..
cd backend && ./gradlew build && cd ..
```

#### 3. 启动所有服务

```bash
# 进入项目目录
cd /path/to/metapulse

# 启动所有服务（依赖服务 + 应用）
docker-compose up -d

# 查看服务状态
docker-compose ps

# 预期输出：
# NAME                      STATUS    PORTS
# metapulse-app             Up        0.0.0.0:8080->8080/tcp
# metapulse-postgres        Up        0.0.0.0:5432->5432/tcp
# metapulse-elasticsearch   Up        0.0.0.0:9200->9200/tcp
# metapulse-kafka           Up        0.0.0.0:9092->9092/tcp
# metapulse-zookeeper       Up
```

#### 4. 验证服务

从**本地机器**验证：

```bash
# 测试应用健康检查
curl http://47.80.65.112:8080/actuator/health

# 浏览器访问
# 前端界面: http://47.80.65.112:8080
# GraphQL Playground: http://47.80.65.112:8080/api/graphql
```

#### 5. 查看日志

```bash
# 查看应用日志
docker-compose logs -f metapulse

# 查看所有日志
docker-compose logs -f

# 查看特定服务日志
docker-compose logs -f postgres
docker-compose logs -f kafka
docker-compose logs -f elasticsearch
```

---

### 🔄 场景 B：完整部署流程

```bash
# 1. 构建应用（本地或服务器）
./scripts/build.sh

# 2. 上传到服务器（如果本地构建）
scp -r . user@47.80.65.112:/path/to/metapulse

# 3. 服务器端：启动所有服务
ssh user@47.80.65.112
cd /path/to/metapulse
docker-compose up -d

# 4. 验证部署
curl http://47.80.65.112:8080/actuator/health

# 5. 访问应用
# 浏览器打开: http://47.80.65.112:8080
```

---

## 故障排查

### 常见问题 1：无法连接到服务器依赖服务

**症状**：本地应用无法连接到 `47.80.65.112` 的 PostgreSQL/Kafka/Elasticsearch

**排查步骤**：

1. **检查防火墙**：

```bash
# 服务器端
sudo firewall-cmd --list-ports  # CentOS/RHEL
sudo ufw status                 # Ubuntu/Debian
```

2. **检查服务状态**：

```bash
# 服务器端
docker-compose -f docker-compose.services.yml ps
```

3. **检查端口监听**：

```bash
# 服务器端
sudo netstat -tuln | grep -E '5432|9092|9200'
```

4. **测试网络连通性**：

```bash
# 本地
ping 47.80.65.112
telnet 47.80.65.112 5432
telnet 47.80.65.112 9092
telnet 47.80.65.112 9200
```

---

### 常见问题 2：Kafka 连接失败

**症状**：
```
Connection to node -1 could not be established
```

**解决方法**：

1. **检查 Kafka 配置**：

确认 `docker-compose.services.yml` 中的配置：

```yaml
KAFKA_ADVERTISED_LISTENERS: INTERNAL://kafka:29092,EXTERNAL://47.80.65.112:9092
KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: INTERNAL:PLAINTEXT,EXTERNAL:PLAINTEXT
KAFKA_INTER_BROKER_LISTENER_NAME: INTERNAL
KAFKA_LISTENERS: INTERNAL://0.0.0.0:29092,EXTERNAL://0.0.0.0:9092
```

2. **重启 Kafka**：

```bash
docker-compose -f docker-compose.services.yml restart kafka

# 等待 30 秒
sleep 30
```

3. **测试 Kafka 连接**：

```bash
# 从本地测试
echo "test-message" | kcat -P -b 47.80.65.112:9092 -t test-topic
kcat -C -b 47.80.65.112:9092 -t test-topic -o beginning -c 1
```

---

### 常见问题 3：后端启动失败

**症状**：Spring Boot 启动时报错

**排查步骤**：

1. **检查 Java 版本**：

```bash
java -version
# 需要 Java 17
```

2. **检查配置文件**：

确认 `application-dev.yml` 中的服务器 IP 正确：

```bash
grep -E 'jdbc|servers|host' backend/metadata-service/war/src/main/resources/application-dev.yml
```

3. **查看完整日志**：

在 IDEA 控制台查看详细错误信息。

4. **验证依赖服务**：

```bash
# 测试 PostgreSQL
psql -h 47.80.65.112 -U metapulse -d metapulse -p 5432

# 测试 Elasticsearch
curl http://47.80.65.112:9200

# 测试 Kafka
kcat -L -b 47.80.65.112:9092
```

---

### 常见问题 4：前端代理失败

**症状**：GraphQL 请求失败，控制台显示 `ERR_CONNECTION_REFUSED`

**排查步骤**：

1. **检查后端是否运行**：

```bash
curl http://localhost:8080/actuator/health
```

2. **检查 Vite 配置**：

确认 `frontend/vite.config.ts` 中的代理配置：

```typescript
proxy: {
  '/api': {
    target: 'http://localhost:8080',
    changeOrigin: true
  }
}
```

3. **重启前端开发服务器**：

```bash
# 停止 Vite (Ctrl+C)
# 重新启动
yarn dev
```

---

### 常见问题 5：Docker 容器无法启动

**症状**：`docker-compose up -d` 失败

**排查步骤**：

1. **查看详细日志**：

```bash
docker-compose -f docker-compose.services.yml logs
```

2. **检查端口占用**：

```bash
sudo netstat -tuln | grep -E '5432|9092|9200'
```

3. **清理并重启**：

```bash
# 停止所有容器
docker-compose -f docker-compose.services.yml down

# 清理卷（谨慎！会删除数据）
docker-compose -f docker-compose.services.yml down -v

# 重新启动
docker-compose -f docker-compose.services.yml up -d
```

---

## 附录：网络配置

### Kafka 双监听器说明

Kafka 配置了两个监听器以支持不同场景：

| 监听器 | 地址 | 用途 | 使用场景 |
|--------|------|------|---------|
| **INTERNAL** | `kafka:29092` | 容器内部通信 | docker-compose 中的 metapulse 应用连接 |
| **EXTERNAL** | `47.80.65.112:9092` | 外部客户端连接 | 本地开发环境连接服务器 Kafka |

**配置示例**：

```yaml
KAFKA_ADVERTISED_LISTENERS: INTERNAL://kafka:29092,EXTERNAL://47.80.65.112:9092
KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: INTERNAL:PLAINTEXT,EXTERNAL:PLAINTEXT
KAFKA_INTER_BROKER_LISTENER_NAME: INTERNAL
KAFKA_LISTENERS: INTERNAL://0.0.0.0:29092,EXTERNAL://0.0.0.0:9092
```

**连接方式**：

- **场景 A**（本地开发）：`bootstrap.servers=47.80.65.112:9092`
- **场景 B**（Docker 内）：`bootstrap.servers=kafka:29092`

---

### 服务端口映射

| 服务 | 容器内端口 | 宿主机端口 | 外部访问地址 |
|------|-----------|-----------|-------------|
| PostgreSQL | 5432 | 5432 | `47.80.65.112:5432` |
| Elasticsearch | 9200 | 9200 | `http://47.80.65.112:9200` |
| Kafka (EXTERNAL) | 9092 | 9092 | `47.80.65.112:9092` |
| Kafka (INTERNAL) | 29092 | - | `kafka:29092` (仅容器内) |
| MetaPulse 应用 | 8080 | 8080 | `http://47.80.65.112:8080` |

---

### 配置文件对比

| 配置项 | application.yml (默认) | application-dev.yml (开发) |
|--------|----------------------|--------------------------|
| PostgreSQL | `${DB_HOST:localhost}` | `47.80.65.112` (硬编码) |
| Kafka | `${KAFKA_BOOTSTRAP_SERVERS:localhost:9092}` | `47.80.65.112:9092` (硬编码) |
| Elasticsearch | `${ELASTICSEARCH_HOST:localhost}` | `47.80.65.112` (硬编码) |
| 认证 | `enabled: ${AUTH_ENABLED:true}` | `enabled: false` |
| 日志级别 | `INFO` | `DEBUG` (更详细) |

---

## 总结

### 场景 A：本地开发模式

**服务器**：运行依赖服务（docker-compose.services.yml）
**本地**：IDEA 运行后端 + VSCode 运行前端
**配置**：application-dev.yml 指向 `47.80.65.112`

### 场景 B：完整部署模式

**服务器**：运行所有服务（docker-compose.yml）
**本地**：无
**配置**：Docker Compose 环境变量

---

**问题反馈**：如有问题，请查看日志或联系技术支持。

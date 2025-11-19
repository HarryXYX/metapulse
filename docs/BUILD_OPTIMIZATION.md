# MetaPulse 构建优化说明

## 内存配置概览

项目已针对 **8GB 内存环境**进行保守优化，留出充足冗余空间。

### 内存分配（保守配置）

```
┌──────────────────────────────────────┐
│ 系统 + 其他进程:      ~3-4GB        │
├──────────────────────────────────────┤
│ 前端构建 (Node.js):    2GB           │
│   • yarn generate:     2GB           │
│   • vite build:        2GB           │
├──────────────────────────────────────┤
│ 后端构建 (Gradle):     2-2.5GB       │
│   • JVM Heap:          2GB           │
│   • MetaSpace:         256MB         │
│   • Worker (x1):       ~256MB        │
├──────────────────────────────────────┤
│ 总计峰值:              ~4-5GB        │
│ 系统冗余:              ~3-4GB ✅     │
└──────────────────────────────────────┘
```

**关键优化**:
- ✅ **单线程构建**：避免多进程并发占用内存
- ✅ **分步构建**：前端和后端之间有 10 秒延迟，确保内存释放
- ✅ **自动清理缓存**：构建后自动清理 node_modules/.cache
- ✅ **充足冗余**：为系统保留 ~4GB 内存，避免 swap

---

## 配置文件

### 1. Gradle 配置 (`backend/gradle.properties`)

```properties
# 保守优化为 8GB 内存机器（留出充足冗余）
org.gradle.jvmargs=-Xmx2048m -XX:MaxMetaspaceSize=256m -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:+DisableExplicitGC
org.gradle.workers.max=1
org.gradle.parallel=false
org.gradle.caching=true
```

**关键参数**:
- `-Xmx2048m`: JVM 最大堆内存 **2GB**（降低 1GB vs 之前）
- `-XX:MaxMetaspaceSize=256m`: 元空间限制 256MB
- `-XX:+UseG1GC`: 使用 G1 垃圾回收器（更好的暂停时间）
- `-XX:MaxGCPauseMillis=200`: 目标 GC 暂停时间 200ms
- `-XX:+DisableExplicitGC`: 禁用显式 GC 调用
- `workers.max=1`: **单线程 worker**（降低并发开销）
- `parallel=false`: **禁用并行构建**（降低内存占用）

### 2. 前端配置 (`frontend/package.json`)

```json
{
  "scripts": {
    "build": "NODE_OPTIONS='--max-old-space-size=2048' vite build",
    "generate": "NODE_OPTIONS='--max-old-space-size=2048' graphql-codegen",
    "test": "NODE_OPTIONS='--max-old-space-size=2048' vitest"
  }
}
```

**关键参数**:
- `--max-old-space-size=2048`: Node.js 堆内存 **2GB**（降低 1GB vs 之前）
- `--openssl-legacy-provider`: 支持旧版 OpenSSL（兼容性）

### 3. 构建脚本优化 (`scripts/deploy/build.sh`)

**关键优化**:
- ✅ **自动清理缓存**：前端构建后自动清理 `node_modules/.cache` 和 `.vite`
- ✅ **分步延迟**：构建步骤之间暂停 10 秒，让系统回收内存
- ✅ **内存监控提示**：显示内存配置和冗余空间

---

## 构建脚本

### 完整构建（推荐用于生产部署）

```bash
./scripts/deploy/build.sh full skip-tests
```

**执行流程**:
1. 前端构建 (`yarn build`) - 峰值 3GB
2. 集成前端资源到后端
3. 后端构建 (`./gradlew build`) - 峰值 3-4GB

**预计时间**: 5-10 分钟（取决于是否跳过测试）

### 仅构建前端

```bash
./scripts/deploy/build.sh frontend-only
```

**适用场景**: 前端代码修改，后端无变化

### 仅构建后端

```bash
./scripts/deploy/build.sh backend-only
```

**适用场景**: 后端代码修改，前端无变化

---

## 性能优化建议

### 1. 启用 Gradle 缓存

缓存已在 `gradle.properties` 中启用：
```properties
org.gradle.caching=true
```

**首次构建**: 慢（需下载依赖、编译所有模块）
**后续构建**: 快（利用缓存，只编译变更部分）

### 2. 清理缓存（构建失败时）

```bash
# 清理 Gradle 缓存
cd backend
./gradlew clean
rm -rf ~/.gradle/caches/

# 清理前端缓存
cd frontend
rm -rf node_modules/.cache
rm -rf dist
```

### 3. 监控内存使用

```bash
# MacOS
top -o MEM

# Linux
htop
free -h
```

### 4. 跳过测试（加速构建）

```bash
# 跳过后端测试（节省 2-3 分钟）
./scripts/deploy/build.sh full skip-tests

# 或者手动跳过
cd backend
./gradlew build -x test
```

---

## 常见问题排查

### 问题 1: 构建时内存溢出

**错误信息**:
```
OutOfMemoryError: Java heap space
或
JavaScript heap out of memory
```

**解决方案**:

1. **检查系统内存**
   ```bash
   # MacOS
   sysctl hw.memsize

   # Linux
   free -h
   ```

2. **关闭其他应用程序**
   构建时关闭浏览器、IDE、Docker Desktop 等

3. **增加 swap（Linux）**
   ```bash
   sudo fallocate -l 4G /swapfile
   sudo chmod 600 /swapfile
   sudo mkswap /swapfile
   sudo swapon /swapfile
   ```

4. **降低并发度**
   修改 `backend/gradle.properties`:
   ```properties
   org.gradle.workers.max=1
   org.gradle.parallel=false
   ```

### 问题 2: CPU 飙升 100%

**原因**: 通常是内存不足导致频繁 swap

**解决方案**:
1. 检查是否在使用 swap（`free -h`）
2. 关闭其他占用内存的进程
3. 分步构建（先前端，后后端）

### 问题 3: Gradle 守护进程卡死

**解决方案**:
```bash
cd backend
./gradlew --stop
./gradlew clean
./gradlew build --no-daemon
```

### 问题 4: 前端构建缓慢

**优化方案**:

1. **使用 SSD 硬盘**（如果还在用 HDD）
2. **清理 node_modules**
   ```bash
   cd frontend
   rm -rf node_modules
   yarn install
   ```
3. **禁用生产优化（开发时）**
   ```bash
   yarn dev  # 使用开发服务器，不构建
   ```

---

## 构建时间参考

| 构建模式 | 预计时间 | 适用场景 |
|---------|---------|---------|
| **完整构建（含测试）** | 10-15分钟 | 首次构建、发布前 |
| **完整构建（跳过测试）** | 5-8分钟 | 快速部署 |
| **仅前端** | 2-3分钟 | 前端修改 |
| **仅后端（跳过测试）** | 3-5分钟 | 后端修改 |
| **增量构建** | 1-2分钟 | 小改动 |

**注意**: 时间会因硬件配置和网络速度而异。

---

## 进阶优化

### 1. 本地构建 + Docker 部署

如果服务器配置较低，可以在本地构建，然后部署到服务器：

```bash
# 本地构建
./scripts/deploy/build.sh full skip-tests

# 构建 Docker 镜像
cd backend
./gradlew docker

# 导出镜像
docker save datahub-gms:latest | gzip > gms-image.tar.gz

# 上传到服务器
scp gms-image.tar.gz user@server:/tmp/

# 服务器加载镜像
ssh user@server
docker load < /tmp/gms-image.tar.gz
docker-compose up -d
```

### 2. 使用 CI/CD

推荐使用 GitHub Actions 或 GitLab CI 进行云端构建：

```yaml
# .github/workflows/build.yml
name: Build and Deploy
on: [push]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Build
        run: ./scripts/deploy/build.sh full skip-tests
      - name: Upload Artifact
        uses: actions/upload-artifact@v3
        with:
          name: war
          path: backend/metadata-service/war/build/libs/war.war
```

### 3. 调整 Linux 内核参数

```bash
# 降低 swap 倾向（优先使用物理内存）
sudo sysctl vm.swappiness=10

# 永久生效
echo 'vm.swappiness=10' | sudo tee -a /etc/sysctl.conf

# 调整文件句柄限制
ulimit -n 65536
```

---

## 总结

✅ **当前配置适用于 8GB 内存环境（保守优化）**
✅ **本地开发和服务器部署使用统一配置**
✅ **峰值内存约 4-5GB，为系统保留 ~4GB 充足冗余**
✅ **单线程构建 + 分步延迟，避免内存峰值**
✅ **使用 G1GC 减少 GC 暂停时间**
✅ **自动清理缓存，释放占用的内存**

### 内存配置对照表

如果你的机器内存不同，可参考以下配置：

| 内存大小 | JVM 堆内存 | Node 堆内存 | Workers | 并行 | 冗余空间 | 适用性 |
|---------|-----------|------------|---------|------|---------|--------|
| **4GB** | 1.5GB | 1.5GB | 1 | 否 | ~1GB | ⚠️ 最低配置 |
| **6GB** | 2GB | 2GB | 1 | 否 | ~2GB | ✅ 可用 |
| **8GB** | **2GB** | **2GB** | **1** | **否** | **~4GB** | ✅ **当前配置（推荐）** |
| **12GB** | 3GB | 3GB | 2 | 可选 | ~6GB | ✅ 舒适 |
| **16GB+** | 4-5GB | 4-5GB | 4 | 是 | ~6GB+ | ✅ 性能优先 |

**说明**:
- **冗余空间**: 为系统和其他进程保留的内存
- **当前配置**: 保守优化，优先稳定性，留出充足冗余
- **4GB 配置**: 需要额外配置 swap 才能稳定运行
- **16GB+ 配置**: 可启用并行构建提升速度

---

## 相关文档

- [Gradle 性能优化](https://docs.gradle.org/current/userguide/performance.html)
- [Node.js 内存管理](https://nodejs.org/en/docs/guides/simple-profiling/)
- [G1GC 调优指南](https://www.oracle.com/technical-resources/articles/java/g1gc.html)

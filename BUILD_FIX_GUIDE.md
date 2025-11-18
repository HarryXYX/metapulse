# MetaPulse Backend 构建问题修复指南

## 问题概述

由于前后端分离（frontend 和 backend 在不同目录），backend 的一些 Gradle 配置仍然引用了前端项目，导致构建失败。

## 已发现的问题

1. ✅ **gradle-wrapper.jar 缺失** - 已解决
2. ✅ **sample-test-plugins 未注册** - 需要在 settings.gradle 中添加
3. ✅ **datahub-web-react 前端依赖** - 需要移除对前端的依赖

## 快速修复（服务器端）

### 方案 A: 使用修复脚本（推荐）

```bash
# 在服务器上执行
cd /opt/metapulse/backend

# 下载或创建修复脚本
cat > fix-build-dependencies.sh << 'EOFSCRIPT'
#!/bin/bash
set -e

echo "修复 Backend 构建依赖..."

# 1. 修复 settings.gradle
if ! grep -q "sample-test-plugins" settings.gradle; then
    sed -i "/include 'metadata-service:plugin'/a include 'metadata-service:plugin:src:test:sample-test-plugins'" settings.gradle
    echo "✓ 已添加 sample-test-plugins"
fi

# 2. 修复 datahub-graphql-core/build.gradle
sed -i "s/^build.dependsOn ':datahub-web-react:graphqlPrettierCheck'/\/\/ &/" datahub-graphql-core/build.gradle
sed -i "s/^spotlessApply.dependsOn ':datahub-web-react:graphqlPrettierWrite'/\/\/ &/" datahub-graphql-core/build.gradle
echo "✓ 已修复 datahub-graphql-core/build.gradle"

# 3. 修复 build.gradle
sed -i "s/^  dependsOn(':datahub-web-react:/  \/\/ &/" build.gradle
echo "✓ 已修复 build.gradle"

echo "✓ 修复完成！"
EOFSCRIPT

# 执行修复
chmod +x fix-build-dependencies.sh
./fix-build-dependencies.sh

# 尝试构建
./gradlew :metadata-service:war:build -x test --no-daemon
```

### 方案 B: 手动修复（逐步操作）

#### 步骤 1: 修复 settings.gradle

```bash
cd /opt/metapulse/backend

# 在 'metadata-service:plugin' 后添加一行
sed -i "/include 'metadata-service:plugin'/a include 'metadata-service:plugin:src:test:sample-test-plugins'" settings.gradle

# 验证
grep -A1 "metadata-service:plugin" settings.gradle
```

应该看到：
```
include 'metadata-service:plugin'
include 'metadata-service:plugin:src:test:sample-test-plugins'
```

#### 步骤 2: 修复 datahub-graphql-core/build.gradle

```bash
cd /opt/metapulse/backend

# 注释掉前端依赖
sed -i "s/^build.dependsOn ':datahub-web-react:graphqlPrettierCheck'/\/\/ build.dependsOn ':datahub-web-react:graphqlPrettierCheck'/" datahub-graphql-core/build.gradle
sed -i "s/^spotlessApply.dependsOn ':datahub-web-react:graphqlPrettierWrite'/\/\/ spotlessApply.dependsOn ':datahub-web-react:graphqlPrettierWrite'/" datahub-graphql-core/build.gradle

# 验证
grep "datahub-web-react" datahub-graphql-core/build.gradle
```

应该看到注释掉的行（以 `//` 开头）

#### 步骤 3: 修复 build.gradle

```bash
cd /opt/metapulse/backend

# 注释掉所有前端依赖
sed -i "s/^  dependsOn(':datahub-web-react:/  \/\/ dependsOn(':datahub-web-react:/" build.gradle

# 验证
grep "datahub-web-react" build.gradle | head -10
```

所有相关行都应该被注释

#### 步骤 4: 尝试构建

```bash
cd /opt/metapulse/backend

# 标准构建（跳过测试）
./gradlew :metadata-service:war:build -x test --no-daemon

# 如果还有问题，使用更彻底的跳过
./gradlew :metadata-service:war:build \
  -x test \
  -x integrationTest \
  -x check \
  --no-daemon
```

### 方案 C: 从 Git 重新拉取（如果已提交修复）

```bash
cd /opt/metapulse

# 拉取最新代码（包含修复）
git pull origin main

# 或者重新 clone
cd /opt
rm -rf metapulse
git clone git@github.com:your-username/metapulse.git
cd metapulse/backend

# 构建
./gradlew :metadata-service:war:build -x test --no-daemon
```

## 常见后续问题

### 问题 1: 仍然提示找不到某个任务

**解决**：使用更彻底的任务跳过

```bash
./gradlew :metadata-service:war:build \
  -x test \
  -x integrationTest \
  -x check \
  -x testClasses \
  --no-daemon \
  --continue
```

### 问题 2: Pegasus 相关错误（Windows 已知问题）

**解决**：必须在 Linux 服务器上构建，Windows 无法解决

### 问题 3: 内存不足

**解决**：调整 Gradle JVM 内存

```bash
# 临时设置
export GRADLE_OPTS="-Xmx4g -XX:MaxMetaspaceSize=512m"
./gradlew :metadata-service:war:build -x test --no-daemon

# 或创建 gradle.properties
cat >> gradle.properties << EOF
org.gradle.jvmargs=-Xmx4g -XX:MaxMetaspaceSize=512m
org.gradle.daemon=false
EOF
```

### 问题 4: 依赖下载缓慢

**解决**：配置国内 Maven 镜像（可选）

```bash
mkdir -p ~/.gradle
cat >> ~/.gradle/init.gradle << 'EOF'
allprojects {
    repositories {
        maven { url 'https://maven.aliyun.com/repository/public/' }
        maven { url 'https://maven.aliyun.com/repository/central' }
        mavenCentral()
    }
}
EOF
```

## 验证构建成功

构建成功后应该看到：

```
BUILD SUCCESSFUL in XXm XXs
XXX actionable tasks: XXX executed
```

WAR 包位置：
```
backend/metadata-service/war/build/libs/war.war
```

验证 WAR 包：
```bash
ls -lh backend/metadata-service/war/build/libs/war.war
# 应该显示 200MB+ 的文件
```

## 下一步：启动应用

```bash
cd /opt/metapulse/backend/metadata-service/war/build/libs

# 前台启动（测试）
java -jar war.war --spring.profiles.active=dev

# 后台启动（生产）
nohup java -Xms2g -Xmx4g -jar war.war > metapulse.log 2>&1 &

# 查看日志
tail -f metapulse.log

# 验证启动
curl http://localhost:8080/actuator/health
```

## 完整修复一键脚本

```bash
#!/bin/bash
# 在服务器上一键修复并构建

cd /opt/metapulse/backend

# 修复 settings.gradle
grep -q "sample-test-plugins" settings.gradle || \
  sed -i "/include 'metadata-service:plugin'/a include 'metadata-service:plugin:src:test:sample-test-plugins'" settings.gradle

# 修复 datahub-graphql-core
sed -i "s/^build.dependsOn ':datahub-web-react:graphqlPrettierCheck'/\/\/ &/" datahub-graphql-core/build.gradle
sed -i "s/^spotlessApply.dependsOn ':datahub-web-react:graphqlPrettierWrite'/\/\/ &/" datahub-graphql-core/build.gradle

# 修复 build.gradle
sed -i "s/^  dependsOn(':datahub-web-react:/  \/\/ &/" build.gradle

# 清理并重新构建
./gradlew clean
./gradlew :metadata-service:war:build -x test --no-daemon

echo ""
echo "构建完成！WAR 包位置："
ls -lh metadata-service/war/build/libs/war.war
```

## 参考文档

- [SERVER_DEPLOYMENT.md](SERVER_DEPLOYMENT.md) - 完整部署指南
- [KAFKA_ARCHITECTURE.md](KAFKA_ARCHITECTURE.md) - Kafka 架构文档
- [CLAUDE.md](CLAUDE.md) - 项目开发指南

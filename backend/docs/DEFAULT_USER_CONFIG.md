# 默认用户配置说明

## 配置文件层次结构

MetaPulse 使用 Spring Boot 的配置层次结构，配置文件按以下优先级加载（从低到高）：

```
1. configuration/application.yaml    (最低 - DataHub 基础配置)
   ↓
2. war/application.yml               (中等 - MetaPulse All-in-One 配置)
   ↓
3. war/application-dev.yml           (最高 - 开发环境专用配置)
```

## 配置文件说明

### 1. war/application.yml (生产环境基础配置)

**路径**: `metadata-service/war/src/main/resources/application.yml`

**作用**:
- MetaPulse All-in-One 架构的主配置文件
- 提供生产环境的默认值
- Docker 部署时读取此文件

**默认用户配置**:
```yaml
defaultUser:
  enabled: ${DEFAULT_USER_ENABLED:true}
  username: ${DEFAULT_USER_USERNAME:datahub}
  password: ${DEFAULT_USER_PASSWORD:datahub}
  fullName: ${DEFAULT_USER_FULL_NAME:DataHub Admin}
  email: ${DEFAULT_USER_EMAIL:admin@example.com}
  title: ${DEFAULT_USER_TITLE:Administrator}
```

### 2. war/application-dev.yml (开发环境配置)

**路径**: `metadata-service/war/src/main/resources/application-dev.yml`

**作用**:
- 开发环境专用配置
- 使用 `--spring.profiles.active=dev` 参数激活
- 覆盖 application.yml 中的配置

**默认用户配置** (覆盖生产环境配置):
```yaml
defaultUser:
  enabled: true
  username: metapulse-admin
  password: metapulse-admin
  fullName: MetaPulse Admin
  email: admin@metapulse.com
  title: Administrator
```

### 3. configuration/application.yaml (DataHub 基础配置)

**路径**: `metadata-service/configuration/src/main/resources/application.yaml`

**作用**:
- DataHub 原始的基础配置文件
- 通过 `factories` 模块被 war 依赖
- 提供所有 DataHub 组件的默认配置
- **会被 war 模块的配置覆盖**

**依赖链**: `war` → `factories` → `configuration`

## 使用方式

### 开发环境 (本地启动)

```bash
cd backend
./gradlew :metadata-service:war:bootRun --args='--spring.profiles.active=dev'
```

**生效配置**:
- 用户名: `metapulse-admin`
- 密码: `metapulse-admin`
- 来源: `application-dev.yml`

### 生产环境 (Docker 部署)

```bash
docker-compose up -d metapulse
```

**生效配置**:
- 用户名: 通过环境变量 `DEFAULT_USER_USERNAME` 指定，默认 `datahub`
- 密码: 通过环境变量 `DEFAULT_USER_PASSWORD` 指定，默认 `datahub`
- 来源: `application.yml` + 环境变量

### 使用环境变量覆盖

在 Docker Compose 或 Kubernetes 中，可以通过环境变量覆盖默认配置：

```yaml
# docker-compose.yml
services:
  metapulse:
    environment:
      - DEFAULT_USER_ENABLED=true
      - DEFAULT_USER_USERNAME=admin
      - DEFAULT_USER_PASSWORD=secure_password_123
      - DEFAULT_USER_FULL_NAME=System Administrator
      - DEFAULT_USER_EMAIL=admin@company.com
```

## 配置属性类

**文件**: `com.linkedin.gms.config.DefaultUserProperties`

```java
@ConfigurationProperties(prefix = "default-user")
public class DefaultUserProperties {
    private boolean enabled = true;
    private String username = "datahub";
    private String password = "datahub";
    private String fullName = "DataHub Admin";
    private String email = "admin@example.com";
    private String title = "Administrator";
}
```

## 用户创建流程

1. **启动时自动执行**: `DefaultUserInitializer` 实现 `ApplicationRunner` 接口
2. **检查配置**: 读取 `DefaultUserProperties` 配置
3. **创建用户**: 调用 `NativeUserService.createNativeUser()`
4. **异常处理**:
   - 用户已存在 → 记录日志，继续启动
   - 其他错误 → 记录错误日志，不中断启动
5. **日志输出**: 成功时打印用户名和密码

## 安全注意事项

⚠️ **重要**:
1. **不要使用默认密码**: 生产环境必须修改默认密码
2. **使用环境变量**: 通过环境变量传递敏感信息，不要硬编码
3. **启用认证**: 生产环境确保 `authentication.enabled=true`
4. **定期更换密码**: 建议定期更换管理员密码

## 禁用默认用户创建

如果你想手动创建用户，可以禁用自动创建：

### 方式1: 修改配置文件
```yaml
defaultUser:
  enabled: false
```

### 方式2: 环境变量
```bash
export DEFAULT_USER_ENABLED=false
./gradlew bootRun
```

## 故障排查

### 问题: 用户创建失败

**日志示例**:
```
❌ Failed to initialize default user
```

**可能原因**:
1. 用户名是保留名称 (如 `datahub`, `__datahub_system`)
2. 数据库连接失败
3. 用户已存在但抛出异常

**解决方案**:
1. 更换用户名 (避免使用 `datahub`)
2. 检查数据库连接
3. 查看详细错误日志

### 问题: 配置未生效

**检查顺序**:
1. 确认启动命令包含 `--spring.profiles.active=dev`
2. 检查配置文件路径是否正确
3. 查看启动日志中的 "Active profiles"
4. 确认 `DefaultUserProperties` Bean 是否加载

## 示例场景

### 场景1: 本地开发 (使用 metapulse-admin)

```bash
# 使用 application-dev.yml 配置
./gradlew bootRun --args='--spring.profiles.active=dev'

# 登录信息
# Username: metapulse-admin
# Password: metapulse-admin
```

### 场景2: 生产部署 (自定义管理员)

```yaml
# docker-compose.yml
environment:
  - DEFAULT_USER_USERNAME=prod_admin
  - DEFAULT_USER_PASSWORD=${ADMIN_PASSWORD}  # 从 .env 读取
  - DEFAULT_USER_EMAIL=admin@company.com
```

### 场景3: 多环境配置

创建不同的 profile 配置:
- `application-dev.yml` - 开发环境 (metapulse-admin)
- `application-test.yml` - 测试环境 (test-admin)
- `application-prod.yml` - 生产环境 (通过环境变量)

## 总结

✅ **正确做法**:
1. 开发环境使用 `application-dev.yml` 的固定密码
2. 生产环境通过环境变量传递密码
3. 定期更换管理员密码
4. 启用认证保护

❌ **错误做法**:
1. 生产环境使用默认密码
2. 在代码中硬编码密码
3. 使用保留用户名 (如 `datahub`)
4. 禁用认证

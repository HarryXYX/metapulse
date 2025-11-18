#!/bin/bash
# 修复 Backend 构建依赖问题
# 移除所有对不存在项目的依赖

set -e

echo "================================================"
echo "修复 MetaPulse Backend 构建依赖"
echo "================================================"

cd "$(dirname "$0")"

# 1. 修复 settings.gradle - 添加 sample-test-plugins
echo "[1/4] 修复 settings.gradle..."
if ! grep -q "include 'metadata-service:plugin:src:test:sample-test-plugins'" settings.gradle; then
    sed -i "/include 'metadata-service:plugin'/a include 'metadata-service:plugin:src:test:sample-test-plugins'" settings.gradle
    echo "  ✓ 已添加 sample-test-plugins"
else
    echo "  ✓ sample-test-plugins 已存在"
fi

# 2. 修复 datahub-graphql-core/build.gradle - 移除前端依赖
echo "[2/4] 修复 datahub-graphql-core/build.gradle..."
if grep -q "build.dependsOn ':datahub-web-react:" datahub-graphql-core/build.gradle; then
    sed -i "s/^build.dependsOn ':datahub-web-react:graphqlPrettierCheck'/\/\/ build.dependsOn ':datahub-web-react:graphqlPrettierCheck' \/\/ Removed: frontend is separate/" datahub-graphql-core/build.gradle
    sed -i "s/^spotlessApply.dependsOn ':datahub-web-react:graphqlPrettierWrite'/\/\/ spotlessApply.dependsOn ':datahub-web-react:graphqlPrettierWrite' \/\/ Removed: frontend is separate/" datahub-graphql-core/build.gradle
    echo "  ✓ 已移除前端依赖"
else
    echo "  ✓ 前端依赖已移除"
fi

# 3. 修复 build.gradle - 移除前端依赖
echo "[3/4] 修复 build.gradle..."
if grep -q "dependsOn(':datahub-web-react:" build.gradle; then
    sed -i "s/^  dependsOn(':datahub-web-react:/  \/\/ dependsOn(':datahub-web-react:/" build.gradle
    echo "  ✓ 已移除前端依赖"
else
    echo "  ✓ 前端依赖已移除"
fi

# 4. 注释掉所有 :docker: 相关的依赖（如果存在）
echo "[4/4] 检查 docker 依赖..."
DOCKER_DEPS=$(grep -r "dependsOn.*:docker:" --include="build.gradle" . 2>/dev/null || true)
if [ -n "$DOCKER_DEPS" ]; then
    echo "  ⚠ 发现 docker 依赖，建议使用 -x integrationTest 跳过集成测试"
    echo "$DOCKER_DEPS"
else
    echo "  ✓ 无 docker 依赖问题"
fi

echo ""
echo "================================================"
echo "✓ 修复完成！"
echo "================================================"
echo ""
echo "现在可以尝试构建："
echo "  ./gradlew :metadata-service:war:build -x test --no-daemon"
echo ""
echo "如果还有问题，使用更彻底的跳过："
echo "  ./gradlew :metadata-service:war:build -x test -x integrationTest --no-daemon"
echo ""

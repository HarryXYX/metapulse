# MetaPulse Frontend - 前端开发指南

> React + TypeScript + Vite 构建的现代化元数据管理平台前端

---

## 📋 目录

- [技术栈](#-技术栈)
- [快速开始](#-快速开始)
- [项目结构](#-项目结构)
- [开发指南](#-开发指南)
- [GraphQL 集成](#-graphql-集成)
- [样式与主题](#-样式与主题)
- [测试](#-测试)
- [构建部署](#-构建部署)
- [常见问题](#-常见问题)

---

## 🔧 技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| **React** | 17 | UI 框架 |
| **TypeScript** | Latest | 类型系统 |
| **Vite** | Latest | 构建工具与开发服务器 |
| **Apollo Client** | 3.3.19 | GraphQL 客户端 |
| **Ant Design** | 4.24.7 | UI 组件库 |
| **styled-components** | - | CSS-in-JS 样式方案 |
| **Visx** | 3.x | 数据可视化库 |
| **React Router** | 6 | 路由管理 |

---

## 🚀 快速开始

### 前置要求

- **Node.js 18+** - [下载链接](https://nodejs.org/)
- **Yarn** - `npm install -g yarn`
- **后端服务** - 确保后端运行在 `http://localhost:8080`

### 安装依赖

```bash
cd frontend
yarn install
```

### 启动开发服务器

```bash
# 启动开发服务器（端口 3000）
yarn dev

# 浏览器访问
# http://localhost:3000
```

### 常用命令

```bash
# 开发
yarn dev                  # 启动开发服务器（热更新）
yarn dev --host          # 暴露到网络（允许局域网访问）

# 构建
yarn build               # 生产构建
yarn build:analyze       # 构建并分析打包体积

# 代码质量
yarn lint                # 运行 ESLint
yarn lint --fix          # 自动修复 Lint 问题
yarn format              # 运行 Prettier 格式化
yarn type-check          # TypeScript 类型检查

# GraphQL
yarn generate            # 从 schema 生成 TypeScript 类型

# 测试
yarn test                # 运行所有测试
yarn test:watch          # 监视模式运行测试
yarn test path/to/file.test.tsx --run  # 运行特定测试
```

---

## 📁 项目结构

```
frontend/
├── src/
│   ├── app/                    # 应用主目录（按页面组织）
│   │   ├── analytics/          # 数据分析页面
│   │   ├── browse/             # 数据浏览页面
│   │   ├── entity/             # 实体详情页面
│   │   │   ├── dataset/        # 数据集实体
│   │   │   ├── dashboard/      # 仪表盘实体
│   │   │   ├── user/           # 用户实体
│   │   │   └── shared/         # 共享组件
│   │   ├── lineage/            # 数据血缘页面
│   │   ├── search/             # 搜索页面
│   │   ├── settings/           # 设置页面
│   │   └── shared/             # 全局共享组件
│   │
│   ├── graphql/                # GraphQL 相关
│   │   ├── *.graphql           # GraphQL 查询定义
│   │   ├── search.graphql      # 搜索查询
│   │   ├── browse.graphql      # 浏览查询
│   │   └── generated.ts        # 自动生成的类型
│   │
│   ├── conf/                   # 全局配置
│   │   ├── theme/              # 主题配置
│   │   │   ├── types.ts        # 主题类型定义
│   │   │   ├── themes.ts       # 主题配置
│   │   │   └── *.config.json   # Ant Design 主题
│   │   └── Global.tsx          # 全局配置组件
│   │
│   ├── types/                  # TypeScript 类型定义
│   ├── utils/                  # 工具函数
│   ├── images/                 # 图片资源
│   ├── App.tsx                 # 应用入口
│   ├── main.tsx                # React 渲染入口
│   └── index.css               # 全局样式
│
├── public/                     # 静态资源
│   └── assets/                 # 公共资源
│
├── .env.development            # 开发环境变量
├── .env.production             # 生产环境变量
├── vite.config.ts              # Vite 配置
├── tsconfig.json               # TypeScript 配置
├── package.json                # NPM 依赖
├── codegen.yml                 # GraphQL Code Generator 配置
├── .eslintrc.js                # ESLint 配置
└── .prettierrc                 # Prettier 配置
```

### 组件组织原则

#### 按页面组织（Page-based Organization）

```
src/app/
├── analytics/           # 数据分析功能
│   ├── AnalyticsPage.tsx
│   ├── components/      # 页面专用组件
│   └── README.md
│
├── search/              # 搜索功能
│   ├── SearchPage.tsx
│   ├── SearchResults.tsx
│   ├── SearchFilters.tsx
│   └── components/
│
└── shared/              # 跨页面共享组件
    ├── components/      # 通用 UI 组件
    ├── hooks/           # 自定义 Hooks
    └── utils/           # 工具函数
```

#### 实体组织（Entity-based）

```
src/app/entity/
├── dataset/             # 数据集实体
│   ├── DatasetProfile.tsx
│   ├── DatasetPreview.tsx
│   ├── DatasetSchema.tsx
│   └── components/
│
├── dashboard/           # 仪表盘实体
│   ├── DashboardProfile.tsx
│   ├── DashboardPreview.tsx
│   └── components/
│
└── shared/              # 实体间共享组件
    ├── EntityHeader.tsx
    ├── EntityTabs.tsx
    └── EntitySidebar.tsx
```

---

## 💻 开发指南

### 环境配置

#### .env.development（开发环境）

```env
# 后端 API 地址
VITE_BACKEND_URL=http://localhost:8080

# GraphQL 端点
VITE_GRAPHQL_ENDPOINT=/api/graphql

# 应用环境
VITE_APP_ENV=development

# 日志级别
VITE_LOG_LEVEL=debug
```

**开发服务器代理配置**：

`vite.config.ts` 中配置了自动代理：

```typescript
export default defineConfig({
  server: {
    port: 3000,
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
      },
    },
  },
});
```

**API 请求流程**：
```
浏览器请求: http://localhost:3000/api/graphql
    ↓ Vite 代理
后端处理: http://localhost:8080/api/graphql
```

#### .env.production（生产环境）

```env
# 生产环境使用相对路径（同域部署）
VITE_BACKEND_URL=

# GraphQL 端点
VITE_GRAPHQL_ENDPOINT=/api/graphql

# 应用环境
VITE_APP_ENV=production

# 日志级别
VITE_LOG_LEVEL=error
```

### 开发工作流程

```bash
# 1. 启动后端服务
cd backend
./gradlew bootRun --args='--spring.profiles.active=dev'

# 2. 启动前端开发服务器
cd frontend
yarn dev

# 3. 访问应用
# http://localhost:3000

# 4. 热更新开发
# 修改代码后，Vite 会自动刷新页面
```

### 添加新页面

1. **创建页面组件**：

```bash
mkdir -p src/app/myfeature
touch src/app/myfeature/MyFeaturePage.tsx
```

2. **定义组件**：

```typescript
// src/app/myfeature/MyFeaturePage.tsx
import React from 'react';
import styled from 'styled-components';

const PageContainer = styled.div`
  padding: 24px;
`;

export const MyFeaturePage: React.FC = () => {
  return (
    <PageContainer>
      <h1>My Feature</h1>
    </PageContainer>
  );
};
```

3. **添加路由**（在 `App.tsx` 中）：

```typescript
import { MyFeaturePage } from './app/myfeature/MyFeaturePage';

// ...
<Routes>
  <Route path="/my-feature" element={<MyFeaturePage />} />
</Routes>
```

### 添加共享组件

```bash
# 创建组件目录
mkdir -p src/app/shared/components/MyComponent

# 创建组件文件
touch src/app/shared/components/MyComponent/MyComponent.tsx
touch src/app/shared/components/MyComponent/index.ts
```

**组件示例**：

```typescript
// MyComponent.tsx
import React from 'react';
import styled from 'styled-components';

interface MyComponentProps {
  title: string;
  onClick?: () => void;
}

const Container = styled.div`
  padding: 16px;
  background: ${(props) => props.theme.colors.background};
`;

export const MyComponent: React.FC<MyComponentProps> = ({ title, onClick }) => {
  return (
    <Container onClick={onClick}>
      <h3>{title}</h3>
    </Container>
  );
};

// index.ts
export { MyComponent } from './MyComponent';
```

---

## 🔌 GraphQL 集成

### GraphQL 查询定义

在 `src/graphql/` 目录下创建 `.graphql` 文件：

```graphql
# src/graphql/dataset.graphql

query getDataset($urn: String!) {
  dataset(urn: $urn) {
    urn
    name
    description
    platform {
      name
    }
    ownership {
      owners {
        owner {
          urn
          name
        }
      }
    }
    schema {
      fields {
        fieldPath
        type
        description
      }
    }
  }
}
```

### 生成 TypeScript 类型

```bash
# 运行 Code Generator
yarn generate

# 生成的文件：src/graphql/generated.ts
```

### 使用生成的类型

```typescript
import { useGetDatasetQuery } from '../graphql/generated';

export const DatasetProfile: React.FC<{ urn: string }> = ({ urn }) => {
  const { data, loading, error } = useGetDatasetQuery({
    variables: { urn },
  });

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error.message}</div>;

  return (
    <div>
      <h1>{data?.dataset?.name}</h1>
      <p>{data?.dataset?.description}</p>
    </div>
  );
};
```

### GraphQL Code Generator 配置

`codegen.yml`：

```yaml
overwrite: true
schema: http://localhost:8080/api/graphql
documents: 'src/graphql/**/*.graphql'
generates:
  src/graphql/generated.ts:
    plugins:
      - typescript
      - typescript-operations
      - typescript-react-apollo
    config:
      withHooks: true
      withComponent: false
```

---

## 🎨 样式与主题

### 主题系统

#### 主题配置（themes.ts）

```typescript
export const themeV2 = {
  colors: {
    primary: '#1890ff',
    success: '#52c41a',
    warning: '#faad14',
    error: '#ff4d4f',
    background: '#ffffff',
    backgroundDark: '#f0f2f5',
    text: '#000000',
    textSecondary: '#8c8c8c',
  },
  styles: {
    borderRadius: '4px',
    boxShadow: '0 2px 8px rgba(0,0,0,0.1)',
  },
  assets: {
    logoUrl: '/assets/logo.png',
  },
};
```

#### 使用主题

```typescript
import styled from 'styled-components';

const Button = styled.button`
  background: ${(props) => props.theme.colors.primary};
  color: white;
  border-radius: ${(props) => props.theme.styles.borderRadius};
  padding: 8px 16px;

  &:hover {
    opacity: 0.8;
  }
`;
```

### Styled Components 规范

#### ✅ 推荐写法

```typescript
// 使用 styled-components
const Container = styled.div`
  padding: 24px;
  background: ${(props) => props.theme.colors.background};
`;

// 支持 props
interface CardProps {
  highlighted?: boolean;
}

const Card = styled.div<CardProps>`
  border: 1px solid #d9d9d9;
  background: ${(props) => (props.highlighted ? '#e6f7ff' : 'white')};
`;
```

#### ❌ 避免写法

```typescript
// 不要使用内联样式
<div style={{ padding: '24px', background: 'white' }}>

// 不要使用传统 CSS 类
<div className="my-custom-class">
```

### Ant Design 组件

```typescript
import { Button, Table, Modal } from 'antd';

export const MyComponent = () => {
  return (
    <>
      <Button type="primary">Primary Button</Button>
      <Table dataSource={data} columns={columns} />
    </>
  );
};
```

---

## 🧪 测试

### 运行测试

```bash
# 运行所有测试
yarn test

# 监视模式
yarn test:watch

# 运行特定文件
yarn test src/app/search/SearchPage.test.tsx --run

# 覆盖率报告
yarn test --coverage
```

### 测试示例

```typescript
// MyComponent.test.tsx
import { render, screen, fireEvent } from '@testing-library/react';
import { MyComponent } from './MyComponent';

describe('MyComponent', () => {
  it('renders title correctly', () => {
    render(<MyComponent title="Test Title" />);
    expect(screen.getByText('Test Title')).toBeInTheDocument();
  });

  it('calls onClick when clicked', () => {
    const handleClick = jest.fn();
    render(<MyComponent title="Test" onClick={handleClick} />);

    fireEvent.click(screen.getByText('Test'));
    expect(handleClick).toHaveBeenCalledTimes(1);
  });
});
```

---

## 🏗️ 构建部署

### 本地构建

```bash
# 生产构建
yarn build

# 输出目录: dist/
ls -lh dist/
```

### 预览生产构建

```bash
# 构建并预览
yarn build
yarn preview

# 访问: http://localhost:4173
```

### 分析打包体积

```bash
# 构建并生成分析报告
yarn build:analyze

# 会自动打开浏览器显示打包分析图
```

### 集成到后端

```bash
# 1. 前端构建
yarn build

# 2. 复制到后端（自动）
cd ../backend
./gradlew :metadata-service:war:integrateFrontend

# 3. 验证
ls -la backend/metadata-service/war/src/main/resources/static/
```

### 性能优化

#### Vite 配置优化

```typescript
// vite.config.ts
export default defineConfig({
  build: {
    rollupOptions: {
      output: {
        manualChunks: {
          'react-vendor': ['react', 'react-dom', 'react-router-dom'],
          'antd-vendor': ['antd'],
          'graphql-vendor': ['@apollo/client', 'graphql'],
        },
      },
    },
    chunkSizeWarningLimit: 1000,
  },
});
```

---

## ❓ 常见问题

### 1. 开发服务器无法启动

**症状**：`yarn dev` 失败

**解决方法**：

```bash
# 删除缓存和依赖
rm -rf node_modules yarn.lock .vite

# 重新安装
yarn install

# 重新启动
yarn dev
```

### 2. GraphQL 请求失败

**症状**：`ERR_CONNECTION_REFUSED` 或 404

**排查步骤**：

```bash
# 1. 确认后端运行
curl http://localhost:8080/actuator/health

# 2. 测试 GraphQL 端点
curl http://localhost:8080/api/graphql

# 3. 检查环境变量
cat .env.development

# 4. 检查 Vite 代理配置
cat vite.config.ts
```

### 3. 类型生成失败

**症状**：`yarn generate` 报错

**解决方法**：

```bash
# 1. 确认后端 GraphQL 可访问
curl http://localhost:8080/api/graphql

# 2. 重新生成
yarn generate

# 3. 如果仍然失败，检查 codegen.yml 配置
cat codegen.yml
```

### 4. 样式不生效

**症状**：styled-components 样式没有应用

**解决方法**：

```bash
# 1. 确认 styled-components 安装
yarn add styled-components

# 2. 检查 ThemeProvider 是否包裹应用
# App.tsx 中应有:
# <ThemeProvider theme={theme}>...</ThemeProvider>

# 3. 重启开发服务器
yarn dev
```

### 5. 热更新不工作

**症状**：修改代码后页面不自动刷新

**解决方法**：

```bash
# 1. 清理缓存
rm -rf .vite

# 2. 重启开发服务器
yarn dev

# 3. 如果仍然不工作，尝试禁用浏览器缓存
# 浏览器开发工具 → Network → Disable cache
```

### 6. 构建产物过大

**症状**：`dist/` 目录体积过大

**解决方法**：

```bash
# 1. 分析打包体积
yarn build:analyze

# 2. 启用代码分割（vite.config.ts）
# manualChunks 配置

# 3. 移除未使用的依赖
yarn autoclean --init
yarn autoclean --force
```

---

## 🔗 相关资源

### 内部文档

- [项目主 README](../README.md) - 项目总览
- [后端开发指南](../backend/README.md) - 后端开发
- [CLAUDE.md](../CLAUDE.md) - Claude Code 项目指引

### 代码规范

详见 [CLAUDE.md](CLAUDE.md)：

- 使用 `type` 而非 `interface` 定义 Props
- 使用 styled-components 而非内联样式
- 遵循 Airbnb JavaScript Style Guide
- 使用 Prettier 格式化代码

### 外部文档

- [React 官方文档](https://reactjs.org/)
- [TypeScript 官方文档](https://www.typescriptlang.org/)
- [Vite 官方文档](https://vitejs.dev/)
- [Ant Design 官方文档](https://ant.design/)
- [styled-components 官方文档](https://styled-components.com/)
- [Apollo Client 官方文档](https://www.apollographql.com/docs/react/)
- [Visx 官方文档](https://airbnb.io/visx/)

---

<p align="center">
  <b>Happy Coding! 🚀</b>
</p>
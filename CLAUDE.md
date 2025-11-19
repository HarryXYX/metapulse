# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

MetaPulse is an enterprise metadata management platform based on DataHub, using a **frontend-backend separated Monorepo architecture** with an **All-in-One backend deployment**.

### Key Architecture Points

- **Monorepo Structure**: Both frontend and backend code reside in the same repository
- **All-in-One Backend**: Single WAR package containing Web services and Kafka Consumers
- **Independent Development**: Frontend and backend can be developed, built, and tested independently
- **Local Method Calls**: EntityClient uses Java implementation without HTTP overhead

### Directory Structure

```
metapulse/
├── frontend/              # React + TypeScript + Vite frontend
├── backend/               # Gradle multi-module Java backend
├── scripts/               # Build and development scripts
├── docker/                # Docker configurations
└── docker-compose.yml     # Service orchestration
```

## Development Commands

### Environment Setup

```bash
# Initialize environment (checks dependencies, installs packages)
./scripts/setup.sh

# Start dependency services (MySQL, Elasticsearch, Kafka)
docker-compose up -d mysql elasticsearch kafka
```

### Frontend Development (VSCode recommended)

```bash
cd frontend

# Install dependencies
yarn install

# Start dev server on localhost:3000 (with hot reload)
yarn dev

# Generate TypeScript types from GraphQL schemas
yarn generate

# Linting and formatting
yarn lint              # Run linting
yarn lint --fix        # Fix linting issues
yarn format            # Run Prettier

# Type checking
yarn type-check

# Testing
yarn test              # Run all tests
yarn test path/to/file.test.tsx --run  # Run specific test

# Build for production
yarn build
```

**Frontend Notes**:
- Development server runs on `http://localhost:3000`
- API requests are proxied to `http://localhost:8080`
- Hot Module Replacement (HMR) is enabled
- See `frontend/CLAUDE.md` for detailed style guide

### Backend Development (IntelliJ IDEA recommended)

```bash
cd backend

# Start development server
./gradlew bootRun

# Start with specific profile
./gradlew bootRun --args='--spring.profiles.active=development'

# Testing
./gradlew test                           # Run all tests
./gradlew :metadata-service:war:test    # Run specific module tests

# Building
./gradlew build                          # Build all modules
./gradlew build -x test                 # Build without tests
./gradlew clean                         # Clean build artifacts
```

**Backend Notes**:
- Backend runs on `http://localhost:8080`
- GraphQL Playground: `http://localhost:8080/api/graphql`
- Health check: `http://localhost:8080/actuator/health`

### Integrated Build

```bash
# Build everything (frontend + backend)
./scripts/build.sh

# Frontend-only build
./scripts/build.sh frontend-only

# Backend-only build
./scripts/build.sh backend-only

# Build without tests
./scripts/build.sh full skip-tests

# Integrate frontend assets into backend
cd backend
./gradlew :metadata-service:war:integrateFrontend
```

**Build Output**:
- Frontend: `frontend/dist/`
- Backend WAR (includes frontend): `backend/metadata-service/war/build/libs/war.war`

### Running in Development

**Option 1: Separate processes (recommended for development)**
```bash
# Terminal 1 - Backend
./scripts/dev.sh backend

# Terminal 2 - Frontend
./scripts/dev.sh frontend
```

**Option 2: Docker Compose**
```bash
# Build first
./scripts/build.sh

# Start all services
docker-compose up -d

# View logs
docker-compose logs -f metapulse
```

## Architecture Details

### Backend Gradle Modules (75 total)

**Core modules**:
- `entity-registry` - Entity type definitions
- `metadata-models` - Data models and schemas
- `metadata-io` - I/O operations and persistence
- `metadata-auth` - Authentication and authorization
- `metadata-utils` - Shared utilities

**Service modules** (`metadata-service/`):
- `war/` - **Main All-in-One WAR application**
- `graphql-servlet-impl/` - GraphQL API implementation
- `restli-servlet-impl/` - REST API implementation
- `auth-servlet-impl/` - Authentication servlet
- `configuration/` - Application configuration

**Consumer modules** (`metadata-jobs/`):
- `mce-consumer-job` - Metadata Change Event consumer
- `mae-consumer-job` - Metadata Audit Event consumer
- `pe-consumer` - Platform Event consumer

All consumers are embedded in the WAR for All-in-One deployment.

### Frontend Architecture

- **Framework**: React 17 + TypeScript + Vite
- **GraphQL Client**: Apollo Client 3.3.19
- **UI Library**: Ant Design 4.24.7
- **Visualization**: Visx 3.x
- **Styling**: styled-components

**Key directories**:
- `src/app/` - Application components (page-based organization)
- `src/graphql/` - GraphQL queries and generated types
- `src/conf/` - Global configuration
- See `frontend/CLAUDE.md` for detailed component organization

### Technology Stack

| Layer | Technology | Version |
|-------|-----------|---------|
| Backend | Java | 17 |
| Backend | Spring Boot | 3.4.5 |
| Backend | Gradle | 8.14.3 |
| Frontend | React | 17 |
| Frontend | TypeScript | Latest |
| Frontend | Vite | Latest |
| Search | Elasticsearch | 8.17.4 |
| Database | MySQL | 8.0+ |
| Messaging | Kafka | 8.0.0 |

## Common Development Workflows

### Adding a GraphQL Query

1. Define query in `frontend/src/graphql/*.graphql`
2. Run `yarn generate` to create TypeScript types
3. Import and use generated types in components

### Testing Changes Locally

1. Start backend: `cd backend && ./gradlew bootRun`
2. Start frontend: `cd frontend && yarn dev`
3. Access at `http://localhost:3000`

### Building for Production

```bash
# Complete build
./scripts/build.sh

# Deploy WAR file
java -jar backend/metadata-service/war/build/libs/war.war
```

### Working with Docker

```bash
# Build Docker image
cd backend
./gradlew docker

# Start with Docker Compose
docker-compose up -d

# View specific service logs
docker-compose logs -f metapulse
```

## Environment Configuration

### Backend Environment Variables

Key variables (see `.env.example` for complete list):
- `SERVER_PORT` - Service port (default: 8080)
- `DB_HOST`, `DB_PORT`, `DB_DATABASE` - MySQL connection
- `ELASTICSEARCH_HOST`, `ELASTICSEARCH_PORT` - Search engine
- `KAFKA_BOOTSTRAP_SERVERS` - Message queue
- `MAE_CONSUMER_ENABLED`, `MCE_CONSUMER_ENABLED`, `PE_CONSUMER_ENABLED` - Enable/disable consumers

### Frontend Environment Variables

**Development** (`.env.development`):
- `VITE_BACKEND_URL=http://localhost:8080`
- `VITE_GRAPHQL_ENDPOINT=/api/graphql`
- `VITE_APP_ENV=development`

**Production** (`.env.production`):
- `VITE_BACKEND_URL=` (empty for same-origin)
- `VITE_GRAPHQL_ENDPOINT=/api/graphql`
- `VITE_APP_ENV=production`

## Code Quality Standards

### Frontend
- Follow Airbnb JavaScript Style Guide
- Use TypeScript interfaces for props
- Prefer `type` over `interface`
- Use styled-components for styling
- Run linter and type-check before committing

### Backend
- Follow Google Java Style Guide
- Write unit tests for all new code
- Use Spring Boot best practices
- Document public APIs with Javadoc

### Git Commits
- Use Conventional Commits format
- Include meaningful commit messages
- Reference issue numbers when applicable

## Troubleshooting

### Frontend build failures
```bash
cd frontend
rm -rf node_modules yarn.lock .cache
yarn install
yarn build
```

### Backend startup issues
- Check MySQL: `docker-compose ps mysql`
- Check Elasticsearch: `curl http://localhost:9200`
- Check Kafka: `docker-compose logs kafka`

### GraphQL proxy failures
- Verify backend is running on port 8080
- Check `VITE_BACKEND_URL` in frontend `.env.development`
- Test GraphQL endpoint: `curl http://localhost:8080/api/graphql`

## Important Notes

- **All-in-One Architecture**: The WAR file contains both web services and Kafka consumers
- **Frontend Integration**: Frontend assets are built separately then integrated into the WAR
- **Development Isolation**: Frontend and backend can be developed independently
- **Monorepo Benefits**: Unified version control, easier refactoring across stack
- 我的根目录里的datahub项目就是datahub的源码，具体路径是/project/datahub，我所有问到的datahub的问题，都通过我本地的源码去解答
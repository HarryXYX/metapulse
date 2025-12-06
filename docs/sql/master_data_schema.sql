-- ============================================================================
-- MetaPulse Master Data Database Schema
-- 主数据库表结构定义
-- ============================================================================
--
-- 此数据库用于存储外部数据库的镜像数据，支持 CDC 实时同步
-- 与元数据库 (metapulse) 分离，职责清晰
--
-- 创建数据库（如未创建）:
-- CREATE DATABASE IF NOT EXISTS master_data DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
-- ============================================================================

USE master_data;

-- ============================================================================
-- 1. 数据连接配置表 (data_connection)
-- ============================================================================
-- 存储外部数据库的连接配置信息
-- 与前端 IngestionSource 通过 ingestion_source_urn 关联

CREATE TABLE IF NOT EXISTS data_connection (
    -- 主键
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- 关联字段（与元数据库 IngestionSource 关联）
    ingestion_source_urn    VARCHAR(500) NOT NULL COMMENT '关联的 IngestionSource URN，如 urn:li:ingestionSource:xxx',

    -- 连接标识
    connection_name         VARCHAR(255) NOT NULL COMMENT '连接名称，用户可读',
    connection_type         VARCHAR(50) NOT NULL COMMENT '连接类型: mysql, postgres, oracle, mongodb, sqlserver 等',

    -- 连接配置（敏感信息应加密存储）
    host                    VARCHAR(255) NOT NULL COMMENT '主机地址',
    port                    INT NOT NULL COMMENT '端口号',
    database_name           VARCHAR(255) NOT NULL COMMENT '数据库名',
    username                VARCHAR(255) NOT NULL COMMENT '用户名',
    password_encrypted      VARCHAR(1000) COMMENT '加密后的密码（使用 AES-256 加密）',

    -- SSL 配置
    use_ssl                 BOOLEAN DEFAULT FALSE COMMENT '是否使用 SSL',
    ssl_mode                VARCHAR(50) COMMENT 'SSL 模式: disable, require, verify-ca, verify-full',

    -- 连接池配置
    max_pool_size           INT DEFAULT 10 COMMENT '最大连接池大小',
    min_idle_connections    INT DEFAULT 2 COMMENT '最小空闲连接数',
    connection_timeout_ms   INT DEFAULT 30000 COMMENT '连接超时（毫秒）',

    -- 过滤配置（JSON 格式，存储 include/exclude 规则）
    table_filter_config     JSON COMMENT '表过滤配置，如 {"include": ["users", "orders"], "exclude": ["temp_*"]}',
    schema_filter_config    JSON COMMENT 'Schema 过滤配置（PostgreSQL/Oracle 等）',

    -- 状态
    status                  VARCHAR(50) DEFAULT 'ACTIVE' COMMENT '状态: ACTIVE, INACTIVE, ERROR, DELETED',
    last_test_at            TIMESTAMP NULL COMMENT '最后连接测试时间',
    last_test_result        VARCHAR(50) COMMENT '最后测试结果: SUCCESS, FAILED',
    last_test_message       TEXT COMMENT '最后测试消息（错误信息）',

    -- 审计字段
    created_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    created_by              VARCHAR(255) COMMENT '创建人',
    updated_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    updated_by              VARCHAR(255) COMMENT '更新人',

    -- 索引
    UNIQUE KEY uk_ingestion_source (ingestion_source_urn),
    INDEX idx_connection_type (connection_type),
    INDEX idx_status (status),
    INDEX idx_created_at (created_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='数据连接配置表 - 存储外部数据库连接信息';


-- ============================================================================
-- 2. 镜像表注册表 (mirror_table)
-- ============================================================================
-- 记录所有动态创建的镜像表元信息
-- 表命名规范: conn_{connection_id}_{database}_{table}

CREATE TABLE IF NOT EXISTS mirror_table (
    -- 主键
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- 关联字段
    connection_id           BIGINT NOT NULL COMMENT '关联的 data_connection.id',
    dataset_urn             VARCHAR(500) COMMENT '关联的元数据库 Dataset URN',

    -- 源表信息
    source_database         VARCHAR(255) NOT NULL COMMENT '源数据库名',
    source_schema           VARCHAR(255) COMMENT '源 Schema（PostgreSQL/Oracle）',
    source_table            VARCHAR(255) NOT NULL COMMENT '源表名',

    -- 镜像表信息
    mirror_table_name       VARCHAR(500) NOT NULL COMMENT '镜像表名，格式: conn_{id}_{db}_{table}',

    -- 表结构快照（JSON 格式）
    column_schema           JSON NOT NULL COMMENT '列定义 JSON，如 [{"name": "id", "type": "BIGINT", "nullable": false, "primaryKey": true}, ...]',
    primary_key_columns     JSON COMMENT '主键列名数组，如 ["id"] 或 ["tenant_id", "id"]',
    index_definitions       JSON COMMENT '索引定义（可选）',

    -- 同步状态
    sync_status             VARCHAR(50) DEFAULT 'PENDING' COMMENT '同步状态: PENDING, SYNCING, SYNCED, ERROR',
    last_full_sync_at       TIMESTAMP NULL COMMENT '最后全量同步时间',
    last_incremental_at     TIMESTAMP NULL COMMENT '最后增量同步时间',
    row_count               BIGINT DEFAULT 0 COMMENT '当前行数（估算）',

    -- 审计字段
    created_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',

    -- 约束和索引
    FOREIGN KEY (connection_id) REFERENCES data_connection(id) ON DELETE CASCADE,
    UNIQUE KEY uk_mirror_table (mirror_table_name),
    UNIQUE KEY uk_source_table (connection_id, source_database, source_schema, source_table),
    INDEX idx_dataset_urn (dataset_urn),
    INDEX idx_sync_status (sync_status),
    INDEX idx_connection_id (connection_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='镜像表注册表 - 记录动态创建的镜像表元信息';


-- ============================================================================
-- 3. CDC 状态表 (cdc_state)
-- ============================================================================
-- 跟踪 Debezium CDC 的同步位置，支持断点续传

CREATE TABLE IF NOT EXISTS cdc_state (
    -- 主键
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- 关联字段
    connection_id           BIGINT NOT NULL COMMENT '关联的 data_connection.id',

    -- CDC 引擎信息
    cdc_engine              VARCHAR(50) DEFAULT 'DEBEZIUM' COMMENT 'CDC 引擎: DEBEZIUM, MAXWELL, CANAL',
    connector_name          VARCHAR(255) COMMENT 'Debezium Connector 名称',

    -- Binlog 位置（MySQL）
    binlog_file             VARCHAR(255) COMMENT 'MySQL binlog 文件名，如 mysql-bin.000003',
    binlog_position         BIGINT COMMENT 'Binlog 位置',
    gtid_set                TEXT COMMENT 'MySQL GTID 集合（如启用）',

    -- WAL 位置（PostgreSQL）
    wal_lsn                 VARCHAR(100) COMMENT 'PostgreSQL WAL LSN',

    -- 通用 Offset（Debezium 格式，JSON）
    offset_data             JSON COMMENT 'Debezium offset 数据（完整 JSON）',

    -- 状态
    status                  VARCHAR(50) DEFAULT 'STOPPED' COMMENT '状态: RUNNING, STOPPED, ERROR, PAUSED',
    error_message           TEXT COMMENT '错误信息',

    -- 统计信息
    events_processed        BIGINT DEFAULT 0 COMMENT '已处理事件数',
    last_event_at           TIMESTAMP NULL COMMENT '最后事件时间',
    lag_ms                  BIGINT COMMENT '延迟毫秒数',

    -- 审计字段
    created_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',

    -- 约束和索引
    FOREIGN KEY (connection_id) REFERENCES data_connection(id) ON DELETE CASCADE,
    UNIQUE KEY uk_connection (connection_id),
    INDEX idx_status (status)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='CDC 状态表 - 跟踪 CDC 同步位置，支持断点续传';


-- ============================================================================
-- 4. 同步历史表 (sync_history)
-- ============================================================================
-- 记录每次同步操作的历史，用于审计和问题排查

CREATE TABLE IF NOT EXISTS sync_history (
    -- 主键
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- 关联字段
    connection_id           BIGINT NOT NULL COMMENT '关联的 data_connection.id',
    mirror_table_id         BIGINT COMMENT '关联的 mirror_table.id（如果是表级同步）',

    -- 同步信息
    sync_type               VARCHAR(50) NOT NULL COMMENT '同步类型: FULL_IMPORT, CDC_EVENT, SCHEMA_CHANGE',
    sync_mode               VARCHAR(50) COMMENT '同步模式: FULL（全量）, INCREMENTAL（增量）',

    -- 执行信息
    started_at              TIMESTAMP NOT NULL COMMENT '开始时间',
    completed_at            TIMESTAMP NULL COMMENT '完成时间',
    duration_ms             BIGINT COMMENT '耗时毫秒',
    status                  VARCHAR(50) NOT NULL COMMENT '状态: RUNNING, SUCCESS, FAILED, CANCELLED',

    -- 统计信息
    rows_inserted           BIGINT DEFAULT 0 COMMENT '插入行数',
    rows_updated            BIGINT DEFAULT 0 COMMENT '更新行数',
    rows_deleted            BIGINT DEFAULT 0 COMMENT '删除行数',
    tables_affected         INT DEFAULT 0 COMMENT '影响的表数量',

    -- CDC 事件详情（增量同步时）
    event_type              VARCHAR(50) COMMENT 'CDC 事件类型: INSERT, UPDATE, DELETE, DDL',
    event_data              JSON COMMENT '事件数据摘要（敏感数据脱敏）',

    -- Schema 变更详情（DDL 事件时）
    ddl_type                VARCHAR(50) COMMENT 'DDL 类型: CREATE_TABLE, ALTER_TABLE, DROP_TABLE, ADD_COLUMN 等',
    ddl_statement           TEXT COMMENT 'DDL 语句',
    schema_before           JSON COMMENT '变更前 Schema（ALTER 时）',
    schema_after            JSON COMMENT '变更后 Schema',

    -- 错误信息
    error_code              VARCHAR(50) COMMENT '错误代码',
    error_message           TEXT COMMENT '错误消息',
    error_stack_trace       TEXT COMMENT '错误堆栈（调试用）',

    -- 审计字段
    triggered_by            VARCHAR(255) COMMENT '触发者: SYSTEM, USER, CDC',
    created_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',

    -- 索引
    INDEX idx_connection_id (connection_id),
    INDEX idx_mirror_table_id (mirror_table_id),
    INDEX idx_sync_type (sync_type),
    INDEX idx_status (status),
    INDEX idx_started_at (started_at),
    INDEX idx_created_at (created_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='同步历史表 - 记录每次同步操作的详细信息';


-- ============================================================================
-- 5. 同步指标表 (sync_metrics)
-- ============================================================================
-- 存储同步性能指标，用于监控和优化

CREATE TABLE IF NOT EXISTS sync_metrics (
    -- 主键
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- 关联字段
    connection_id           BIGINT NOT NULL COMMENT '关联的 data_connection.id',

    -- 时间维度（按小时聚合）
    metric_hour             TIMESTAMP NOT NULL COMMENT '指标时间（小时精度）',

    -- CDC 指标
    events_received         BIGINT DEFAULT 0 COMMENT '接收事件数',
    events_processed        BIGINT DEFAULT 0 COMMENT '处理成功事件数',
    events_failed           BIGINT DEFAULT 0 COMMENT '处理失败事件数',

    -- 延迟指标
    avg_lag_ms              BIGINT COMMENT '平均延迟（毫秒）',
    max_lag_ms              BIGINT COMMENT '最大延迟（毫秒）',

    -- 吞吐量指标
    bytes_processed         BIGINT DEFAULT 0 COMMENT '处理字节数',
    rows_synced             BIGINT DEFAULT 0 COMMENT '同步行数',

    -- 审计字段
    created_at              TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',

    -- 约束和索引
    UNIQUE KEY uk_connection_hour (connection_id, metric_hour),
    INDEX idx_metric_hour (metric_hour)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='同步指标表 - 存储同步性能指标（按小时聚合）';


-- ============================================================================
-- 初始化：创建默认索引和视图
-- ============================================================================

-- 创建活跃连接视图
CREATE OR REPLACE VIEW v_active_connections AS
SELECT
    dc.id,
    dc.connection_name,
    dc.connection_type,
    dc.host,
    dc.port,
    dc.database_name,
    dc.status,
    cs.status AS cdc_status,
    cs.events_processed,
    cs.last_event_at,
    cs.lag_ms,
    COUNT(mt.id) AS table_count
FROM data_connection dc
LEFT JOIN cdc_state cs ON dc.id = cs.connection_id
LEFT JOIN mirror_table mt ON dc.id = mt.connection_id
WHERE dc.status = 'ACTIVE'
GROUP BY dc.id, dc.connection_name, dc.connection_type, dc.host, dc.port,
         dc.database_name, dc.status, cs.status, cs.events_processed,
         cs.last_event_at, cs.lag_ms;


-- 创建同步状态汇总视图
CREATE OR REPLACE VIEW v_sync_summary AS
SELECT
    dc.id AS connection_id,
    dc.connection_name,
    COUNT(DISTINCT mt.id) AS total_tables,
    SUM(CASE WHEN mt.sync_status = 'SYNCED' THEN 1 ELSE 0 END) AS synced_tables,
    SUM(CASE WHEN mt.sync_status = 'ERROR' THEN 1 ELSE 0 END) AS error_tables,
    MAX(mt.last_incremental_at) AS last_sync_at,
    SUM(mt.row_count) AS total_rows
FROM data_connection dc
LEFT JOIN mirror_table mt ON dc.id = mt.connection_id
WHERE dc.status = 'ACTIVE'
GROUP BY dc.id, dc.connection_name;


-- ============================================================================
-- 完成
-- ============================================================================
--
-- 动态镜像表命名规范:
--   conn_{connection_id}_{database}_{table}
--
-- 示例:
--   conn_1_sales_db_customers
--   conn_1_sales_db_orders
--   conn_2_hr_system_employees
--
-- 这些表由系统根据源表结构动态创建，不在此 Schema 中定义
-- ============================================================================

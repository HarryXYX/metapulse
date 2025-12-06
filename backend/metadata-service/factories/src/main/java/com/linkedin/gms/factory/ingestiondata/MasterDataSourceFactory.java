package com.linkedin.gms.factory.ingestiondata;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Master Data 数据源配置工厂
 *
 * <p>用于创建和配置 master_data 数据库连接，该数据库存储外部数据库的镜像数据。
 * 与元数据库 (metapulse) 分离，职责清晰：
 * - 元数据库：存储 Dataset 实体、Schema 信息
 * - 主数据库：存储外部表的实际数据副本
 */
@Slf4j
@Configuration
@ConditionalOnProperty(name = "masterData.datasource.url")
public class MasterDataSourceFactory {

  @Value("${masterData.datasource.url}")
  private String url;

  @Value("${masterData.datasource.username}")
  private String username;

  @Value("${masterData.datasource.password}")
  private String password;

  @Value("${masterData.datasource.driver-class-name:com.mysql.cj.jdbc.Driver}")
  private String driverClassName;

  @Value("${masterData.datasource.hikari.pool-name:MasterDataPool}")
  private String poolName;

  @Value("${masterData.datasource.hikari.maximum-pool-size:30}")
  private int maximumPoolSize;

  @Value("${masterData.datasource.hikari.minimum-idle:5}")
  private int minimumIdle;

  @Value("${masterData.datasource.hikari.connection-timeout:30000}")
  private long connectionTimeout;

  @Value("${masterData.datasource.hikari.idle-timeout:600000}")
  private long idleTimeout;

  @Value("${masterData.datasource.hikari.max-lifetime:1800000}")
  private long maxLifetime;

  /**
   * 创建 Master Data 数据源
   */
  @Bean(name = "masterDataSource")
  public DataSource masterDataSource() {
    log.info("Initializing Master Data DataSource: {}", url);

    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(url);
    config.setUsername(username);
    config.setPassword(password);
    config.setDriverClassName(driverClassName);
    config.setPoolName(poolName);
    config.setMaximumPoolSize(maximumPoolSize);
    config.setMinimumIdle(minimumIdle);
    config.setConnectionTimeout(connectionTimeout);
    config.setIdleTimeout(idleTimeout);
    config.setMaxLifetime(maxLifetime);

    // 额外配置
    config.addDataSourceProperty("cachePrepStmts", "true");
    config.addDataSourceProperty("prepStmtCacheSize", "250");
    config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
    config.addDataSourceProperty("useServerPrepStmts", "true");

    HikariDataSource dataSource = new HikariDataSource(config);
    log.info("Master Data DataSource initialized successfully. Pool: {}", poolName);

    return dataSource;
  }

  /**
   * 创建 Master Data JdbcTemplate
   */
  @Bean(name = "masterDataJdbcTemplate")
  public JdbcTemplate masterDataJdbcTemplate() {
    return new JdbcTemplate(masterDataSource());
  }
}

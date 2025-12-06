package com.datahub.auth.authentication.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 登录服务专用线程池配置
 *
 * <p>为登录操作提供独立的线程池，避免与 GraphQL 查询竞争 ForkJoinPool.commonPool() 的线程资源。
 *
 * <p>线程池配置说明：
 * - 核心线程数：2（保持最少2个线程处理登录请求）
 * - 最大线程数：10（最多10个并发登录）
 * - 队列容量：50（当所有线程忙碌时，最多排队50个请求）
 * - 拒绝策略：CallerRunsPolicy（队列满时，由调用线程执行，避免登录请求丢失）
 */
@Slf4j
@Configuration
public class LoginExecutorConfig {

  @Bean(name = "loginExecutor")
  public Executor loginExecutor() {
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

    // 核心线程数
    executor.setCorePoolSize(2);

    // 最大线程数
    executor.setMaxPoolSize(10);

    // 队列容量
    executor.setQueueCapacity(50);

    // 线程名称前缀（便于日志追踪）
    executor.setThreadNamePrefix("login-");

    // 拒绝策略：由调用线程执行，避免登录请求丢失
    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

    // 等待所有任务完成后关闭线程池
    executor.setWaitForTasksToCompleteOnShutdown(true);

    // 等待时间：30秒
    executor.setAwaitTerminationSeconds(30);

    // 初始化
    executor.initialize();

    log.info(
        "Login executor initialized with corePoolSize={}, maxPoolSize={}, queueCapacity={}",
        executor.getCorePoolSize(),
        executor.getMaxPoolSize(),
        executor.getQueueCapacity());

    return executor;
  }
}

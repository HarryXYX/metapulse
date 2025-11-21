@echo off
REM MetaPulse Backend 启动脚本（包含 Kafka Consumers）
REM 用法：start-with-consumers.bat

echo 正在启动 MetaPulse 后端服务（All-in-One 模式：Web + Kafka Consumers）...

REM 设置 JVM 参数
set JVM_OPTS=-Xmx2g -Xms512m

REM 设置 Spring 配置
set SPRING_OPTS=-Dspring.profiles.active=dev -Dauthentication.enabled=false

REM 关键配置：启用所有 Kafka Consumers
set CONSUMER_OPTS=-DMCE_CONSUMER_ENABLED=true -DMCP_CONSUMER_ENABLED=true -DMAE_CONSUMER_ENABLED=true -DPE_CONSUMER_ENABLED=true

REM 合并所有参数
set ALL_OPTS=%JVM_OPTS% %SPRING_OPTS% %CONSUMER_OPTS%

REM 启动应用
set WAR_FILE=metadata-service\war\build\libs\war.war

if not exist "%WAR_FILE%" (
    echo 错误：找不到 WAR 文件：%WAR_FILE%
    echo 请先运行 gradlew build 构建项目
    exit /b 1
)

echo 启动参数：%ALL_OPTS%
echo.
echo 正在启动服务...
echo 使用 Ctrl+C 停止服务
echo.

java %ALL_OPTS% -jar "%WAR_FILE%"

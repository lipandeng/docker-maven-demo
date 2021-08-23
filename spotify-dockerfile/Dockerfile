# 该镜像需要依赖的基础镜像
FROM lpicanco/java11-alpine
ARG JAR_FILE

# 将当前maven目录生成的文件复制到docker容器的/目录下
COPY target/${JAR_FILE} /app.jar
# 声明服务运行在8082端口
EXPOSE 8083
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/app.jar"]
# 指定维护者的名字
MAINTAINER climber
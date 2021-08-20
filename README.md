# docker-maven-demo

几种自动化构建Docker镜像Maven插件使用

目的:实现应用的自动打包、构建docker镜像、推送私有镜像仓库、运行/停止/销毁容器
- io.fabric8.docker-maven-plugin
- com.spotify.dockerfile-maven-plugin
- org.springframework.boot.spring-boot-maven-plugin [SpringBoot官方插件]  

## io.fabric8.docker-maven-plugin

使用方法：
1) 由于项目中用到mysql，所以在项目启动前先启动mysql容器，参考如下
   ~~~
   docker run --rm --name mysql -v mysql-data:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest
   ~~~
   然后将document/sql/quick_coating.sql导入
1) 项目打包，点击idea右侧的Lifecyle->package即可；如果pom.xml中有配置execution项则同时生产docker镜像
1) 生产镜像，点击Plugins->docker:build即可
1) 容器操作，点击Plugins->docker:start/stop/remove即可实现容器的启动/停止/销毁 
1) 访问应用：swagger url: http://127.0.0.1:8082/swagger-ui/index.html
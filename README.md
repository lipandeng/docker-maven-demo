# docker-maven-demo

几种自动化构建Docker镜像的Maven插件使用

目的:实现应用的自动打包、构建docker镜像、推送私有镜像仓库、运行/停止/销毁容器
- io.fabric8.docker-maven-plugin
- com.spotify.dockerfile-maven-plugin
- org.springframework.boot.spring-boot-maven-plugin [SpringBoot官方插件]  

详细使用请参考 [三种自动化构建Docker镜像的Maven插件使用](https://www.jianshu.com/p/6e5123f2e0b5)

## io.fabric8.docker-maven-plugin
子项目:fabric-docker

使用方法：
1) 由于项目中用到mysql，所以在项目启动前先启动mysql容器，参考如下
   ~~~
   docker run --rm --name mysql -v mysql-data:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest
   ~~~
   然后将document/sql/quick_coating.sql导入
1) 项目要用到私有镜像仓库，搭建可参考：https://www.jianshu.com/p/bbbf93b29b78    
1) 使用不同的Maven插件构建Docker镜像时方法不同，所以此项目直接使用Dockerfile来构建，也推荐大家这样使用   
1) 项目打包，点击idea右侧的Lifecyle->package即可；如果pom.xml中有配置execution项则同时生产docker镜像
1) 生产镜像，点击Plugins->docker:build即可
1) 容器操作，点击Plugins->docker:start/stop/remove即可实现容器的启动/停止/销毁 
1) 访问应用：swagger url: http://127.0.0.1:8082/swagger-ui/index.html

## com.spotify.dockerfile-maven-plugin
子项目:spotify-dockerfile

Spotify官方已经不再推荐使用 [docker-maven-plugin](https://github.com/spotify/docker-maven-plugin) ;推荐使用 [com.spotify.dockerfile-maven-plugin](https://github.com/spotify/dockerfile-maven)

使用方法：
1) 配置pom.xml  
   在pom.xml添加 com.spotify.dockerfile-maven-plugin 插件配置
   ~~~
   <properties>
       <docker.image.prefix>12.78.18.15:5000</docker.image.prefix>
   </properties>
   <build>
       <plugins>
           <plugin>
                <groupId>com.spotify</groupId>
                <artifactId>dockerfile-maven-plugin</artifactId>
                <version>1.4.13</version>
                <executions>
                    <!--运行mvn package时，会自动执行build目标，构建Docker镜像;
                    运行mvn deploy命令时，会自动执行push目标，将Docker镜像push到Docker仓库-->
                    <execution>
                        <id>default</id>
                        <goals>
                            <goal>build</goal>
                            <goal>push</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <repository>${docker.image.prefix}/spotify-dockerfile</repository>
                    <tag>${project.version}</tag>
                    <!--在settings.xml中配置server-->
                    <useMavenSettingsForAuth>true</useMavenSettingsForAuth>
                    <!--可以指定一个或多个变量，传递给Dockerfile，在Dockerfile中通过ARG指令进行引用-->
                    <buildArgs>
                        <JAR_FILE>${project.build.finalName}.jar</JAR_FILE>
                    </buildArgs>
                </configuration>
            </plugin>
       </plugins>
   </build>
   ~~~
2) 编写Dockerfile
   这里说明下插件特有的新功能，可使用pom.xml中指定的变量
   ~~~
   # 此处的JAR_FILE正式pom.xml中指定的buildArgs->JAR_FILE
   ARG JAR_FILE
   COPY target/${JAR_FILE} /app.jar
   ~~~
3) 构建docker images

   使用该插件构建Docker镜像，需要有一个安装好的Docker运行环境，且需要在运行该插件的机器上定义DOCKER_HOST环境变量，配置访问Docker的URL
   linux 下配置
   ~~~
   export DOCKER_HOST=tcp://localhost:2375
   ~~~
   window下配置环境变量,自行配置即可
   接下来，就可以运行maven命令来构建Docker镜像了,使用idea右侧工具栏响应的命令双击即可
   ~~~
   mvn package 或者 mvn dockerfile:build
   ~~~
4) 推送到私有镜像仓库
   
   作者使用的非docker hub，而是自己搭建的，且需要用户验证，pom.xml配置如下
   ~~~
   <useMavenSettingsForAuth>true</useMavenSettingsForAuth>
   ~~~
   同时在maven的settings.xml中的servers下增加一个server配置：
   ~~~
    <servers>
         <server>
            <id>12.78.182.15:5000</id>
            <username>lipandeng</username>
            <password>1@loPoa56</password>
          </server>
    </servers>
   ~~~
   注意server.id即是上边配置的docker.image.prefix
   push 镜像
   ~~~
   mvn dockerfile:push
   ~~~
   查看镜像裤即可验证上传是否成功
   
   
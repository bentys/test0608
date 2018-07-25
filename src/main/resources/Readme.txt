多环境化配置
在真实的应用中，常常会有多个环境（如：开发，测试，生产等），不同的环境数据库连接都不一样，这个时候就需要用到spring.profile.active的强大功能了，它的格式为application-{profile}.properties，这里的application为前缀不能改，{profile}是我们自己定义的。

创建application-dev.properties、application-test.properties、application-prod.properties，内容分别如下

application-dev.properties

server.servlet.context-path=/dev
1
application-test.properties

server.servlet.context-path=/test
1
application-prod.properties

server.servlet.context-path=/prod
1
在application.properties配置文件中写入spring.profiles.active=dev，这个时候我们在次访问http://localhost:8080/properties/1就没用处了，因为我们设置了它的context-path=/dev，所以新的路径就是http://localhost:8080/dev/properties/1，由此可以看出来我们激活不同的配置读取的属性值是不一样的
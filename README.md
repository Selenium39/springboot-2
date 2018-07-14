# springboot-2
利用springboot-jpa创建restful风格的crud

总结:
1.进行了多环境的配置(通过端口号区别不同的环境)
2.使用了spring=jpa创建restful风格的crud

1.数据库报错:```java.sql.SQLException: Access denied for user ''@'localhost' (using password: YES)```
答:我以为是数据库密码错了,反复对了几遍密码都是对的，原来是我原先使用的name: root,应该是username: root


基于imooc视频:https://www.imooc.com/learn/767

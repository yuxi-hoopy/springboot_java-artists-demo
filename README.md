## 2024.10.7
闲着无聊写的画家系统（后端初步
#### Done list：
- [x] 初步了解 Java 语言和 spring boot
- [x] 新建一个 spring boot 项目并导入到 intellij idea 
- [x] 如何实现一个 controller, 
- [x] 什么是 RESTful api 规范 
- [x] 创建数据库表（MYSQL）
- [x] 利用 spring data jpa 实现对数据库的操作 
- [x] 在 controller 中实现增删改查 API 
- [x] 测试改进和完善（网页&&Postman）
- [x] 项目构建打包
#### 项目结构
```
xiao
├─ .gitignore
├─ .mvn
│  └─ wrapper
│     └─ maven-wrapper.properties
├─ mvnw
├─ mvnw.cmd
├─ pom.xml
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ yuxi
   │  │        └─ xiao
   │  │           ├─ control
   │  │           │  └─ PainterController.java
   │  │           ├─ converter
   │  │           │  └─ PainterConverter.java
   │  │           ├─ dao
   │  │           │  ├─ Painter.java
   │  │           │  └─ PainterRepo.java
   │  │           ├─ dto
   │  │           │  └─ PainterDto.java
   │  │           ├─ Response.java
   │  │           ├─ service
   │  │           │  ├─ PainterService.java
   │  │           │  └─ PainterServiceImpl.java
   │  │           ├─ testContr.java
   │  │           └─ XiaoApplication.java
   │  └─ resources
   │     ├─ application.properties
   │     ├─ static
   │     └─ templates
   │        └─ error.html
   └─ test
      └─ java
         └─ com
            └─ yuxi
               └─ xiao
                  └─ XiaoApplicationTests.java

```


**实现顺序：**
`数据库 -> data access -> service -> API（GET POST PUT DELETE）-> 客户端 or 浏览器`

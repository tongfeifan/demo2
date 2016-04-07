# demo2

## TODO

- 注册流程已经走通，没有做校验，没有做异常处理，没有单元测试，明天补上。
- 还有build.gradle依旧没有弄。

## 使用方法
1. 初始化数据库。
2. 运行程序。
3. 注册时因为没有无法真的调用短信网关，所以将验证码输出在console上模拟调用短信网关。
4. 理解以上逻辑后开始就可以正常使用。

## 总结
- bean自动装配，不再使用xml
- mybatis将sql语句写在了xml文件中。
- 花了太多时间在前端上摸索，实在不太熟悉。

## 初始化数据库

```SQL
Create TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `phoneNumber` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

Insert INTO `user` VALUES ('1', 'admin', 'admin', '12345678901');
```

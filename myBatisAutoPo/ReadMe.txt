1、此项目用来连接MySQL数据库 自动生成mapper 文件 和mapper接口
2、需要你配置的地方。generatorConfig.xml
	加装连接数据库的jar包  <classPathEntry location=""> 
	连接数据库的 地址 数据库  用户名 密码
	生成po类的包
	生成mapper文件和mapper接口的包
3、配置需要生成po、mapper的数据表。

4、运行util包下的	CreatePoMapper.java 即可生成po 和mapper接口 以及mapper文件


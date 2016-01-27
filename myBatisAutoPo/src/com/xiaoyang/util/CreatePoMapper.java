package com.xiaoyang.util;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class CreatePoMapper {

	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		System.out.println("开始准备");
		List<String> warnings = new ArrayList<String>();
 	   boolean overwrite = true;
 	   File configFile = new File("generatorConfig.xml");
 	   ConfigurationParser cp = new ConfigurationParser(warnings);
 	   Configuration config = cp.parseConfiguration(configFile);
 	   System.out.println("获取到generatorConfig.xml配置文件");
 	   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
 	   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
 	   myBatisGenerator.generate(null);
 	   System.out.println("生成完成");
	}

}

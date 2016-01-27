/*package com.xiaoyang.mapper;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {
	private ClassPathXmlApplicationContext applicationContext;
	private ItemsMapper itemsMapper;
	

	@Test
	public void testSelectByPrimaryKey() {
		
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/springmvc.xml");
		System.out.println("=====");
		itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
		System.out.println("-----");
		itemsMapper.selectByPrimaryKey(1);
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
*/
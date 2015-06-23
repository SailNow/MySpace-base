package org.lg.MySpace.jdbc;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/spring/applicationContext.xml","classpath*:META-INF/spring/spring-jdbc.xml"})
public class BaseDaoTest extends TestCase {
	@Autowired
	private BaseDao baseDao;
	
	@Test
	public void testSaveUser(){
		baseDao.saveUser();
	}
	
	@Test
	public void testSelectUser(){
		baseDao.selectUser();
	}
}

package com.imooc.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional(transactionManager = "transactionManager")
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public abstract class TestBase {
//public abstract class TestBase extends AbstractTransactionalJUnit4SpringContextTests {

}

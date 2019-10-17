package com.leopro.springboot;
import com.leopro.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * SpringBoot单元测试
 * */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    private Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    @Resource
    private Person person;

    @Test
    public void contextLoads() {
        logger.info("输出内容： "+person);
    }

}


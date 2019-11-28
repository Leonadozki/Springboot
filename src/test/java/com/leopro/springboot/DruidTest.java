package com.leopro.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidTest {

    @Resource
    DataSource dataSource;

    Logger logger = LoggerFactory.getLogger(DruidTest.class);

    /**
     *  测试druid数据源
     */
    @Test
    public void testDataSource() throws SQLException {
        logger.info(String.valueOf(dataSource.getClass()));
        Connection connection = dataSource.getConnection();
        logger.info(String.valueOf(connection));
        connection.close();
    }
}

package com.ark.blog;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApiserverApplicationTests {


    private static Logger logger = LoggerFactory.getLogger(BlogApiserverApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("test");
    }

}

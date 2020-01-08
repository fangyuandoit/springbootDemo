package com.fy.springboot_groovy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootGroovyApplicationTests {

    @Test
    public    void contextLoads() {

        System.out.println("test-------------------- 执行上下文");
        Assert.assertEquals(1,1);
    }

}

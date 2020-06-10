package groovyTest

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/8 16:35
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class T1 {

    @Test
    void contextLoads() {

        System.out.println("groovy-------------------- 执行上下文 groovy");
        Assert.assertEquals(1,1);
    }

}

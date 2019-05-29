package cays.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName DemoBeanIntegrationTests
 * @Description TODO
 * 1. SpringJUnit4ClassRunner在JUmt环境下提供SpnngTestContextFramework的功能。
 * 2. @ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载
 * 配置类。
 * 3. @ActiveProfiles用来声明活动的profileo
 * 4. 可使用普通的@Autowlred注入Beano
 * 5. 测试代码，通过JUnit的Assen来校验结果是否和预期一致。
 * @Author Cays
 * @Date 2019/5/29 20:14
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;
    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}

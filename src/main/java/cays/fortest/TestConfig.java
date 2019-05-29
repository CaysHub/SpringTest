package cays.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName TestConfig
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/29 20:11
 * @Version 1.0
 **/
@Configuration
public class TestConfig {
    @Bean
    @Profile("div")
    public TestBean devTestBean(){
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}

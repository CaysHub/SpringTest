package cays.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName PrePostConfig
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 20:34
 * @Version 1.0
 **/
@Configuration
@ComponentScan("cays.prepost")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JRS250WayService jrs250WayService(){
        return new JRS250WayService();
    }
}

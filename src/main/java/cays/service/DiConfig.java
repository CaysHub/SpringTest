package cays.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName DiConfig
 * @Description TODO
 * 1. @Configurauon声明当前类是一个配置类，在后面1.3．2节的Java配置中有更详细的
 * 说明；
 * 2. 使用@ComponentScan，自动扫描包名下所有使用@Service、@ComponentScan、@Repository
 * 和@Controller的类，并注册为Beano
 * @Author Cays
 * @Date 2019/5/27 15:08
 * @Version 1.0
 **/
@Configuration
@ComponentScan("cays.service")
public class DiConfig {
}

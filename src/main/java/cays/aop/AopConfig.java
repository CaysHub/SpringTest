package cays.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName AopConfig
 * @Description TODO
 *
 * @Author Cays
 * @Date 2019/5/27 16:42
 * @Version 1.0
 **/
@Configuration
@ComponentScan("cays.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

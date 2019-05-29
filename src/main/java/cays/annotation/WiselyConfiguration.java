package cays.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @ClassName WiselyConfiguration
 * @Description TODO
 * (1) 组合@Configuration元注解o
 * (2) 组合@ComponentScan元注解。
 * (3) 覆盖value参数
 * @Author Cays
 * @Date 2019/5/29 15:17
 * @Version 1.0
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration//1
@ComponentScan//2
public @interface WiselyConfiguration {
    String[] value() default {};
}

package cays.aop;

import java.lang.annotation.*;

/**
 * 这里讲下注解，注解本身是没有功能的，就和xml一样。注解和xml都是一种元数据，
 * 元数据即解释数据的数据，这就是所谓配置0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}

package cays.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * Java配置是Spnng4x推荐的配置方式，可以完全替代xml配置：Java配置也是SpringBoot
 * 推荐的配置方式。
 * @Author Cays
 * @Date 2019/5/27 15:11
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("World"));
        context.close();
    }
}

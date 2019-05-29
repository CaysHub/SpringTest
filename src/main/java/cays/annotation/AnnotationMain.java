package cays.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AnnotationMain
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/29 15:22
 * @Version 1.0
 **/
public class AnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}

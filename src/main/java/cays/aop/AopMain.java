package cays.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AopMain
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 16:44
 * @Version 1.0
 **/
public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}

package cays.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ElMain
 * @Description TODO
 * Spring EL支持
 * @Author Cays
 * @Date 2019/5/27 19:36
 * @Version 1.0
 **/
public class ElMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}

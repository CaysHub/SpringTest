package cays.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName PrePostMain
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 20:36
 * @Version 1.0
 **/
public class PrePostMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JRS250WayService jrs250WayService = context.getBean(JRS250WayService.class);
        context.close();
    }
}

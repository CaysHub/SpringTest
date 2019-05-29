package cays.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AwareMain
 * @Description TODO
 * Aware 事务支持
 * @Author Cays
 * @Date 2019/5/27 21:43
 * @Version 1.0
 **/
public class AwareMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}

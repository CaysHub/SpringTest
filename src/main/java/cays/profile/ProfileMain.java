package cays.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ProfileMain
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:07
 * @Version 1.0
 **/
public class ProfileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}

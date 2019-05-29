package cays.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ScopeMain
 * @Description TODO
 * Scope描述的是Spring容器如何新建Bean的实例的。Spring的Scope有以下几种，通过
 * @Scope注解来实现。
 * （1）Singleton:一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容
 * 器共享一个实例。
 * （2）Prototype：每次调用新建一个Bean的实例。
 * （3）Request:web项目中，给每一个httprequest新建一个Bean实例。
 * （4）Session：web项目中，给每一个httpsession新建一个Bean实例。
 * 巧)GlobalSession;这个只在portal应用中有用，给每一个globalhttpsession新建一个Bean
 * 实例。
 * 另外，在SpringBatch中还有一个Scope是使用@StepScope'我们将在批处理一节介绍这
 * 个Scopeo
 * @Author Cays
 * @Date 2019/5/27 19:14
 * @Version 1.0
 **/
public class ScopeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1和s2是否相等：" + s1.equals(s2));
        System.out.println("p1与p2是否相等：" + p1.equals(p2));
        context.close();
    }
}

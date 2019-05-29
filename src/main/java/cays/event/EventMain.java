package cays.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName EventMain
 * @Description TODO
 * Spring Event事件监听支持
 * @Author Cays
 * @Date 2019/5/27 21:28
 * @Version 1.0
 **/
public class EventMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publisher("hello application event");
        context.close();
    }
}

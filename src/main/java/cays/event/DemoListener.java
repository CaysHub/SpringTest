package cays.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoListener
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:21
 * @Version 1.0
 **/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("Bean-DemoListener receive bean-demoPublisher message " + msg);
    }
}

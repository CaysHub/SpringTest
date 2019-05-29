package cays.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoPublisher
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:25
 * @Version 1.0
 **/
@Component
public class DemoPublisher {
    //1. 注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publisher(String msg){
        //2. publishEvent()发布事件
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}

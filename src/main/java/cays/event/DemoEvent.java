package cays.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName DemoEvent
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:19
 * @Version 1.0
 **/
public class DemoEvent extends ApplicationEvent {
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public DemoEvent(Object source) {
        super(source);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

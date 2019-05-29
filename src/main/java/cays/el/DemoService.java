package cays.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 19:23
 * @Version 1.0
 **/
@Service
public class DemoService {
    @Value("Libai")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}

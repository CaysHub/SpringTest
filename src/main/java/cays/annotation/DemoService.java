package cays.annotation;

import org.springframework.stereotype.Service;

/**
 * @ClassName DemoService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/29 15:21
 * @Version 1.0
 **/
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}

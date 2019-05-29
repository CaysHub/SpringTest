package cays.aop;

import org.springframework.stereotype.Service;

/**
 * @ClassName DemoAnnotationService
 * @Description TODO
 * 1. 编写使用注解的被拦截类
 * @Author Cays
 * @Date 2019/5/27 16:20
 * @Version 1.0
 **/
@Service
public class DemoAnnotationService {
    @Action(name = "aad")
    public void add(){

    }
}

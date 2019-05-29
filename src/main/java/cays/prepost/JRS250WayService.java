package cays.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName JSR250WayService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 20:32
 * @Version 1.0
 **/
public class JRS250WayService {
    @PostConstruct  //构造函数执行完之后执行
    public void init(){
        System.out.println("jrs250-init-method");
    }

    public JRS250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy    //在Bean销毁前执行
    public void destroy(){
        System.out.println("jrs250-destroy-method");
    }
}

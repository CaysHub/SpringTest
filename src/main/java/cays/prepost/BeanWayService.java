package cays.prepost;

/**
 * @ClassName BeanWayService
 * @Description TODO
 * Bean的初始化和销毁
 * @Author Cays
 * @Date 2019/5/27 20:29
 * @Version 1.0
 **/
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}

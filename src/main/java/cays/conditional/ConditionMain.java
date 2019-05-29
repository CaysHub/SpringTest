package cays.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ConditionMain
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/29 15:03
 * @Version 1.0
 **/
public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+
                "系统下的列表命令为："+listService.showListCmd());
    }
}

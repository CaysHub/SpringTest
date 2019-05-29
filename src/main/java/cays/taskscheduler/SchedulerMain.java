package cays.taskscheduler;

import cays.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SchedulerMain
 * @Description TODO
 *
 * @Author Cays
 * @Date 2019/5/29 14:33
 * @Version 1.0
 **/
public class SchedulerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}

package cays.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ExecutorMain
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:59
 * @Version 1.0
 **/
public class ExecutorMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i=0; i < 10; i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}

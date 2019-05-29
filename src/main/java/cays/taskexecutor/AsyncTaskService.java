package cays.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName AsyncTaskService
 * @Description TODO
 * @Author Cays
 * @Date 2019/5/27 21:56
 * @Version 1.0
 **/
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务:" + i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:" + (i+1));
    }
}

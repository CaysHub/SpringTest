package cays.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName ScheduledTaskService
 * @Description TODO
 * （1）通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行。
 * （2）使用cron属性可按照指定时间执行，本例指的是每天Il点28分执行；cron是UNIX
 * 和类UNIX(Linux)系统下的定时任务。
 * @Author Cays
 * @Date 2019/5/29 14:28
 * @Version 1.0
 **/
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒一次：" + dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+dateFormat.format(new Date())+" 执行");
    }
}

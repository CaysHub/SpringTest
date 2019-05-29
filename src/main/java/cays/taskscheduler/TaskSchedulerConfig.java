package cays.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName TaskSchedulerConfig
 * @Description TODO
 * @EnableScheduling 开启对计划任务的支持
 * @Author Cays
 * @Date 2019/5/29 14:33
 * @Version 1.0
 **/
@Configuration
@ComponentScan("cays.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}

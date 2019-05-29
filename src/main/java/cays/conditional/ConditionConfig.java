package cays.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ConditionConfig
 * @Description TODO
 * (1) 通过@Conditional注解，符合Windows条件则实例化windowsListServiceo
 * (2) 通过@Conditional注解，符合Linux条件则实例化linuxListServiceo
 * @Author Cays
 * @Date 2019/5/29 14:56
 * @Version 1.0
 **/
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}

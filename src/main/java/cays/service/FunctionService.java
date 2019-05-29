package cays.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName FunctionService
 * @Description TODO
 * ．使用@Service注解声明当前FunctionServtce类是Spnng管理的一个Beano其中，使
 * 用@Comonent、@Service、@Repository和@Controller是等效的，可根据需要选用。
 * @Author Cays
 * @Date 2019/5/27 15:00
 * @Version 1.0
 **/
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}

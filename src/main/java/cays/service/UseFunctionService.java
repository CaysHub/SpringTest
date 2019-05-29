package cays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UseFunctionService
 * @Description TODO
 * 1. 使用@Service注解声明当前UseFunctionService类是Spnng管理的一个Beano
 * 2. 使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中，让UseFunctionService
 * 具备FunctionService的功能，此处使用JSR-330的@lnject注解或者」SR．250的@Resource注解是等效的。
 * @Author Cays
 * @Date 2019/5/27 15:04
 * @Version 1.0
 **/
@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}

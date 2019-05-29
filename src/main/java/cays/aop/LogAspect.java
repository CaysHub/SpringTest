package cays.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ClassName LogAspect
 * @Description TODO
 * 3. 编写切面
 * 1. 通过@Aspect注解声明一个切面。
 * 2. 通过.Com/onent让此切面成为Spring容器管理的Beano
 * 3. 通过@Poin℃ut注解声明切点。
 * 4. 通过@After注解声明一个建言，并使用@PointCut定义的切点
 * 5. 通过反射可获得注解上的属性，然后做日志记录相关的操作，下面的相同。
 * 6. 通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数。
 * @Author Cays
 * @Date 2019/5/27 16:29
 * @Version 1.0
 **/
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(cays.aop.Action)")
    public void annotationPointCut(){

    }
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }
    @Before("execution(* cays.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}

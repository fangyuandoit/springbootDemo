package com.fy.springboot_aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Date: 2019/11/13 09:59
 * @Description:
 */
@Aspect
@Component
public class MyLogAnnoInterpreter {

    private Logger logger = LoggerFactory.getLogger(MyLogAnnoInterpreter.class);

    /**
     * 添加业务逻辑方法切入点 定义在controller包里的以add为前缀的方法的执行
     */
    @Pointcut("@annotation(com.fy.springboot_aop.config.MyLogAnno)")
    public void controllerlog()
    {
    }

    @After("controllerlog()")
    public void doAfter(JoinPoint joinpoint) {
        System.out.println("方法执行后---");
        ServletRequestAttributes sra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=sra.getRequest();
        logger.info("url:"+request.getRequestURI());
        logger.info("ip:"+request.getRemoteHost());
        logger.info("method:"+request.getMethod());
        logger.info("class_method:"+joinpoint.getSignature().getDeclaringTypeName()+"."+joinpoint.getSignature().getName());
        logger.info("args:"+joinpoint.getArgs());
    }


    @Pointcut("execution(* com.fy.springboot_aop.controller..*.*(..))")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getSignature().getDeclaringTypeName();
        try {
            long startTimeMillis = System.currentTimeMillis();
            //调用 proceed() 方法才会真正的执行实际被代理的方法
            Object result = joinPoint.proceed();
            long execTimeMillis = System.currentTimeMillis() - startTimeMillis;
            logger.info("Method Name : [" +className +"."+ methodName + "] ---> AOP method exec time millis : " + execTimeMillis);
//            logger.info("Method Name : [" + methodName + "] ---> AOP around end , and result is : " + result.toString());
            return result;
        } catch (Throwable te) {
            logger.error(te.getMessage(),te);
            throw new RuntimeException(te.getMessage());
        }
    }

}






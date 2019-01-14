package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author zhangge
 * @date 2019/1/14 - 17:29
 */
// 切面类
@Aspect
public class LogAspects {

    // 抽取公工的切入点表达式
    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+",除法运行...参数列表是:{"+ Arrays.toString(args)+"}");
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+",除法结束");
    }

    // JoinPoint一定出现在参数表的第一位
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName()+",除法正常返回...运行结果是:{"+result+"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(JoinPoint joinPoint,Exception exception){
        System.out.println(joinPoint.getSignature().getName()+"除法异常...异常信息:{"+exception.getMessage()+"}");
    }
}

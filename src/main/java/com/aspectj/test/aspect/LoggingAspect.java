package com.aspectj.test.aspect;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class LoggingAspect {


	@Pointcut("execution(* org.apache.log4j.Category.*(..))")
    // @Pointcut("execution(org.apache.log4j.Logger.*(..))")
    public void logEventCall() {
        System.out.println("Log Event Call");
    }

    @Around("logEventCall()")
    public void logAround(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("Method" +jointPoint.getSignature().getName());
        System.out.println("Before Pointcut ");
        jointPoint.proceed();
        System.out.println("After Pointcut");

    }


  /*  @Pointcut("execution(* org.apache.commons.logging.Log.info(..)) && target(org.apache.commons.logging.Log)")
    private void commonsLogInfoPointcut() {
    }

    @Pointcut("execution(* org.apache.log4j.Logger.info(..))")
    private void log4jInfoPointcut() {
    }

    @AfterReturning(pointcut = "commonsLogInfoPointcut() || log4jInfoPointcut()")
    public void logInfoWorkflow(JoinPoint joinPoint) {
        //do some extra stuff...
        return;
    }

*/
/*    @Around("within(org.apache.log4j..*Logger)")
	//@Around("execution(* org.apache.log4j.Logger..*(..))")
    //@Around("execution (* com.aspectj.test.customer.bo.CustomerBo.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("Method" +jointPoint.getSignature().getName());
        System.out.println("Before Pointcut ");
        jointPoint.proceed();
        System.out.println("After Pointcut");

    }
*/
}
package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	public LogAspect() {
		System.out.println("LogAspect()");
	}
	//Before Advice
	@Before(value="execution(* aop.OrderService.*(..))")
	public void beforeAdviceMethod(JoinPoint jp) {
		System.out.print("Before Advice--->"+jp.getSignature());
	}
	@After(value="execution(* aop.OrderService.placeOrder(..))")
	public void afterAdviceMethod(JoinPoint jp) {
		System.out.print("After Advice--->"+jp.getSignature());
	}

}

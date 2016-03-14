package aspectExample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Security {

	private Authenticator aut = new Authenticator();
	
	@Before("execution(* reserve*(..))")
	public void safeAccess(JoinPoint joinPoint) {
    System.out.println("Checking safe access");
    User user = (User) joinPoint.getArgs()[0];
    aut.authenticate(user);
	}
	
	@AfterReturning("execution(* aspectExample..*reserve*(..))")
  public void logAfterReserve(JoinPoint joinPoint) {
    System.out.println("Completed: " + joinPoint);
  }
}


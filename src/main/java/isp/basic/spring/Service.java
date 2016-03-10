package isp.basic.spring;

import org.springframework.stereotype.Component;

@Component
public class Service implements InterfaceA, InterfaceB {
  
  public void methodA1() {
    System.out.println("Method A1");
  }

  public void methodA2() {
    System.out.println("Method A2");
  }

  public void methodB1() {
    System.out.println("Method B1");
  }
  
  public void methodB2() {
    System.out.println("Method B2");
  }
  
}

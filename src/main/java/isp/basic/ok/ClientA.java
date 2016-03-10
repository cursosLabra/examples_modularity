package isp.basic.ok;

public class ClientA {
  
  public static void main(String ...args) {
    InterfaceA service = new Service();
    
    service.methodA1();
    service.methodA2();
    
  }

}

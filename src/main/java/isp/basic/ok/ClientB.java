package isp.basic.ok;

public class ClientB {
  
  public static void main(String ...args) {
    InterfaceB service = new Service();
    
    service.methodB1();
    service.methodB2();
    
  }

}

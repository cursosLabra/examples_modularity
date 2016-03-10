package isp.basic.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientASpring implements CommandLineRunner {
  
  @Autowired
  private final Service service;
  
  ClientASpring(Service service) {
    this.service = service;
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Starting...");
    SpringApplication app = new SpringApplication(ClientASpring.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }
  
  @Override
  public void run(String... args) {
    System.out.println("Running with Spring...");
    service.methodA1();
    service.methodA2();
  }


}

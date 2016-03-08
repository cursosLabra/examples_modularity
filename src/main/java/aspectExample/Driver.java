package aspectExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import aspectExample.service.HelloWorldService;

@SpringBootApplication
public class Driver implements CommandLineRunner {
  
  @Autowired
  private Plane plane;
  
  public static void main(String... args) throws Exception {
    SpringApplication app = new SpringApplication(Driver.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }
  
  @Override
  public void run(String... args) {
		User pepe = new User("Pepe");
		plane.reserveSeat(pepe, 23, 34);
		plane.reserveSeat(pepe, 1, 2);
		plane.reserveRow(pepe, 12);
	}
	
	

}

package aspectExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main implements CommandLineRunner {
  
  @Autowired
  private Plane plane;
  
  @Override
  public void run(String... args) {
		User pepe = new User("Pepe");
    User luis = new User("Luis");
		this.plane.reserveSeat(pepe, 1, 1);
		this.plane.reserveRow(luis, 0);
		System.out.println("Plane: " + this.plane);
	}
	
  public static void main(String[] args) throws Exception {
    SpringApplication app = new SpringApplication(Main.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }

}

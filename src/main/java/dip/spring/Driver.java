package dip.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Driver implements CommandLineRunner {
  
  @Autowired 
  private Game game;
  
  public static void main(String[] args) throws Exception {
    SpringApplication app = new SpringApplication(Driver.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }
  
  @Override
  public void run(String... args) {
    game.play();
  }
}

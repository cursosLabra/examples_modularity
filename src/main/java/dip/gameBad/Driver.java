package dip.gameBad;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Driver {
  public static void main(String[] args) throws Exception {
    System.out.println("Adventure...");
    Player juan = new Player("Juan");
    juan.play();
    
  }
}

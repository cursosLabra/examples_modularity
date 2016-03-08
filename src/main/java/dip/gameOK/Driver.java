package dip.gameOK;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Driver {
  public static void main(String[] args) throws Exception {
    System.out.println("Adventure...");
    KillDragon game1 = new KillDragon();
    Player juan = new Player("Juan",game1);
    juan.play();
    
    Maze game2 = new Maze();
    Player pepe = new Player("Pepe",game2);
    pepe.play();

  }
}

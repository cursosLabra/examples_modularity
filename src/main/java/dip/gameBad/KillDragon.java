package dip.gameBad;

import org.springframework.stereotype.Component;

@Component
public class KillDragon implements Game {
  public void startGame() {
    System.out.println("Start killing dragons...");
  }
  public void endGame() {
    System.out.println("End killing dragons...");
  }

}

package dip.gameOK;

import org.springframework.stereotype.Component;

@Component
public class Maze implements Game {
  public void startGame() {
    System.out.println("Start maze...");
  }
  public void endGame() {
    System.out.println("End maze...");
  }

}

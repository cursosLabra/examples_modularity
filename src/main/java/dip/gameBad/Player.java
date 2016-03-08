package dip.gameBad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Player {

  String name;
  KillDragon game;

  Player(String name) {
    this.name = name;
    game = new KillDragon();
  }
  
  void play() {
    game.startGame();
    System.out.println("Player " + name + " is having fun");
    game.endGame();
  }
}

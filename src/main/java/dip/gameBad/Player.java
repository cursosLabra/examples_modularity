package dip.gameBad;

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

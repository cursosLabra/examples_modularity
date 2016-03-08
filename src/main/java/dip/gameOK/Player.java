package dip.gameOK;

public class Player {

  String name;
  Game game;

  Player(String name, Game game) {
    this.name = name;
    this.game = game;
  }
  
  void play() {
    game.startGame();
    System.out.println("Player " + name + " is having fun");
    game.endGame();
  }
}

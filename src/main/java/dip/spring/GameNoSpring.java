package dip.spring;

import java.util.List;

public class GameNoSpring {

  private Repository db ;

  GameNoSpring(Repository db) {
    this.db = db;
  }
  
  void play() {
    db.startConnection();
    List<User> users = db.findAll();
    System.out.println("List of users: " + users);
  }
}

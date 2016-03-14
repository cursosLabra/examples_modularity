package dip.spring;

import java.util.List;

public class GameBad {

  private MySQLDB db ;

  GameBad() {
    db = new MySQLDB();
  }
  
  void play() {
    db.startConnection();
    List<User> users = db.findAll();
    System.out.println("List of users: " + users);
  }
}

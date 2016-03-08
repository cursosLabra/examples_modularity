package dip.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Game {

  private final Repository db;

  @Autowired
  Game(Repository db) {
    this.db = db;
  }
  
  void play() {
    db.startConnection();
    List<User> users = db.findAll();
    System.out.println("List of users: " + users);
  }
}

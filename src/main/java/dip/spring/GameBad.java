package dip.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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

package dip.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MySQLDB implements Repository {
  
  public MySQLDB() {}
  
  public void startConnection() {
    System.out.println("Starting connection...");
  }
  
  public List<User> findAll() {
    List<User> users = new ArrayList<User>();
    users.add(new User("Pepe"));
    users.add(new User("Luis"));
    return users;
  }
}

package dip.spring;

public class User {

  public final String name;
  
  User(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "User[" + name + "]";
  }
}

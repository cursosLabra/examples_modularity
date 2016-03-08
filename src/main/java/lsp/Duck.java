package lsp;

public abstract class Duck {
  String name;
  
  Duck(String name) {
    this.name = name;
  }

  public void sound() {
    // ...
    System.out.println(name + " does Cuak!");
  }

  public void breath() throws Exception {
    // ...
    System.out.println(name + " breathes...");
  }

  public String shape() {
    return "Duck shape";
  }
}

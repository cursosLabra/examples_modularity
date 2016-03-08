package lsp;

public class RubberDuck extends Duck {
  RubberDuck(String name) {
    super(name);
  }
  
  public void breath() throws Exception {
    throw new Exception("A rubber duck doesn't breath");
  }


}

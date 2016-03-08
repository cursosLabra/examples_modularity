package lsp;

import java.util.ArrayList;
import java.util.List;

public class Driver {

  public static void main(String[] args) throws Exception {
    List<Duck> ducks = new ArrayList<Duck>();
    ducks.add(new WildDuck("duck1"));
    ducks.add(new WildDuck("duck2"));
    ducks.add(new RubberDuck("duck3"));
    for (Duck d: ducks) d.sound();
    for (Duck d: ducks) d.breath();

  }

}

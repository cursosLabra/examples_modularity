package dip.lamp;

public class Main {
  public static void main(String[] args) {
    KitchenLamp lamp1 = new KitchenLamp();
    Button buttonLamp = new Button(lamp1);
    buttonLamp.press();
    buttonLamp.press();
    
    DormLamp lamp2 = new DormLamp();
    Button buttonLamp2 = new Button(lamp2);
    buttonLamp2.press();
    buttonLamp2.press();
  }
}

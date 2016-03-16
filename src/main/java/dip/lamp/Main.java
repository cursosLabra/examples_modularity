package dip.lamp;

/**
 * This is a copy of the Lamp example that appears in the original definition of the SOLID principles
 * 
 * @see <a href="http://docs.google.com/a/cleancoder.com/viewer?a=v&pid=explorer&chrome=true&srcid=0BwhCYaYDn8EgMjdlMWIzNGUtZTQ0NC00ZjQ5LTkwYzQtZjRhMDRlNTQ3ZGMz&hl=en">Original paper</a>
 * 
 * @author Labra
 *
 */
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

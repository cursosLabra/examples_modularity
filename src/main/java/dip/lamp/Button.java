package dip.lamp;

public class Button implements AbstractButton {

  public ButtonClient client;
  public boolean state;

  public Button(ButtonClient client) {
    this.client = client;
    this.state = false;
  }

  public boolean getState() {
    return this.state;
  }

  public void press() {
    boolean buttonOn = getState();
    if (buttonOn) {
      this.state = false;
      client.off();
    } else {
      this.state = true;
      client.on();
    }
  }

}
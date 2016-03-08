package dip.lamp;

public class OriginalButton {
  public OriginalLamp lamp;
  public boolean on;

  public OriginalButton(OriginalLamp lamp) {
    this.lamp = lamp;
    this.on = false;
  }

  public boolean buttonOn() {
    return this.on;
  }

  public void press() {
    if (buttonOn()) {
      this.on = false;
      lamp.off();
    } else {
      this.on = true;
      lamp.on();
    }
  }
}
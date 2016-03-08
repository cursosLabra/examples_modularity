package dip.lamp;

public class DormLamp implements ButtonClient {
  public void on() {
    System.out.println("Lighting dorm lamp up...");
  }

  public void off() {
    System.out.println("Turning dorm lamp off...");
  }
}
package dip.lamp;

public class KitchenLamp implements ButtonClient {
  public void on() {
    System.out.println("Lighting kitchen lamp up...");
  }

  public void off() {
    System.out.println("Turning kitchen lamp off...");
  }
}
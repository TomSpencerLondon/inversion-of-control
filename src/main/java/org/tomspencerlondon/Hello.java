package org.tomspencerlondon;

public class Hello implements Salutation {

  @Override
  public void message() {
    System.out.println("Hello");
  }
}

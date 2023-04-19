package org.example.decorator;

public class BasicPizza implements Pizza{

  @Override
  public String getDescription() {
    return "Dough, Tomato Sauce";
  }

  @Override
  public double getPrice() {
    return 20;
  }
}

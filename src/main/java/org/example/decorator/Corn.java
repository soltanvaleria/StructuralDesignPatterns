package org.example.decorator;

public class Corn extends ToppingDecorator{

  public Corn(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Corn";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 5;
  }
}

package org.example.decorator;

public class Salami extends ToppingDecorator{

  public Salami(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return super.getDescription()+", Salami";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 20;
  }
}

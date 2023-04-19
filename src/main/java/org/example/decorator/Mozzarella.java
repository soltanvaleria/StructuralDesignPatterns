package org.example.decorator;

public class Mozzarella extends ToppingDecorator{

  public Mozzarella(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Mozzarella";
  }

  @Override
  public double getPrice() {
    return super.getPrice()+ 15;
  }
}

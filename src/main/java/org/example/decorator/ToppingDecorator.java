package org.example.decorator;

abstract public class ToppingDecorator implements Pizza{

  private Pizza pizza;

  public ToppingDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription();
  }

  @Override
  public double getPrice() {
    return this.pizza.getPrice();
  }
}

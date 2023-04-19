package org.example.decorator;

public class Client {

  public static void main(String[] args) {
    Pizza pizza1 = new Corn (new Mozzarella(new Salami(new BasicPizza())));
    System.out.println("Ingredients: " + pizza1.getDescription());
    System.out.println("Cost : " + pizza1.getPrice());

    Pizza pizza2 = new Corn (new Mozzarella(new BasicPizza()));
    System.out.println("Ingredients: " + pizza2.getDescription());
    System.out.println("Cost : " + pizza2.getPrice());
  }

}

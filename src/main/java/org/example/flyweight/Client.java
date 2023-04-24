package org.example.flyweight;

public class Client {

  public static void main(String[] args) {
FlyweightFactory factory = new FlyweightFactory();
Flyweight flyweight = factory.getFlyweight("Soltan", 22);
    System.out.println(flyweight.getAge()+flyweight.getUserName());

    flyweight = factory.getFlyweight("Soltan", 21);
    System.out.println(flyweight.getAge()+flyweight.getUserName());


    flyweight = factory.getFlyweight("Soltan", 22);
    System.out.println(flyweight.getAge()+flyweight.getUserName());

    System.out.println(factory.objectCount());
  }
}

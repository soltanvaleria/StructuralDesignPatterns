package org.example.flyweight;

import java.util.function.Function;

public class UserFlyweight implements Flyweight{
  private String userName;
  private int age;

  public UserFlyweight(String userName, int age){
    this.userName = userName;
    this.age = age;
  }

  @Override
  public String getUserName() {
    return userName;
  }

  @Override
  public int getAge() {
    return age;
  }
}

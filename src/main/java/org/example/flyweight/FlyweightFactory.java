package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private static Map<String, Flyweight> flyweightMap = new HashMap<>();

  public static Flyweight getFlyweight(String userName, int age) {
    Flyweight flyweight;
    String key = userName + age;
    if(!flyweightMap.containsKey(key)){
      flyweight = new UserFlyweight(userName, age);
      flyweightMap.put(key, flyweight);
    }
    return flyweightMap.get(key);
  }

  public int objectCount()
  {
    return flyweightMap.size();
  }

}

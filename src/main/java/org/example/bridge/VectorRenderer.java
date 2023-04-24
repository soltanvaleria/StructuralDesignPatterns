package org.example.bridge;

public class VectorRenderer implements Renderer{

  @Override
  public void renderCircle(float radius) {
    System.out.println("Drawing a circle of radius " + radius);
  }

  @Override
  public void renderSquare(float edge) {
    System.out.println("Drawing a square of edge " + edge);
  }
}

package org.example.bridge;

public class RasterRenderer implements Renderer{

  @Override
  public void renderCircle(float radius) {
    System.out.println("Drawing pixels for a circle of radius " + radius);
  }

  @Override
  public void renderSquare(float edge) {
    System.out.println("Drawing pixels for a square of edge " + edge);
  }
}

package org.example.bridge;

public class Client {

  public static void main(String[] args) {
    RasterRenderer rasterRenderer = new RasterRenderer();
    VectorRenderer vectorRenderer = new VectorRenderer();
    Circle circle = new Circle(rasterRenderer, 5);
    circle.draw();
    circle.resize(4);
    circle.draw();
    Square square = new Square(vectorRenderer, 3);
    square.draw();

    Square square1 = new Square(rasterRenderer, 4);
    square1.draw();
  }

}

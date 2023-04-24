package org.example.bridge;

public class Square extends Shape{

  private float edge;
  public Square(Renderer renderer) {
    super(renderer);
  }

  public Square(Renderer renderer, float edge) {
    super(renderer);
    this.edge = edge;
  }

  @Override
  public void draw() {
    super.renderer.renderSquare(edge);
  }

  @Override
  public void resize(float factor) {
    edge *=factor;
  }
}

package org.example.bridge;

public class Circle extends Shape{

  public float radius;
  public Circle(Renderer renderer) {
    super(renderer);
  }

  public Circle(Renderer renderer, float radius) {
    super(renderer);
    this.radius = radius;
  }

  @Override
  public void draw() {
    super.renderer.renderCircle(radius);
  }

  @Override
  public void resize(float factor) {
    radius *=factor;
  }
}

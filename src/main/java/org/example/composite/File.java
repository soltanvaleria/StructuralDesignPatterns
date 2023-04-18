package org.example.composite;

public class File implements FileSystem{
  private String name;
  private int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void printDetails() {
    System.out.println("  File: " + this.name + " (" + this.size + " bytes)");
  }
}

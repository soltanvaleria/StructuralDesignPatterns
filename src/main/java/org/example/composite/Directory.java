package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
  private String name;
  private List<FileSystem> elements = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public void addElement(FileSystem element) {
    this.elements.add(element);
  }

  public void removeElement(FileSystem element) {
    this.elements.remove(element);
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void printDetails() {
    System.out.println("Directory: " + name);
    for (FileSystem element : elements) {
      System.out.print("  ");
      element.printDetails();
    }
  }
}

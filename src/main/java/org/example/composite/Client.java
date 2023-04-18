package org.example.composite;

public class Client {

  public static void main(String[] args) {
    File file1 = new File("file1.txt", 1024);
    File file2 = new File("file2.txt", 2048);
    File file3 = new File("file3.txt", 3072);

    Directory dir1 = new Directory("dir1");
    dir1.addElement(file1);
    dir1.addElement(file2);

    Directory dir2 = new Directory("dir2");
    dir2.addElement(file3);

    Directory root = new Directory("root");
    root.addElement(dir1);
    root.addElement(dir2);

    root.printDetails();
  }

}

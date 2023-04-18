package org.example.adapter;

public class Mp4Adapter extends Mp3{

  Mp4 mp4;

  public Mp4Adapter(Mp4 mp4) {
    this.mp4 = mp4;
  }

  @Override
  public String getName() {
    return mp4.getName();
  }
}

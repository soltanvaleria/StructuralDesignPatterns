package org.example.adapter;

public class Client {

  public static void main(String[] args) {
    Mp4 mp4 = new Mp4("something.mp4");
    Mp3 mp3 = new Mp3("2.mp3");
    MediaPlayer mediaPlayer = new MediaPlayer();
    Mp4Adapter mp4Adapter = new Mp4Adapter(mp4);

    mediaPlayer.play(mp3);
    mediaPlayer.play(mp4Adapter);

  }

}

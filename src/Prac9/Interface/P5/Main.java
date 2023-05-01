package Prac9.Interface.P5;

public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
    }
}

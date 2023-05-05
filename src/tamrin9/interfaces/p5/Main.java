package tamrin9.interfaces.p5;

public class Main {
    public static void main(String[] args) {

        MP3Player mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.play();
        mp3Player.stop();

        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.play();
        cdPlayer.stop();
    }
}

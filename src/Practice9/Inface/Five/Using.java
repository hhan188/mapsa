package Practice9.Inface.Five;

public class Using {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        MP3Player mp3Player = new MP3Player();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();


    }
}

package practice9.interface5;

import practice9.interface5.CDPlayer;
import practice9.interface5.MP3Player;

public class UsingPlayable {
    public static void main(String[] args) {

    CDPlayer cd=new CDPlayer();
    cd.play();
    cd.pause();
    cd.stop();

    MP3Player mp3=new MP3Player();
    mp3.play();
    mp3.pause();
    mp3.stop();

}
}

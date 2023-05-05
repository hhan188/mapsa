package SoheylSayyah.Practice9.Interface.Exercise5;

public class Main {
    public static void main(String[] args) {
        Playable[] playables = new Playable[2];
        playables[0] = new MP3Player();
        playables[1] = new CDPlayer();
        for (int i = 0; i < playables.length; i++) {
            playables[i].play();
            playables[i].pause();
            playables[i].stop();
        }
    }
}

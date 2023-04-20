package tamrin4;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println("isCatPlaying(true, 10) - > " +isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36) -> " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(true, 43) -> " + isCatPlaying(true, 43));
        System.out.println("isCatPlaying(false, 35) - > " + isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (temperature>=25 && temperature<=35)
            return true;
        if (summer && temperature>=25 && temperature<=45)
            return true;
        return false;
    }
}

package tamrin5;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (bigCount * 5 > goal)
            return false;
        if (smallCount < goal - bigCount * 5)
            return false;
        return true;
    }
}

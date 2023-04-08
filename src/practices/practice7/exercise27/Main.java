package practices.practice7.exercise27;

public class Main {
    public static void main(String[] args) {
        TernaryUtils utils = new TernaryUtils();
        System.out.println("************ EASY **************");
        System.out.println(utils.statusEasy(false));
        System.out.println(utils.minEasy(15, 13));
        System.out.println("************ Medium **************");
        System.out.println(utils.maxMedium(15, 12, 19));
        System.out.println(utils.maxMedium(15, 20, 19));
        System.out.println(utils.maxMedium(25, 12, 19));
        System.out.println(utils.student(60));
        System.out.println(utils.student(59));
        System.out.println("**************** HARD ******************");

    }
}

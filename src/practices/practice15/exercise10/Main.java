package practices.practice15.exercise10;

import static practices.practice15.exercise10.Game.*;
import static practices.practice15.exercise10.Utils.rps;

public class Main {
    public static void main(String[] args) {

        System.out.println(rps(Rock, Paper));
        System.out.println(rps(Paper, Rock));
        System.out.println(rps(Paper, Scissor));
        System.out.println(rps(Scissor, Scissor));
        System.out.println(rps(Scissor, Paper));


    }
}

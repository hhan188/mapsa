package practices.practice13.utils;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
        public void menu() throws  InputMismatchException {


            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t   -------------------------------------\n" +
                    "\t\t\t****\"WELCOME TO MY THEATER\"**** \n" +
                    "\t\t   -------------------------------------");
            while (true) {
                System.out.println(
                        "\n\t\t\t\t    *PLEASE PRESS A BUTTON* \n" +
                                "\n1:MEMBERS MENU \n" +
                                "2:ADMINISTRATOR MENU  \n" +
                                "3:EXIT ");
                String a = sc.next();
                switch (String.valueOf(a)) {
                    case "1": {

                        break;
                    }
                    case "2": {

                        break;
                    }
                    case "3": {
                        return;
                    }
                    default:
                        System.out.println("\n\t\t\"ERROR\"Please Enter A Valid Number From \'1\' To \'3\'");
                }
            }

        }
    }





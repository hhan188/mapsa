package practices.practice13.view;

import practices.practice13.controller.CustomIOException;
import practices.practice13.controller.CustomInputMismatchException;
import practices.practice13.utils.Menu;


/**
 * Author @Ali-Jamali
 */

public class Main {
    public static void main(String[] args) throws CustomInputMismatchException, CustomIOException {
        try {
            Menu menu = new Menu();
            menu.menu();
        } catch (CustomInputMismatchException | CustomIOException e) {
            System.out.println(e.getMessage());
        }
    }
}

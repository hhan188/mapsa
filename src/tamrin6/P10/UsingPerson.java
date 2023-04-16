package tamrin6.P10;

public class UsingPerson {

        public static void main(String[] args) {
            Person p1 = new Person("Zahra", 30);
            Person p2 = new Person("Maryam", 30);

            System.out.println(p1.compareAges(p2));
            // or System.out.println(p2.compareAges((p1)));
        }
    }

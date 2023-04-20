package tamrin7.p18;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{new Person("Ali", 8),
                new Person("Ehsan", 40),
                new Person("Yasna", 12),
                new Person("Masoomeh", 39)};

        double avgAge = calcAvgAge(people);
        System.out.print("Average of ages: ");
        System.out.printf("%5.2f%n", avgAge);

    }

    private static double calcAvgAge(Person[] people) {
        double sum = 0;
        for (Person p:people){
            sum += p.getAge();
        }
        return sum / people.length;
    }
}

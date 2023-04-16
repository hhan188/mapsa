package tamrin6.P10;

public class Person {
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String compareAges(Person p2) {
            if (this.age > p2.age) {
                return this.name + " is older than " + p2.name;
            } else if (this.age < p2.age) {
                return this.name + " is younger than " + p2.name;
            } else {
                return this.name + " and " + p2.name + " are the same age";
            }
        }
    }


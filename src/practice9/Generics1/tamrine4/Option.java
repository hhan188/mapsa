package practice9.Generics1.tamrine4;

    public class Option<T> {

        private final T value;



        public Option(T value) {
            this.value = value;
        }

        public T getValue() {
            if (isPresent(value))
                return value;
            return null;
        }

        public boolean isPresent(T value) {
            return value != null;
        }{
    }

        public static void main(String[] args) {
        Option<String> op=new Option<>("jj");
        System.out.println(op.getValue());


        }
    }


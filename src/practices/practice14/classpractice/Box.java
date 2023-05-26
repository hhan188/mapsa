package practices.practice14.classpractice;

public class Box<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Box<String> type = new Box<>();
        type.set("String");
        System.out.println(type.get());

        Box<Integer> type1 = new Box<>();
        type1.set(100);
        System.out.println(type1.get());

//        Integer integer=(Integer) type.get();
//        System.out.println(integer);


    }
}

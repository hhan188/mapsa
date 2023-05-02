package practices.practice9.interface1.exercise2;

public interface Calculator<T, U extends Number> {
    T add(U u1, U u2);

    T subtract(U u1, U u2);

    T multiply(U u1, U u2);

    T divide(U u1, U u2);


}

package Practice9.Generics.Two;

public class Max<I> implements Maximum{

    Integer temp = 0;

    @Override
    public Integer max(Integer[] e) {
        for (int i = 0; i < e.length; i++)
            if (temp < e[i])
                temp = e[i];
        return temp;
    }
}

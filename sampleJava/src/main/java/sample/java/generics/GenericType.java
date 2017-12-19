package sample.java.generics;

/**
 * Created by pkumar on 27/9/17.
 */
public class GenericType<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericType<String> s = new GenericType<>();
        s.setT("Pradeep");
        System.out.println(s.getT());

        GenericType<Integer> i = new GenericType<>();
        i.setT(31);
        System.out.println(i.getT());
    }
}

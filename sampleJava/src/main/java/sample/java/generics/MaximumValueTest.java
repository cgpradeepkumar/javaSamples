package sample.java.generics;

/**
 * Created by pkumar on 27/9/17.
 */
public class MaximumValueTest {

    public static <E extends Comparable<E>> E findMaximum(E x, E y, E z) {
        E max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max =z;
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println("max of (3, 5, 4) = " + findMaximum(3, 5, 4));
        System.out.println("max of (118.7, 144.9, 41.5) = " + findMaximum(118.7, 144.9, 41.5));
        System.out.println("max of (\"pear\", \"apple\", \"orange\") = " + findMaximum("pear", "apple", "orange"));
    }
}

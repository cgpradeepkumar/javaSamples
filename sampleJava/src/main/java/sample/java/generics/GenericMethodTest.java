package sample.java.generics;

import java.util.Date;

/**
 * Created by pkumar on 27/9/17.
 */
public class GenericMethodTest {

    public static <T> void printArray(T[] input) {
        for (T t : input) {
            System.out.printf("%s", t);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] strings = {"Generics", "Annotations", "Reflections"};
        Integer[] ints = {1,2,3,4};
        Character[] chars = {'A', 'B', 'C', 'D'};
        Date[] dates = {new Date()};

        printArray(strings);
        printArray(ints);
        printArray(chars);
        printArray(dates);
    }
}

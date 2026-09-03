package day12training;
 import java.util.*;

public class merge{
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 4));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 3, 4));

        a.addAll(b);

        System.out.println(a);
    }
}
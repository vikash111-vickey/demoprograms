package day10training;
import java.util.*;
public class  Greedy {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        int lastFinish = finish[0];
        System.out.println("Selected activities:");
        System.out.println("Activity 1");
        for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinish) {
                System.out.println("Activity " + (i + 1));
                lastFinish = finish[i];
            }
        }
    }
}
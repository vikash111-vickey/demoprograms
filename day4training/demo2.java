package day4training;

import java.util.HashSet;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) 
        	set.add(num);
        System.out.println(set.contains(target) ? "Number found" : "Number not found");
    }
}

//hashset demo

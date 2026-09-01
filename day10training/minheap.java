package day10training;

import java.util.PriorityQueue;

public class minheap {

    public static void main(String[] args) {

        int[] n = {10, 5, 20, 8, 15, 30, 25};
        int k = 3;

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int number : n) {

            minheap.add(number);

            if (minheap.size() > k) {
                minheap.poll();
            }
        }

        System.out.println("Top " + k + " largest numbers:");

        while (!minheap.isEmpty()) {
            System.out.println(minheap.poll());
        }
    }
}
package day10training;
import java.util.PriorityQueue;
import java.util.Collections;
public class minmaxmedianheap {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 8, 15 , 3, 25};
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int number : a) {
            minheap.add(number);
        }
        System.out.println("Minimum element: " + minheap.peek());
        PriorityQueue<Integer> maxheap =
                new PriorityQueue<>(Collections.reverseOrder());
        for (int number : a) {
            maxheap.add(number);
        }
        System.out.println("Maximum element: " + maxheap.peek());
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right =new PriorityQueue<>();
        for (int number : a) {
            if (left.isEmpty() || number <= left.peek()) {
                left.add(number);
            } else {
                right.add(number);
            }

            if (left.size() > right.size() + 1) {
                right.add(left.poll());
            }

            if (right.size() > left.size()) {
                left.add(right.poll());
            }
        }

        double median;

        if (left.size() == right.size()) {
            median = (left.peek() + right.peek()) / 2.0;
        } else {
            median = left.peek();
        }
        System.out.println("Median: " + median);
        int k = 3;
        PriorityQueue<Integer> top3 = new PriorityQueue<>();
        for (int number : a) {
            top3.add(number);
            if (top3.size() > k) {
                top3.poll();
            }
        }
        System.out.println("Top " + k + " largest numbers:");

        while (!top3.isEmpty()) {
            System.out.println(top3.poll());
        }
    }
}

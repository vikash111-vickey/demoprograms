package day10training;
import java.util.PriorityQueue;
public class medianofheap {
    public static void main(String[] args) {
        int[] a = {50, 40, 20, 10};
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int x : a) {
            heap.add(x);
        }

        for (int i = 0; i < a.length / 2 - 1; i++) {
            heap.poll();
        }

        if (a.length % 2 == 0) {
            int x = heap.poll();
            int y = heap.poll();
            System.out.println("Median = " + (x + y) / 2.0);
        } else {
            System.out.println("Median = " + heap.poll());
      }
   }
}
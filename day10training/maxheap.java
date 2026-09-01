package day10training;
import java.util.PriorityQueue;
import java.util.Collections;
public class maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(30);
        maxheap.add(10);
        maxheap.add(20);
        maxheap.add(5);
        System.out.println("Max heap " + maxheap);
        System.out.println("Largest element " + maxheap.peek());
    }
}
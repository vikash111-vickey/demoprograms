package day10training;
import java.util.*;
public class activitycollectoin {
	    public static void main(String[] args) {
	        int[] arrival = {9, 9,10,10,11};
	        int[] departure = {10,11,10,11,12};
	        int n = arrival.length;
	        int lastFinish = departure [0];
	        System.out.println("train 1 : " + arrival[0] + " to " + departure [0]);
	        for (int i = 1; i < n ; i++) {
	            if (arrival[i] >= lastFinish) {
	                System.out.println("train " + (i + 1) + " : " + arrival[i] + " to " + departure [i]);
	                lastFinish = departure [i];
	            }
	        }
	    }
	}

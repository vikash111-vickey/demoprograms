package day10training;
import java.util.*;
public class greedy3 {
	    public static void main(String[] args) {
	        int[] start = {9, 10, 11, 11, 12, 1};
	        int[] finish = {10, 11, 12, 1, 1, 2};
	        int n = start.length;
	        int lastFinish = finish[0];
	        System.out.println("Patient 1: " + start[0] + " to " + finish[0]);
	        for (int i = 1; i < n; i++) {
	            if (start[i] >= lastFinish) {
	                System.out.println("Patient " + (i + 1) + " : " + start[i] + " to " + finish[i]);
	                lastFinish = finish[i];
	            }
	        }
	    }
	}


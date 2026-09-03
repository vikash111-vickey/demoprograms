package day12training;
public class sample2 {

	    public static void main(String[] args) {

	        int[] a = {7, 1, 5, 3, 6, 4};

	        int profit = 0;

	        for (int i = 0; i < a.length; i++) {

	            for (int j = i + 1; j < a.length; j++) {

	                int current = a[j] - a[i];

	                if (current > profit) {
	                    profit = current;
	                }
	            }
	        }

	        System.out.println("Maximum Profit = " + profit);
	    }
	}
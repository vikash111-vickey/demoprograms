package day6traininig;

public class sample2 {

	public static void main(String[] args) {
		        int[] numbers = {10, 20, 30, 40, 50};
		        int windowSize = 3;

		        int maxSum = 0;

		        for (int k = 0; k <= numbers.length - windowSize; k++) {

		            int sum = 0;

		            for (int i = k; i < k + windowSize; i++) {
		                sum = sum + numbers[i];
		            }

		            if (sum > maxSum) {
		                maxSum = sum;
		            }
		        }

		        System.out.println("Highest window sum = " + maxSum);
		    
		}

	}



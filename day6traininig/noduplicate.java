package day6traininig;
import java.util.HashSet;
public class noduplicate {
	
	    public static void main(String[] args) {

	        int[] arr1 = {10, 20, 30, 30, 40};
	        int[] arr2 = {30, 40, 50, 60};

	        HashSet<Integer> result = new HashSet<>();
	        for (int num : arr1) {
	            result.add(num);
	        }

	        
	        for (int num : arr2) {
	            result.add(num);
	        }

	        System.out.println("All unique values: " + result);
	    }
	}
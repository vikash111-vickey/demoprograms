package day6traininig;

import java.util.HashSet;

public class duplicatestring {

	public static void main(String[] args) {
		String[] array1= {"vikash","vikas","thilak"};
		String[] array2= {"thilak","yashwanth","yeshas"};
        HashSet<Integer> result = new HashSet<>();
        for (int num : array1) {
            result.add(num);
        }

        
        for (int num : array2) {
            result.add(num);
        }

        System.out.println("All unique values: " + result);
    }
}

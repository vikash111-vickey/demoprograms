package day4training;
import java.util.HashSet;
public class hashset {
	
	    public static void main(String[] args) {

	        HashSet<Integer> numbers = new HashSet<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        int target = 40;

	        if (numbers.contains(target)) {
	            System.out.println("Number found");
	        } else {
	            System.out.println("Number not found");
	        }
	    }
	}
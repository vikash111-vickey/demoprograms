package day12training;
public class sample {
	    public static void main(String[] args) {

	        int[] a = {2, 7, 11, 15};

	        int t = 7;

	        boolean found = false;

	        for (int i = 0; i < a.length; i++) {

	            if (a[i] == t) {
	                System.out.println(a[i]);
	                found = true;
	                break;
	            }
	        }

	        if (!found)
	            System.out.println("not found");
	    }
	}
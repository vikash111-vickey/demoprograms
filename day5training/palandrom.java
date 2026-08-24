package day5training;

public class palandrom {

	public static void main(String[] args) {
		String n="madam";
		String rev="";
		 for (int i = n.length() - 1; i >= 0; i--) {
	            rev = rev + n.charAt(i);
	        }
		 if(n.equals(rev)) {
			 System.out.println("palandrom");
		}else {
			 System.out.println("not palandrom");
		}
	}

}

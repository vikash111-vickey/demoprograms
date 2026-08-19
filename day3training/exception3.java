package day3training;

public class exception3 {

	public static void main(String[] args) {
		try {
			System.out.println("vikash");
			System.out.println(10/0);
		}
		catch(NullPointerException ne){
			System.out.println("something something" + ne);
		}
		finally {
			System.out.println("finally block is always executed");
		}
	}

}

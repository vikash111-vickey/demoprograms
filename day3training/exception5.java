package day3training;

public class exception5 {

	public static void main(String[] args) {
		System.out.println("vikash");
		try {
			int[] a= {10,20,30};
			System.out.println("line 1");
			System.exit(0);
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		catch(Exception e){
			System.out.println("exception handled");
		}

	}

}

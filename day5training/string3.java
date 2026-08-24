package day5training;

public class string3 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3= new String("Hello");
		String s4= new String("Hello");
		System.out.println("s1==s2   : "+(s1==s2));
		System.out.println("s1.equal(s2)   : "+s1.equals(s2));
		System.out.println();
		System.out.println("s1==s3   : "+(s1==s3));
		System.out.println("s1.equal(s2)   : "+s1.equals(s3));
		System.out.println();
		System.out.println("s3==s4   : "+(s3==s4));
		System.out.println("s3.equal(s4)   : "+s3.equals(s4));
		System.out.println();
		
	}

}

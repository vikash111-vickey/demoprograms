package day3training;

public class exception2 {
	public static void main(String[] args){
		System.out.println("hello welcome");
		try {
			int a=10;
			int b=0;
			int c= a/b;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println(" Error handled"+e);
			
		}
		
	}
	
}
// if we add e it will show what type of exception
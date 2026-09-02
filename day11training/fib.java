package day11training;
//space optimization prgoram
public class fib {

	public static void main(String[] args) {
		
		int n=9;
		int f1=0;
		int f2=1;
		for (int i=0;i<n;i++) {
			int c=f1+f2;
			System.out.println("the fib no is "+c );
			f1=f2;
			f2=c;
		}

	}

}

package demo;

public class variable {
	int a=66;
	static int c=99;
	void m1()
	{
		int a=10;
		System.out.println("local variable"+a);
	}
	public variable() {
	    int b=40;
	    System.out.println("local variable"+ b);
	}
	public static void main(String[] args) {
		variable test= new variable();
		test.m1();
		System.out.println( "instance"+ test.a);
		System.out.println(c);
		System.out.println(variable.c);
		

	}

}

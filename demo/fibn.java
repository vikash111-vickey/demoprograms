package demo;

public class fibn {
	void fib() {
	int	n=10;
	int a=0,b=1;
	System.out.println("fibonacci series");
	for (int i=1;i<=n;i++) {
		System.out.println(a+"");
		int c=a+b;
		a=b;
		b=c;
	}
	}
	public static void main(String[] args) {
		fibn bb=new fibn();
		bb.fib();
		}
	}



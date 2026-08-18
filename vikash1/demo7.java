package vikash1;

 class addd
{
   int x =10;
		   int y =20;
}

public class demo7 extends addd {
	int n=20;
	int m =30;
	
	void add(int a , int b)
	{
		System.out.println(x+y);
		System.out.println(n+m);
		System.out.println(a+b);
	}
public static void main(String[] args) {
	demo7 jj = new demo7();
	jj.add(2, 3);
	
}
}

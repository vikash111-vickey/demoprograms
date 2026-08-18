package vikash1;

class demo {
	void overr() 
	{
		System.out.println("hiii bacho");
	}
	void overr(int a) 
	{
		System.out.println("hello bouys"+a);
	}
}
	public class overriding extends demo
	{
		void overr(int a) 
		{
			System.out.println("hello boys and girls"+a);
		}
	
	public static void main(String[] args) 
	{
		overriding  vv=new overriding ();
		vv.overr();
		vv.overr(6);
	}

	}

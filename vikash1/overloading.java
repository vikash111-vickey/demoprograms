package vikash1;

public class overloading {
void add() 
{
	System.out.println("jai shree ram ");
}
void add( int a) 
{
	System.out.println("jai shree"+ a);
}
	public static void main(String[] args)
	{
		overloading test = new overloading();
		test.add();
		test.add(6);
	}

}

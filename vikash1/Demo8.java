package vikash1;

interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Deposit");
	}
}

public class Demo8 extends Abc{

	public	void with()
	{
		System.out.println("Withdraw");
	}

	
public static void main(String[] args) 
{
	Demo8  v = new Demo8();
	v.depo();
	v.with();
 }
}

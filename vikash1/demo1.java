package vikash1;
class GrandParent
{
	void bp()
	{
		System.out.println(" understain bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
}

public class demo1 extends GrandParent{

	public static void main(String[] args) {
		demo1 bb= new demo1();
		Parent vv = new Parent();
		bb.bp();
	    vv.cancer();
	}
}
// herirachi

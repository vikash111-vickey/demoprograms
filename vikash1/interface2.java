package vikash1;

interface Atm3 {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class interface2 implements Atm3, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		interface2 v = new interface2();
		v.min();
		v.depo();
	}
}

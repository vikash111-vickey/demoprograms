package vikash1;

class Parents {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class test4 extends Parents {

	public static void main(String[] args) {
		test4 test = new test4();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}
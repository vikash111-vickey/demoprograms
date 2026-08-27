package day7training;

public class demo1 {
static void methodA() {
	System.out.println("inside methodA");
	methodB();
	System.out.println("back to methode A");
	
}
static void methodB() {
	System.out.println("inside methode B");
}
	public static void main(String[] args) {
		System.out.println("inside main");
		methodA();
		System.out.println("back to main ");
	}

}

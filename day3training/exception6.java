package day3training;
import java.util.Scanner;

class exception6 {
	static void validate(int age) {
		if (age < 18) {
		
			throw new ArithmeticException("not elgible for voteing9");
		} else {
			System.out.println("welcome to the voteing");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your age ");
		int n = s.nextInt();
		validate(n);
		System.out.println("rest of the code");
	}
}


package day3training;
public class exception1 {
	public static void main(String[] args) {
		System.out.println("Hello");

		try {
			System.out.println(10 / 2);
			int[] a = { 10, 20, 30 };
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array handle");

		} catch (ArithmeticException e) {
			System.out.println(" arthimetic handle");
		} catch (Exception e) {
			System.out.println(" exception handle");
		}
		System.out.println("Hello sir");
	}

}


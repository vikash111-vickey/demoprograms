package day7training;

public class sample2 {
	public static void main(String[] args) {
		int amount=10000;
		int withdraw=2000;
		for (int i=0;i<amount;i++) {
			if(withdraw<amount) {
				amount=amount-withdraw;
			}
			else {
				System.out.println(amount);
			}
		}
		System.out.println(" ");
	}

}

package day7training;

public class recoursionsample {
	static void withdrawmoney(int amount ,int withdrawal) {
		if(amount <= 0) {
			System.out.println("withdrawal completed");
			return;
		}
		System.out.println("withdraw :"+ withdrawal);
		amount=amount-withdrawal;
		withdrawmoney(amount,withdrawal);
	}
	public static void main(String[] args) {
		int amount =10000;
		int withdrawal=2000;
		withdrawmoney(amount,withdrawal);
	}

}

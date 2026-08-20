package day4training;
import java.util.Scanner;
public class sample4 {

	public static void main(String[] args) {
		int a=50;
		int b=5;
		while(true) {
		System.out.println("enter 1 for addition:");
		System.out.println("enter 2 for subtraction:");
		System.out.println("enter 3 for multiplication:");
		System.out.println("enter 4 for divison:");
		System.out.println("enter the choice ");
		Scanner cc=new Scanner(System.in);
		int choice =cc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("additon:");
			System.out.println(a+b);
			break;
		case 2:
			System.out.println("additon:");
			System.out.println(a-b);
			break;
		case 3:
			System.out.println("additon:");
			System.out.println(a*b);
			break;
		case 4:
			System.out.println("additon:");
			System.out.println(a/b);
			break;
		}
		System.out.println();
		}

	}

}

package day4training;
import java.util.Scanner;
public class sample5 {

	public static void main(String[] args) {
		Scanner cc=new Scanner(System.in);
		while(true) {
			System.out.println("enter the week number:");
		int choice =cc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("sunday");
		
			break;
		case 2:
			System.out.println("monday");
			
			break;
		case 3:
			System.out.println("tuesday");
		
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid day ");
		}
		System.out.println();
	}
		}

}

package day4training;


import java.util.Scanner;
public class samplefoodmenu {

	public static void main(String[] args) {
		Scanner cc=new Scanner(System.in);
		while(true) {
			System.out.println("enter 1 for pizza:");
			System.out.println("enter 2 for burgre:");
			System.out.println("enter 3 for pasta:");
			System.out.println("enter 4 for ratibale:");
			System.out.println("enter 5 for rfridrice:");
			System.out.println("enter the food si no:");
		int choice =cc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("pizza");
		
			break;
		case 2:
			System.out.println("burger");
			
			break;
		case 3:
			System.out.println("pasta");
		
			break;
		case 4:
			System.out.println("rotibale");
			break;
		case 5:
			System.out.println("fridrice");
			break;
		default:
			System.out.println("invalid food item ");
		}
		System.out.println();
	}
		}

}
package day13training;
import java.util.Scanner;
public class sample10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the floor number: ");
		int f= sc.nextInt();
		int critical=6;
		
		if(f<critical) {
			System.out.println("egg survives");
		}else {
			System.out.println("egg breakes ");
		}

	}

}

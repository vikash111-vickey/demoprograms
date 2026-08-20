package day4training;
import java.util.Scanner;
public class sample6 {

	public static void main(String[] args) {
		Scanner cc=new Scanner(System.in);
		while(true) {
		System.out.println("enter the number");
		int n=cc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println();
	}
	}
}

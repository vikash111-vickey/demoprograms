package day4training;

public class sample7 {

	public static void main(String[] args) {
		int[]a= {10,15,12,20,18,14,16};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("total electricity consumption for 7 days "+sum);
	}

}

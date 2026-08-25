package day6traininig;

public class array3 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		int windowsize=3;
		int sum=0;
		for(int i=0;i<windowsize;i++) {
			sum=sum+numbers[i];
		}
		System.out.println("sum = "+sum);
		int start=0;
		for(int end=windowsize;end<numbers.length;end++) {
			sum=sum+numbers[start];
			sum=sum+numbers[end];
			start++;
			System.out.println("sum = "+sum);
			
		}
	}

}

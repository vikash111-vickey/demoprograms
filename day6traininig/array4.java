package day6traininig;

public class array4 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		int windowsize=3;
		
		for(int k=0;k<=numbers.length-windowsize;k++) {
			int sum=0;
			for(int i=k;i<k+windowsize;i++) {
				sum=sum+numbers[i];
				
			}
			System.out.println("sum = "+sum);
		}
		

	}

}

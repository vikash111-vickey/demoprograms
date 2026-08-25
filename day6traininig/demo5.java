package day6traininig;

public class demo5 {

	public static void main(String[] args) {
		int[] number= {2,3,1,2,4,3};
		int target=7;
		int start=0;
		int end=0;
		int minlength=number.length;

		for(int k=0;k<=number.length;k++) {
			int sum=0;
			for(int i=k;i<k;i++) {
				sum=sum+number[i];
				while(sum>=target) {
					int length=end - start+1;
					if(length<minlength) {
						minlength=length;
					}
					sum=sum-number[start]; 
					start++;
				}
			}
			System.out.println("sum = "+sum);
		}}

	}

}

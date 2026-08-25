package day6traininig;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {2,3,1,2,4,3};
		int target=7;
		int start=0;
		int sum=0;
		int minlength=number.length;
		for(int end=0;end<number.length;end++) {
			sum=sum+number[end];
			while(sum>=target) {
				int length=end - start+1;
				if(length<minlength) {
					minlength=length;
				}
				sum=sum-number[start]; 
				start++;
			}
		}
		System.out.println("smallest windo length="+minlength);
	}

}

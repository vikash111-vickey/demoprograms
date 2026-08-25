package day6traininig;

public class array2 {

	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		int targrt =80;
		int left=0;
		int right = number.length-1;
		while(left< right) {
			int sum=number[left]+number[right];
			if(sum==targrt)
			{
				System.out.println ("number found:"+number[left]+"and"+number[right]);
						break;
			}
			else if(sum<targrt)
			{
				left++;
			}
			else 
			{
				right++;
			}
		 }
		

	}

}

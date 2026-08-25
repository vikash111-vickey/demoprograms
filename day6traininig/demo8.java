package day6traininig;

public class demo8 {

	public static void main(String[] args) {
		int[] expences= {100,200,300,400,500};
		int[] prefixsum=new int[expences.length];
		prefixsum[0]=expences[0];
		for(int i=1;i<expences.length;i++) {
			prefixsum[i]=prefixsum[i-1]+expences[i];
		}
			int sum=prefixsum[3]-prefixsum[0];
			System.out.println("total spent =   $  "+sum);
	}

}

package day4training;

public class sample8 {

	public static void main(String[] args) {
		int max=0;
		int[]a= {78, 65, 89, 92, 71};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]> max) 
			{
				max=a[i];
			}

		}
		System.out.println(max);
	}

}

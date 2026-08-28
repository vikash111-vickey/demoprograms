package day8trainig;

public class something3 {

	 public static void main(String[] args) {
		
	
		int[] a= {1,6,4,8,7,9,5,3};
		int windowsize=3;
		for(int k=0;k<=a.length-windowsize;k++) 
		{
			int max =a[k];
			for(int i=k;i<k+windowsize;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			System.out.println(max);
		}
	}
}
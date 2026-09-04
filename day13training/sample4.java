package day13training;

public class sample4 {

	public static void main(String[] args) {
		int[] a= {10,15,20,25,30};
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				count++;
				System.out.println("Id's that are even are "+ a[i]);
			}
				
		}
		System.out.println(" no of ids even "+count);
	}

}


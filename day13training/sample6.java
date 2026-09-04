package day13training;

public class sample6 {

	public static void main(String[] args) {
		int[] a= {101,102,101,103,101};
		int k=101;
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
				if(a[i]==k) {
					count++;
				}
}
		System.out.println(count+" Times id appears");


	}

}

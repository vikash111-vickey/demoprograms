package day6traininig;

public class inplacerearrangement {
public static void main(String[] args) {
	int[] numbers= {3,1,2,4};
	int left=0;
	int right=numbers.length-1;
	while(left<right)
	{
		int temp=numbers[left];
		numbers[left]=numbers[right];
		numbers[right]=temp;
		left++;
		right--;
	}
	System.out.println("re-arrangend array");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
}
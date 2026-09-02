package day11training;

public class matrixtranspose {

	public static void main(String[] args) {
		int[][]matrix= 
			{
				{1,2,3},
				{4,5,6}
				};
		System.out.println("Transpose: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(matrix[j][i]+" ");
				
			}
			System.out.println();
		}
	}    
}

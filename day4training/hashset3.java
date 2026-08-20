package day4training;

import java.util.HashSet;

public class hashset3 {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,20,50};
		HashSet<Integer> set =new HashSet<>();
		for(int number:numbers)
		{
			if(set.contains(number)) {
				System.out.println("duplicate:"+number);
			}
			else {
				set.add(number);
			}
		}

	}

}

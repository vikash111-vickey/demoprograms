package day5training;

import java.util.HashSet;

public class sample2 {

	public static void main(String[] args) {
		HashSet set =new HashSet();
		System.out.println("Initial size od hashset befour adding elements: "+set.size());
		System.out.println("hashset is empty brfour adding values : "+ set.isEmpty());
		System.out.println("contensts of hashset befour adding values : "+set);
		set.add("c");
		set.add("a");
		set.add("e");
		set.add("b");
		set.add("d");
		set.add("f");
		set.add(null);
		System.out.println("size of hashset after adding elements : "+set.size());
		System.out.println("hashset is empty after adding values: "+set);
		boolean b1=set.contains("e");
		System.out.println("value e is present : "+b1);
		boolean b2=set.contains("r");
		System.out.println("value r is present : "+b2);
		set.remove("b");
		System.out.println("size of hashset after deletion :"+set.size());
		System.out.println("contents of hashset after deletion :"+set);
		set.clear();
		System.out.println("size of hashset after clearing :"+set.size());
		System.out.println("comntents of hashset after clearing :"+set);
		
		
		
	

	}

}

package day4training;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println("initial size of array before adding element:"+list.size());
		System.out.println("arraylist is empty before adding vlaue :"+list.isEmpty());
		System.out.println("contents of arraylist befour values:"+list);
		list.add("c");
		list.add("a");
		list.add("s");
		list.add("d");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("j");
		list.add("c");
		list.add(null);
		System.out.println("size of arraylist after adding elements :"+ list.size());
		System.out.println("arraylist is empty after adding vlaue :"+list.isEmpty());
		System.out.println("contents of arraylist after values:"+list);
		boolean b1=list.contains("s");
				System.out.println("value s is present :"+b1);
		boolean b2=list.contains("d");
				System.out.println("value s is present :"+b2);
				list.remove("h");
		System.out.println("size of array after delition:"+list.size());
		System.out.println("contents of arraylist after delition :"+list);
		list.clear();
		System.out.println("size of arraylist after clearing:"+list.size());
		System.out.println("contents of arraylist after clearing :"+list);
		
	}

}


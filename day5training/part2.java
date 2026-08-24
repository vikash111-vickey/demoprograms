package day5training;
import java.util.HashSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class part2 {

	public static void main(String[] args) {
		HashSet c=new HashSet();
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		c.add("E");
		c.add("F");
		c.add("G");
		c.add(null);
		System.out.println(c);
		c.add("ram");
		Iterator i = c.iterator();
		while (i. hasNext()) 
		{
		//	Object e = i.next();
			System.out.print(i.next());
			System.out.println();
		}
		for(Object value : c) {
			System.out.println(value);
		}
		System.out.println(c);
		
	
		}
	}



package day8trainig;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class empx {
    String name;
    String dept;
    int sal;
    empx(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }
    public String toString() {
        return name + "-" + dept + "-" + sal;
    }
}

public class sample {

    public static void main(String[] args) 
		
	 {

        Scanner cc = new Scanner(System.in);

        List<empx> employees = new ArrayList<>();

        int n = cc.nextInt();

        for (int i = 0; i < n; i++) {
        	String name = cc.next();
            String dept = cc.next();
            int sal = cc.nextInt();

            employees.add(new empx(name, dept, sal));
        }
        employees.sort(Comparator.comparing((empx e) -> e.dept).thenComparing((empx e) -> e.sal,Comparator.reverseOrder()
                ).thenComparing(e -> e.name));

        for (empx e : employees) {
            System.out.println(e);
        }

        cc.close();
    }
}


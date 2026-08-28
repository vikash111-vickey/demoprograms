
package day8trainig;

import java.util.*;

class empxy {

    String name;
    String dept;
    int sal;

    empxy(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }
    public String toString() {
        return name + "-" + dept + "-" + sal;
    }
}

public class different {

    public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);

        List<empxy> employees = new ArrayList<>();

        int n = cc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = cc.next();
            String dept = cc.next();
            int sal = cc.nextInt();

            employees.add(new empxy(name, dept, sal));
        }

        employees.sort(
            Comparator.comparing((empxy e) -> e.dept)
                .thenComparing(
                    (empxy e) -> e.sal,
                    Comparator.reverseOrder()
                )
                .thenComparing(e -> e.name)
        );

        for (empxy e : employees) {
            System.out.println(e);
        }

        cc.close();
    }
}


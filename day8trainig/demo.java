package day8trainig;
import java.util.*;
class employee{
		String name;
		String department;
		int salary;
		employee(String name,String department,int salary)
		{
			this.name=name;
			this.department=department;
			this.salary=salary;
		}
		public String toString() {
			return name+"-"+ department +"-"+salary;
		}
	}
	public class demo {
	public static void main(String[] args) {
		List<employee>employees = Arrays.asList(
				new employee("ravi","IT",60000),
				new employee("anil","HR",50000),
				new employee("priya","IT",50000),
				new employee("amith","HR",60000),
				new employee("rahul","AT",50000)
				);
		employees.sort(
				Comparator.comparing((employee e) -> e.department)
					.thenComparing((employee e) ->e.salary,Comparator.reverseOrder()).thenComparing(e ->e.name)
				);
				for (employee e: employees) {
					System.out.println(e);
				}
	}
}
	
	
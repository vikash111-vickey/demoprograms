package homework;

import java.util.ArrayList;
import java.util.Scanner;

class empl {
	
    String name;
    int age;
    String designation;
    double salary;

    empl (String name, int age, String designation) {

        this.name = name;
        this.age = age;
        this.designation = designation;

        if (designation.equalsIgnoreCase("Programmer")) {
            salary = 20000;
        }
        else if (designation.equalsIgnoreCase("Tester")) {
            salary = 15000;
        }
        else if (designation.equalsIgnoreCase("Manager")) {
            salary = 25000;
        }
    }

    void display() {

        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
        System.out.println("---------------------------");
    }
}


public class project  {

    public static void main(String[] args) {
		
	 

        Scanner sc = new Scanner(System.in);

        ArrayList<empl > employees = new ArrayList<>();

        while (true) {

            
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {

                
                case 1:

                    while (true) {

                    	System.out.println("enter the name in alphabets");
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("\nSelect Designation:");
                        System.out.println("1. Programmer - 20000");
                        System.out.println("2. Tester     - 15000");
                        System.out.println("3. Manager    - 25000");

                        System.out.print("Enter designation choice: ");
                        int d = sc.nextInt();
                        sc.nextLine();

                        String designation;

                        if (d == 1) {
                            designation = "Programmer";
                        }
                        else if (d == 2) {
                            designation = "Tester";
                        }
                        else if (d == 3) {
                            designation = "Manager";
                        }
                        else {
                            System.out.println("Invalid designation!");
                            continue;
                        }

                        empl  emp =
                                new empl (name, age, designation);

                        employees.add(emp);

                      
                        System.out.print(
                                "Do you want to create another employee? (yes/no): "
                        );

                        String answer = sc.nextLine();

                        if (!answer.equalsIgnoreCase("yes")) {
                            break;
                        }
                    }

                    break;


             
                case 2:

                    

                    if (employees.isEmpty()) {

                        System.out.println("No employees available.");

                    }
                    else {

                        for (empl emp : employees) {
                            emp.display();
                        }
                    }

                    break;


                
                case 3:

                    if (employees.isEmpty()) {

                        System.out.println("No employees available.");
                        break;
                    }

                    System.out.println("\n RAISE SAL");

                    System.out.print("Enter employee name: ");
                    String searchName = sc.nextLine();

                    System.out.print(
                            "Enter salary raise percentage (1-10): "
                    );

                    double percentage = sc.nextDouble();
                    sc.nextLine();

                    if (percentage < 1 || percentage > 10) {

                        System.out.println(
                                "Percentage must be between 1 and 10."
                        );

                        break;
                    }

                    boolean found = false;

                    for (empl  emp : employees) {

                        if (emp.name.equalsIgnoreCase(searchName)) {

                            found = true;

                            double oldSalary = emp.salary;

                            double raise =
                                    emp.salary * percentage / 100;

                            emp.salary =
                                    emp.salary + raise;

                            System.out.println(
                                    "\nsuccess!"
                            );

                            System.out.println(
                                    "Employee Name : " + emp.name
                            );

                            System.out.println(
                                    "Old Salary    : " + oldSalary
                            );

                            System.out.println(
                                    "Raise         : " + percentage + "%"
                            );

                            System.out.println(
                                    "New Salary    : " + emp.salary
                            );

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println(
                                "boss enter the correct name."
                        );
                    }

                    break;


               
                
                case 5:

                    System.out.println(
                            " ended."
                    );

                    sc.close();
                    return;


                default:

                    System.out.println(
                            "Invalid choice! Please enter 1-4."
                    );
            }
        }
    }
}
package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {

    String name;
    int age;
    double salary;
    String designation;

    
    Employee() {
        name = "";
        age = 0;
        salary = 0;
        designation = "";
    }

    
    Employee(String name, int age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    void create(Scanner sc) {

        System.out.print("Enter the name: ");
        name = sc.nextLine().trim();

        
        boolean validAge = false;

        while (!validAge) {

            System.out.print("Enter the age (18-60): ");
            String value = sc.nextLine().trim();

            try {

                age = Integer.parseInt(value);

                if (age >= 18 && age <= 60) {
                    validAge = true;
                } else {
                    System.out.println(
                        "!!! INVALID! Age must be between 18 and 60. You entered "
                        + age + ". !!!"
                    );
                }

            } catch (Exception e) {

                System.out.println(
                    "!!! INVALID INPUT! Please enter a numeric age. !!!"
                );
            }
        }

        
        boolean validDesignation = false;

        do {

            System.out.print(
                "Enter designation (Programmer/Manager/Tester): "
            );

            String value = sc.nextLine().trim();

            if (value.equalsIgnoreCase("Programmer")) {

                designation = "Programmer";
                salary = 20000;
                validDesignation = true;

            } else if (value.equalsIgnoreCase("Manager")) {

                designation = "Manager";
                salary = 25000;
                validDesignation = true;

            } else if (value.equalsIgnoreCase("Tester")) {

                designation = "Tester";
                salary = 15000;
                validDesignation = true;

            } else {

                System.out.println(
                    "!!! INVALID DESIGNATION \"" + value
                    + "\"! Valid options are: Programmer, Manager, Tester. !!!"
                );
            }

        } while (!validDesignation);

        System.out.println("Employee created successfully!\n");
    }

    void display() {

        System.out.println("----- Employee Details -----");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
        System.out.println("-----------------------------\n");
    }

    void raiseSalaryByPercent(double percent) {

        double oldSalary = salary;

        salary = salary + (salary * percent / 100);

        double raiseAmount = salary - oldSalary;

        System.out.println(
            "\nSalary raised by " + percent + "% for " + name + "."
        );

        System.out.println("Raise amount: " + raiseAmount);

        display();
    }
}

public class homework4 {

    // DIFFERENT LOGIC FOR PERCENTAGE VALIDATION
    private static double getValidPercent(Scanner sc) {

        while (true) {

            System.out.print("Enter raise percentage (1-10): ");

            String value = sc.nextLine().trim();

            try {

                double percent = Double.parseDouble(value);

                if (!(percent >= 1 && percent <= 10)) {

                    System.out.println(
                        "!!! INVALID! Percentage must be between 1 and 10. You entered "
                        + percent + ". !!!"
                    );

                } else {

                    return percent;
                }

            } catch (Exception e) {

                System.out.println(
                    "!!! INVALID INPUT! Please enter a number. !!!"
                );
            }
        }
    }

   
    private static int getValidMenuChoice(Scanner sc) {

        int choice;

        do {

            System.out.print("Enter your choice: ");

            String value = sc.nextLine().trim();

            try {

                choice = Integer.parseInt(value);

                if (choice >= 1 && choice <= 4) {
                    return choice;
                }

                System.out.println(
                    "!!! INVALID CHOICE! Please enter a number between 1 and 4. !!!\n"
                );

            } catch (Exception e) {

                System.out.println(
                    "!!! INVALID INPUT! Please enter a number between 1 and 4. !!!\n"
                );

            }

        } while (true);
    }

    
    private static Employee findEmployeeByName(
            List<Employee> employees, String name) {

        Employee result = null;

        for (int i = 0; i < employees.size(); i++) {

            Employee current = employees.get(i);

            if (name.equalsIgnoreCase(current.name)) {
                result = current;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        int choice;

        do {

            System.out.println("========= MENU =========");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");

            choice = getValidMenuChoice(sc);

            switch (choice) {

                case 1:

                    Employee emp = new Employee();

                    emp.create(sc);

                    emp.display();

                    employees.add(emp);

                    break;

                case 2:

                    if (employees.size() == 0) {

                        System.out.println(
                            "No employee data found. Please create first.\n"
                        );

                    } else {

                        int i = 0;

                        while (i < employees.size()) {

                            employees.get(i).display();

                            i++;
                        }
                    }

                    break;

                case 3:

                    if (employees.size() == 0) {

                        System.out.println(
                            "No employee data found. Please create first.\n"
                        );

                    } else {

                        System.out.print("Enter the employee name: ");

                        String searchName = sc.nextLine().trim();

                        Employee found =
                            findEmployeeByName(employees, searchName);

                        if (found != null) {

                            double percent = getValidPercent(sc);

                            found.raiseSalaryByPercent(percent);

                        } else {

                            System.out.println(
                                "!!! NOT FOUND! No employee with the name \""
                                + searchName + "\". !!!\n"
                            );
                        }
                    }

                    break;

                case 4:

                    System.out.println(
                        "Exiting the application. Goodbye!"
                    );

                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
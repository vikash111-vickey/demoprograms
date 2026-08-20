package homework;

import java.util.Scanner;

class Employee {
    // instance variables
    String name;
    int age;
    double salary;
    String designation;

    // default constructor
    Employee() {
        name = "";
        age = 0;
        salary = 0.0;
        designation = "";
    }

    // parameterized constructor
    Employee(String name, int age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    // method to create/set employee details
    void create(Scanner sc) {
        System.out.print("Enter the name: ");
        this.name = sc.nextLine();

        this.age = getValidAge(sc);

        // designation decides the salary automatically
        this.designation = getValidDesignation(sc);
        this.salary = getSalaryForDesignation(this.designation);

        System.out.println("Employee created successfully!\n");
    }

    // helper method to validate age input (must be between 18 and 60)
    private int getValidAge(Scanner sc) {
        int inputAge;
        while (true) {
            System.out.print("Enter the age (18-60): ");
            String input = sc.nextLine().trim();

            try {
                inputAge = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("!!! Invalid input. Please enter a numeric age. !!!");
                continue;
            }

            if (inputAge < 18 || inputAge > 60) {
                System.out.println("!!! Age must be between 18 and 60. You entered " + inputAge + ". !!!");
                continue;
            }

            return inputAge;
        }
    }

    // helper method to validate designation input
    private String getValidDesignation(Scanner sc) {
        String input;
        while (true) {
            System.out.print("Enter designation (Programmer/Manager/Tester): ");
            input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("!!! Designation cannot be empty. Please choose Programmer, Manager, or Tester. !!!");
                continue;
            }

            if (input.equalsIgnoreCase("Programmer")
                    || input.equalsIgnoreCase("Manager")
                    || input.equalsIgnoreCase("Tester")) {
                // capitalize first letter for consistent display
                return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
            }

            System.out.println("!!! Invalid designation \"" + input + "\". Valid options are: Programmer, Manager, Tester. !!!");
        }
    }

    // helper method to assign salary based on designation
    private double getSalaryForDesignation(String designation) {
        switch (designation) {
            case "Programmer":
                return 20000;
            case "Manager":
                return 25000;
            case "Tester":
                return 15000;
            default:
                return 0;
        }
    }

    // method to display employee details
    void display() {
        if (name.isEmpty()) {
            System.out.println("No employee data found. Please create first.\n");
            return;
        }
        System.out.println("----- Employee Details -----");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
        System.out.println("-----------------------------\n");
    }
    void raiseSalary(Scanner sc) {
        if (name.isEmpty()) {
            System.out.println("No employee data found. Please create first.\n");
            return;
        }
        System.out.print("Enter the raise amount: ");
        double raise = Double.parseDouble(sc.nextLine());
        this.salary += raise;
        System.out.println("Salary raised successfully! New salary: " + this.salary + "\n");
    }
}

public class homework3 {

    // helper method to get a valid y/n answer from the user
    private static boolean askYesNo(Scanner sc, String question) {
        while (true) {
            System.out.print(question + " (y/n): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("y")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("!!! Please enter only 'y' or 'n'. !!!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(); // using default constructor
        int choice;

        do {
            System.out.println("========= MENU =========");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    // keep creating employees as long as the user says 'y'
                    boolean createAgain;
                    do {
                        emp.create(sc);
                        emp.display();
                        createAgain = askYesNo(sc, "Do you want to create again?");
                        System.out.println();
                    } while (createAgain);
                    break;
                case 2:
                    emp.display();
                    break;
                case 3:
                    emp.raiseSalary(sc);
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.\n");
            }
        } while (choice != 4);

        sc.close();
    }
}
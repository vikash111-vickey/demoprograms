package homework;
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        String designation = "";
        double salary = 0;

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:

                    // Create employee
                    while (true) {

                        System.out.println("\n===== CREATE TABLE =====");

                        System.out.print("Enter your name: ");
                        name = sc.nextLine();

                        System.out.print("Enter your age: ");
                        age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Select Designation:");
                        System.out.println("1. Programmer");
                        System.out.println("2. Manager");
                        System.out.println("3. Trainer");
                        System.out.print("Enter your choice: ");

                        int desChoice = sc.nextInt();
                        sc.nextLine();

                        switch (desChoice) {

                            case 1:
                                designation = "Programmer";
                                break;

                            case 2:
                                designation = "Manager";
                                break;

                            case 3:
                                designation = "Trainer";
                                break;

                            default:
                                designation = "Unknown";
                                System.out.println("Invalid designation!");
                        }

                        System.out.print("Enter salary: ");
                        salary = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("\nEmployee created successfully!");

                 
                        System.out.print("Do you want to create another employee? (Yes/No): ");
                        String answer = sc.nextLine();

                        if (answer.equalsIgnoreCase("yes") ||
                            answer.equalsIgnoreCase("y")) {

                          
                            continue;

                        } else if (answer.equalsIgnoreCase("no") ||
                                   answer.equalsIgnoreCase("n")) {

                          
                            break;

                        } else {

                            System.out.println("Invalid input! Returning to main menu.");
                            break;
                        }
                    }

                    break;

                case 2:

                    if (name.equals("")) {

                        System.out.println("No employee data found!");

                    } else {

                        System.out.println("\n==DETAILS ==");
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Designation: " + designation);
                        System.out.println("Salary: " + salary);
                    }

                    break;

                case 3:

                    if (name.equals("")) {

                        System.out.println("Please create employee first!");

                    } else {

                        System.out.print("Enter salary raise percentage: ");

                        double percentage = sc.nextDouble();

                        salary = salary + (salary * percentage / 100);

                        System.out.println("Salary raised successfully!");
                        System.out.println("New Salary: " + salary);
                    }

                    break;

                case 4:

                    System.out.println("Thank you!");

                    sc.close();

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
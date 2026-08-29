
package homework;

import java.util.ArrayList;
import java.util.Scanner;

class emplo {

    String name;
    int age;
    String designation;
    double salary;

    emplo(String name, int age, String designation) {

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


public class EMPLOYMENT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<emplo> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n========== EMPLOYEE MANAGEMENT ==========");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            String choiceInput = sc.nextLine();

          
            if (!choiceInput.matches("[0-9]+")) {

                System.out.println(
                    "Invalid input! Please enter a number."
                );

                continue;
            }

            int choice = Integer.parseInt(choiceInput);

            switch (choice) {

                
                case 1:

                    while (true) {

                        String name;

                        // Validate name
                        while (true) {

                            System.out.print("Enter Name: ");

                            name = sc.nextLine();

                            if (name.matches("[a-zA-Z ]+")) {
                                break;
                            }
                            else {
                                System.out.println(
                                    "Invalid name! Please enter alphabets only."
                                );
                            }
                        }


                        int age;

                        
                        while (true) {

                            System.out.print("Enter Age: ");

                            String ageInput = sc.nextLine();

                            if (ageInput.matches("[0-9]+")) {

                                age = Integer.parseInt(ageInput);

                                break;
                            }
                            else {

                                System.out.println(
                                    "Invalid age! Please enter numbers only."
                                );
                            }
                        }


                      
                        System.out.println("\nSelect Designation:");

                        System.out.println("1. Programmer - 20000");
                        System.out.println("2. Tester     - 15000");
                        System.out.println("3. Manager    - 25000");

                        int d;

                        while (true) {

                            System.out.print(
                                "Enter designation choice: "
                            );

                            String dInput = sc.nextLine();

                            if (!dInput.matches("[0-9]+")) {

                                System.out.println(
                                    "Invalid input! Please enter 1, 2 or 3."
                                );

                                continue;
                            }

                            d = Integer.parseInt(dInput);

                            if (d >= 1 && d <= 3) {
                                break;
                            }
                            else {

                                System.out.println(
                                    "Invalid designation! Please enter 1, 2 or 3."
                                );
                            }
                        }


                        String designation;

                        if (d == 1) {
                            designation = "Programmer";
                        }
                        else if (d == 2) {
                            designation = "Tester";
                        }
                        else {
                            designation = "Manager";
                        }


                       
                        emplo emp =
                            new emplo(name, age, designation);

                        employees.add(emp);

                        System.out.println(
                            "\nEmployee created successfully!"
                        );


                        
                        String answer;

                        while (true) {

                            System.out.print(
                                "Do you want to create another employee? (yes/no): "
                            );

                            answer = sc.nextLine();

                            if (answer.equalsIgnoreCase("yes") ||
                                answer.equalsIgnoreCase("no")) {

                                break;
                            }
                            else {

                                System.out.println(
                                    "Invalid input! Please enter yes or no."
                                );
                            }
                        }


                        if (answer.equalsIgnoreCase("no")) {
                            break;
                        }
                    }

                    break;


               
                case 2:

                    if (employees.isEmpty()) {

                        System.out.println(
                            "No employees available."
                        );
                    }
                    else {

                        System.out.println(
                            "\n========== EMPLOYEE DETAILS =========="
                        );

                      
                        for (emplo emp : employees) {

                            emp.display();
                        }
                    }

                    break;


              
                case 3:

                    if (employees.isEmpty()) {

                        System.out.println(
                            "No employees available."
                        );

                        break;
                    }


                    System.out.println(
                        "\n========== RAISE SALARY =========="
                    );


                    emplo selectedEmployee = null;


                    // Search employee
                    while (selectedEmployee == null) {

                        String searchName;

                        while (true) {

                            System.out.print(
                                "Enter employee name: "
                            );

                            searchName = sc.nextLine();

                            if (searchName.matches("[a-zA-Z ]+")) {
                                break;
                            }
                            else {

                                System.out.println(
                                    "Invalid name! Please enter alphabets only."
                                );
                            }
                        }


                        for (emplo emp : employees) {

                            if (emp.name.equalsIgnoreCase(searchName)) {

                                selectedEmployee = emp;

                                break;
                            }
                        }


                        if (selectedEmployee == null) {

                            System.out.println(
                                "Invalid name! Please enter a valid employee name."
                            );
                        }
                    }


                    // Salary percentage
                    double percentage;

                    while (true) {

                        System.out.print(
                            "Enter salary raise percentage (1-10): "
                        );

                        String percentageInput =
                            sc.nextLine();


                        if (!percentageInput.matches(
                            "[0-9]+(\\.[0-9]+)?")) {

                            System.out.println(
                                "Invalid input! Please enter numbers only."
                            );

                            continue;
                        }


                        percentage =
                            Double.parseDouble(percentageInput);


                        if (percentage >= 1 &&
                            percentage <= 10) {

                            break;
                        }
                        else {

                            System.out.println(
                                "Percentage must be between 1 and 10."
                            );
                        }
                    }


                    
                    double oldSalary =
                        selectedEmployee.salary;

                    double raise =
                        selectedEmployee.salary *
                        percentage / 100;

                    selectedEmployee.salary =
                        selectedEmployee.salary + raise;


                    System.out.println(
                        "\nSalary raised successfully!"
                    );

                    System.out.println(
                        "Employee Name : " +
                        selectedEmployee.name
                    );

                    System.out.println(
                        "Old Salary    : " +
                        oldSalary
                    );

                    System.out.println(
                        "Raise         : " +
                        percentage + "%"
                    );

                    System.out.println(
                        "New Salary    : " +
                        selectedEmployee.salary
                    );

                    break;


              
                case 5:

                    System.out.println(
                        "\nThank you for using our application."
                    );

                    sc.close();

                    return;


               
                default:

                    System.out.println(
                        "Invalid choice! Please enter 1, 2, 3 or 5."
                    );
            }
        }
    }
}


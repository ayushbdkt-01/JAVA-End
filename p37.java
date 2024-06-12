// Write a java program to accept and print the employee details during runtime.
// The details will include employee id, name, dept_ Id. The program should
// raise an exception if user inputs incomplete or incorrect data. The entered
// value should meet the following conditions:
// a. First Letter of employee name should be in capital letter.
// b. Employee id should be between 2001 and 5001
// c. Department id should be an integer between 1 and 5.
// If the above conditions are not met, then the application should raise specific
// exception else should complete normal execution






import java.util.Scanner;

// Custom exception for invalid employee name
class InvalidEmployeeNameException extends Exception {
    public InvalidEmployeeNameException(String message) {
        super(message);
    }
}

// Custom exception for invalid employee ID
class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException(String message) {
        super(message);
    }
}

// Custom exception for invalid department ID
class InvalidDeptIDException extends Exception {
    public InvalidDeptIDException(String message) {
        super(message);
    }
}

// Employee class to store employee details
class Employee {
    private int id;
    private String name;
    private int deptId;

    public Employee(int id, String name, int deptId) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department ID: " + deptId);
    }
}

// Main class to test the implementation
public class p37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept employee ID
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            if (id < 2001 || id > 5001) {
                throw new InvalidEmployeeIDException("Employee ID should be between 2001 and 5001.");
            }

            // Accept employee name
            System.out.print("Enter Employee Name: ");
            scanner.nextLine();  // Consume the newline left-over
            String name = scanner.nextLine();
            if (!Character.isUpperCase(name.charAt(0))) {
                throw new InvalidEmployeeNameException("First letter of employee name should be in capital letter.");
            }

            // Accept department ID
            System.out.print("Enter Department ID: ");
            int deptId = scanner.nextInt();
            if (deptId < 1 || deptId > 5) {
                throw new InvalidDeptIDException("Department ID should be an integer between 1 and 5.");
            }

            // Create Employee object and display details
            Employee employee = new Employee(id, name, deptId);
            employee.displayDetails();

        } catch (InvalidEmployeeNameException | InvalidEmployeeIDException | InvalidDeptIDException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Incomplete or incorrect data entered.");
        } finally {
            scanner.close();
        }
    }
}

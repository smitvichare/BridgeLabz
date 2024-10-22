package mapCollections;


import java.util.HashMap;
import java.util.Scanner;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + dept;
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        HashMap<String, Employee> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding employee records
        employeeMap.put("101", new Employee("Alice", "HR"));
        employeeMap.put("102", new Employee("Bob", "Engineering"));
        employeeMap.put("103", new Employee("Charlie", "Marketing"));

        // Searching for employee by ID
        System.out.print("Enter employee ID to search: ");
        String id = scanner.nextLine();

        Employee emp = employeeMap.get(id);
        if (emp != null) {
            System.out.println("Employee found: " + emp);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }

        scanner.close();
    }
}

package applicattion;

import entities.Employee;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberOfEmployee = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.printf("Employee #%d:%n", i + 1);

            System.out.print("Id: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        Employee employee = findEmployeeById(sc, employeeList);

        if (employee == null){
            System.out.println("List of employees: ");
            for (Employee employees : employeeList) {
                System.out.println(employees);
            }
            System.exit(0);
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.raiseSalary(percentage);
        }

        System.out.println("List of employees: ");
        for (Employee employees : employeeList) {
            System.out.println(employees);
        }
    }

    public static Employee findEmployeeById(Scanner sc, ArrayList<Employee> employeeList) {

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        String employeeId = sc.nextLine();

        for (Employee employee : employeeList) {
            if (employee.getId().equals(employeeId)) {
                return employee;
            }
        }
        System.out.println("This id does not exist!");
        System.out.println();
        return null;
    }

}

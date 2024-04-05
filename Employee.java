import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "John Doe", "Manager", 50000.0));
        employees.add(new Employee(2, "Alice Smith", "Developer", 60000.0));
        employees.add(new Employee(3, "Bob Johnson", "Designer", 55000.0));
        employees.add(new Employee(4, "Jane Brown", "Analyst", 52000.0));

        // Sort by name
        employees.sort(Comparator.comparing(Employee::getName));

        System.out.println("Sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sort by salary
        employees.sort(Comparator.comparing(Employee::getSalary));

        System.out.println("\nSorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

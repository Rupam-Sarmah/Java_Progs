import java.util.*;

// Employee class implementing Comparable interface
class Employee implements Comparable<Employee> {
    private int id;
    private double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Implementing compareTo method
    @Override
    public int compareTo(Employee other) {
    	//Ascending logic
        return Double.compare(this.salary, other.salary);
        // Reverse the comparison result for descending order
        //  return Double.compare(other.salary, this.salary);
    }

    // toString method for printing employee details
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Salary: " + salary;
    }
}

public class EmployeeComparable {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Adding employee objects to the list
        employeeList.add(new Employee(101, 50000));
        employeeList.add(new Employee(102, 60000));
        employeeList.add(new Employee(103, 45000));
        employeeList.add(new Employee(104, 70000));

        // Sorting the list based on salary using Collections.sort() method
        Collections.sort(employeeList);

        // Printing the sorted list
        System.out.println("Sorted Employee List based on Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

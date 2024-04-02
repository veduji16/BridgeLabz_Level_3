class Employee {
    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

public class Swap_Employee {
    public static void swap(Employee emp1, Employee emp2) {
        String tempName = emp1.name;
        int tempId = emp1.empId;

        emp1.name = emp2.name;
        emp1.empId = emp2.empId;

        emp2.name = tempName;
        emp2.empId = tempId;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 1);
        Employee emp2 = new Employee("Alice", 2);

        System.out.println("Before Swapping: ");
        emp1.display();
        emp2.display();

        swap(emp1, emp2);

        System.out.println("\nAfter swapping: ");
        emp1.display();
        emp2.display();
    }
}
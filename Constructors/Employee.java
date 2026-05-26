class Employee {

    String name;
    int id;
    double salary;

    // Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Copy Constructor
    Employee(Employee emp) {
        this.name = emp.name;
        this.id = emp.id;
        this.salary = emp.salary;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        // Original Object
        Employee e1 = new Employee("Amit", 101, 50000);

        // Copied Object
        Employee e2 = new Employee(e1);

        System.out.println("Original Employee:");
        e1.show();

        System.out.println("Copied Employee:");
        e2.show();

        // Modify copied object
        e2.salary = 60000;

        System.out.println("After Modifying Copied Employee Salary");

        System.out.println("\nOriginal Employee:");
        e1.show();

        System.out.println("Copied Employee:");
        e2.show();
    }
}

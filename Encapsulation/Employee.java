class Employee {

    // Read Only
    private int empId;

    // Write Only
    private String password;

    // Normal Field
    private String name;

    // Constructor
    Employee(int empId, String name, String password) {

        this.empId = empId;
        this.name = name;
        this.password = password;
    }

    // Read Only
    public int getEmpId() {
        return empId;
    }

    // Write Only
    public void setPassword(String password) {
        this.password = password;
    }

    // Normal Getter
    public String getName() {
        return name;
    }

    // Normal Setter
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Employee emp = new Employee(
                101,
                "Ratnesh",
                "abc123"
        );

        System.out.println("Employee ID: " + emp.getEmpId());

        System.out.println("Name: " + emp.getName());

        emp.setName("Rahul");

        System.out.println("Updated Name: " + emp.getName());

        emp.setPassword("newPassword123");

        System.out.println("Password Updated Successfully");
    }
}

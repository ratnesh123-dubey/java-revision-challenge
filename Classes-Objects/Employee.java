public class Employee {
    
    String name;
    int salary;

    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args){

        Employee e1 = new Employee("Rahul", 30000);
        Employee e2 = new Employee("Aman", 45000);

        e1.display();
        e2.display();
    }
}

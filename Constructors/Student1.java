public class Student1 {
    
    String name;
    int rollNo;
    int marks;

    Student1(String name, int rollNo, int marks){
          this.name = name;
          this.rollNo = rollNo;
          this.marks = marks;
    }

    void showDetails(){
    System.out.println("Name: " + name);
    System.out.println("RollNo: " + rollNo);
    System.out.println("Marks: " + marks);
    }

    public static void main(String[] args){

        Student1 s1 = new Student1("Rahul", 101, 88);
        Student1 s2 = new Student1("Ratnesh", 102, 89);
        s1.showDetails();
        s2.showDetails();
        
    }
}

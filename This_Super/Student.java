public class Student {
    
String name;
int age;

Student(){
this("Ratnesh", 20);
System.out.println("Default Constructor called");
}

Student(String name, int age){
this.name = name;
this.age = age;
System.out.println("Parameterized Constructor Called");
}

public static void main(String[] args){

Student s1 = new Student();

}

}

public class Student {
    
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){
  
    Student s = new Student();
    s.setName("Ratnesh");
    s.setAge(20);
    s.display();

}

}

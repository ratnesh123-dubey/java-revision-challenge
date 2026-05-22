class Student{
        
        String name;
        int age;
        
        Student(String name, int age){
                this.name=name;
                this.age=age;
        }
        
        void display(){
                System.out.println("Name: "  + name);
                System.out.println("Age: " + age);
                System.out.println();
        }

	public static void main(String[] args) {
		
		Student s1 = new Student("Ratnesh", 25);
		Student s2 = new Student("Amit", 22);
		
		s1.display();
		s2.display();
		
	}
}

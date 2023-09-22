class Student {
    String name;
    int rollno;
    String dept;
    int age;

    // Constructor with no parameters
    Student() {
        name = "Unknown";
        age = 0;
        rollno=0;
        dept="Unknown";
    }

    // Constructor with name parameter
    Student(String studentName) {
        this.name = studentName;
        this.rollno=0;
        this.age = 0;
        this.dept="NULL";
        
    }

    // Constructor with parameters
    Student(String studentName, int st_rollno) {
        this.name = studentName;
        this.rollno = st_rollno;
    }
    
    Student(String studentName, int st_rollno, int age) {
        this.name = studentName;
        this.rollno = st_rollno;
        this.age=age;
    }
    
    Student(String studentName, int st_rollno, int age, String st_dept) {
        this.name = studentName;
        this.rollno = st_rollno;
        this.age=age;
        this.dept=st_dept;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Age: " + age);
        System.out.println("Dept: " + dept);
    }
}

public class constructor_overlaoding {
	public static void main(String[] args) {
		Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob", 20);
        Student student4 = new Student("Peter", 10121,18);
        Student student5 = new Student("Harry", 21213,21,"CS");
        Student student6 = new Student("Alex", 32121,21,"IT");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();
        student6.displayInfo();
	}

}

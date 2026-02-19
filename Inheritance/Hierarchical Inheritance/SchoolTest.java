class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println(name + " is a Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println(name + " is Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {

        Teacher t = new Teacher("Riya", 30, "Math");
        Student s = new Student("Aman", 18, "12th");
        Staff st = new Staff("Raj", 40, "Office");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}

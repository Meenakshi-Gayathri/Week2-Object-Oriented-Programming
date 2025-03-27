import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name,age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		System.out.println("Subject: "+subject);
	}
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name,age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		System.out.println("Grade: "+grade);
	}
}

class Staff extends Person {
    int count;

    public Staff(String name,int age,int count) {
        super(name,age);
        this.count = count;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		System.out.println("Count: "+count);
	}
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Rose", 34, "Math");
        Student s = new Student("Jas", 25, "A");
        Staff st = new Staff("Ben", 30, 10);

        System.out.println("\nDifferent roles Details:");
        t.displayRole();
        System.out.println();
        s.displayRole();
        System.out.println();
        st.displayRole();
    }
}
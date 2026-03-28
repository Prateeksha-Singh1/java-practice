class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int marks;

    Student(String name, int marks) {
        super(name);  // calling parent constructor
        this.marks = marks;
        System.out.println("Student constructor called");
    }

    void display() {
        super.display();  // calling parent method
        System.out.println("Marks: " + marks);
    }
}

public class PersonInfo {
    public static void main(String[] args) {
        Student s = new Student("Prateeksha", 90);
        s.display();
    }
}
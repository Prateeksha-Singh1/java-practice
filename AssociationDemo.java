class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    Teacher teacher; // Association

    Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    void display() {
        System.out.println(name + " studies with " + teacher.name);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma");
        Student s = new Student("Prateeksha", t);

        s.display();
    }
} 
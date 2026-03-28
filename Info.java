class Student {
    String name;
    static String college = "ABC College";  // shared by all

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class Info {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        s1.display();
        s2.display();
    }
}
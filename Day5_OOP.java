class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Day5_OOP {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Prateeksha";
        s1.age = 20;

        s1.display();
    }
}
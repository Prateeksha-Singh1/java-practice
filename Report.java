import java.util.Scanner;

class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Report {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, marks);
        }

        // Output
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
            System.out.println("------");
        }
    }
}
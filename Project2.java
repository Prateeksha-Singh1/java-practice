import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String name;
    private int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters
    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }

    // Setter
    void setMarks(int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    list.add(new Student(name, marks));
                    System.out.println("Student added!");
                    break;

                case 2:
                    for (Student s : list) {
                        s.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;
                    for (Student s : list) {
                        if (s.getName().equalsIgnoreCase(search)) {
                            s.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to update: ");
                    String update = sc.nextLine();

                    for (Student s : list) {
                        if (s.getName().equalsIgnoreCase(update)) {
                            System.out.print("Enter new marks: ");
                            int newMarks = sc.nextInt();
                            s.setMarks(newMarks);
                            System.out.println("Updated!");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter name to delete: ");
                    String delete = sc.nextLine();

                    list.removeIf(s -> s.getName().equalsIgnoreCase(delete));
                    System.out.println("Deleted if existed!");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}
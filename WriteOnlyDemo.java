class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name is set");
    }
}

public class WriteOnlyDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Prateeksha");
        s.display();
    }
}
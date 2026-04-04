class Student {
    private String name = "Prateeksha";

    public String getName() {
        return name;
    }
}

public class ReadOnlyDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
    }
}
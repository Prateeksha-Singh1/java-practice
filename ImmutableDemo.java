final class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableDemo {
    public static void main(String[] args) {
        Student s = new Student("Prateeksha");
        System.out.println(s.getName());
    }
}
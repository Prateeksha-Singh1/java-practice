class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ReadWriteDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(21);
        System.out.println(s.getAge());
    }
}
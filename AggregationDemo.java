class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    Teacher teacher; // Aggregation

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

    void show() {
        System.out.println(deptName + " Department has " + teacher.name);
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Singh");
        Department d = new Department("CSE", t);

        d.show();
    }
}
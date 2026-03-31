interface Worker {
    void work();
}

interface Student {
    void study();
}

class Person implements Worker, Student {

    public void work() {
        System.out.println("Person is working");
    }

    public void study() {
        System.out.println("Person is studying");
    }
}

public class HybridBehavior {
    public static void main(String[] args) {
        Person p = new Person();
        p.work();
        p.study();
    }
}
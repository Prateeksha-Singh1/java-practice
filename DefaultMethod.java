interface A {
    default void show() {
        System.out.println("A show");
    }
}

interface B {
    default void show() {
        System.out.println("B show");
    }
}

class Test implements A, B {

    public void show() {
        // Resolving conflict
        A.super.show();
        B.super.show();
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();
    }
}
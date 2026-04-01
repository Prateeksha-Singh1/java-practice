interface A {
    void show();
}

interface B {
    void show();
}

public class LambdaTrick {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Hello");
        obj.show();
    }
}
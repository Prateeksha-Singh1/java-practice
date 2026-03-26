class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {

        MathOperations m = new MathOperations();

        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
    }
}
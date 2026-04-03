interface A {
    void showA();
}

interface B {
    void showB();
}

class C {
    void showC() {
        System.out.println("Class C method");
    }
}

class D extends C implements A, B {

    public void showA() {
        System.out.println("Interface A method");
    }

    public void showB() {
        System.out.println("Interface B method");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
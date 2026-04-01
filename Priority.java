class A {
    public void show() {
        System.out.println("Class A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

class Priority extends A implements B {
    public static void main(String[] args) {
        new Priority().show();
    }
}
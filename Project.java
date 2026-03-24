import java.util.Scanner;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if(b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Result: " + calc.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + calc.sub(a, b));
                break;
            case 3:
                System.out.println("Result: " + calc.mul(a, b));
                break;
            case 4:
                System.out.println("Result: " + calc.div(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
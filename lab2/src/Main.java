import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ex 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cerinta: ");
        int cerinta = scanner.nextInt();
        if (cerinta == 1) {
            for (int i = 1; i <= 99; i++) {
                if (i % 3 == 0)
                    System.out.println(i);
            }
        }
        if (cerinta == 2) {
            System.out.println("Introduceti primul numar: ");
            int num1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int num2 = scanner.nextInt();
            System.out.println("Introduceti al treilea numar: ");
            int num3 = scanner.nextInt();
            if (num1 < num2 && num2 < num3) {
                System.out.println(num1 + " < " + num2 + " < " + num3);
            } else if (num1 < num3 && num3 < num2) {
                System.out.println(num1 + " < " + num3 + " < " + num2);
            } else if (num2 < num1 && num1 < num3) {
                System.out.println(num2 + " < " + num1 + " < " + num3);
            } else if (num2 < num3 && num3 < num1) {
                System.out.println(num2 + " < " + num3 + " < " + num1);
            } else if (num3 < num1 && num1 < num2) {
                System.out.println(num3 + " < " + num1 + " < " + num2);
            } else if (num3 < num2 && num2 < num1) {
                System.out.println(num3 + " < " + num2 + " < " + num1);
            }
        }
        if (cerinta == 3) {
            System.out.print("Introduceti pozitia N in secventa Fibonacci: ");
            int n = scanner.nextInt();

            int result = fibonacci(n);
            System.out.println("Elementul de pe pozitia " + n + " in secventa Fibonacci este: " + result);
        }
}
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}

import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        if (n == a || n == b) {
            return true;
        }

        int c = a + b;

        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
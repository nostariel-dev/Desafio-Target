
import java.util.Scanner;

public class VerificadorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        String inputLower = input.toLowerCase();

        int count = 0;
        
        for (int i = 0; i < inputLower.length(); i++) {
            if (inputLower.charAt(i) == 'a') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' é repetida " + count + " vezes no texto.");
        } else {
            System.out.println("A letra 'a' não está presente no texto.");
        }

        scanner.close();
    }
}


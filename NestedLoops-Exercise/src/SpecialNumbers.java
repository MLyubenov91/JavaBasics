import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String currentNumber = String.valueOf(i);
            int count = 0;
            boolean isMagic = false;
            for (int j = 0; j < currentNumber.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNumber.charAt(j)));


                if (currentDigit == 0) {
                    continue;
                }

                if (n % currentDigit == 0) {
                    count++;
                }

                if (count == 4) {
                    isMagic = true;
                }
            }

            if (isMagic) {
                System.out.print(i + " ");
            }
        }
    }
}

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}

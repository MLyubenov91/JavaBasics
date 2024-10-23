import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);
            int count = 0;

            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            } else if (currentNumber <= 1) {
                nonPrimeNumbersSum += currentNumber;
            }

            for (int i = 2; i <= currentNumber / 2; i++) {
                if (currentNumber % i == 0) {
                    count++;
                }
            }

            if (count > 0) {
                nonPrimeNumbersSum += currentNumber;
            } else {
                primeNumbersSum += currentNumber;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbersSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumbersSum);
    }
}

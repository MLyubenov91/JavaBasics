import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            int currentNumber = Integer.parseInt(command);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

            command = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}

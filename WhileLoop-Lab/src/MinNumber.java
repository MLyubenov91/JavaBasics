import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            int currentNumber = Integer.parseInt(command);
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

            command = scanner.nextLine();
        }

        System.out.println(minNumber);
    }
}

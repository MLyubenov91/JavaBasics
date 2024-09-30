import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;

        if (num2 == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", num1);
            return;
        }

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = (double) num1 / num2;
            case "%" -> result = num1 % num2;
        }

        String type = result % 2 == 0 ? "even" : "odd";

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, type);
        } else if (operator.equals("/")) {
            System.out.printf("%s / %s = %.2f", num1, num2, result);
        } else if (operator.equals("%")) {
            System.out.printf("%s %% %s = %.0f", num1, num2, result);
        }
    }
}

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                input = scanner.nextLine();
                totalSteps += Integer.parseInt(input);
                break;
            }
            totalSteps += Integer.parseInt(input);
        }

        int stepsDifference = Math.abs(totalSteps - 10000);
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsDifference);
        } else {
            System.out.printf("%d more steps to reach goal.", stepsDifference);
        }
    }
}

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 1; i <= n * 2; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i <= n) {
                rightSum += num;
            } else {
                leftSum += num;
            }
        }

        if (rightSum == leftSum) {
            System.out.println("Yes, sum = " + rightSum);
        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.println("No, diff = " + diff);
        }
    }
}

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCounter = 0;
        //int magicCombination = 0;
        boolean isFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                //int currentCombination = i + j;
                combinationCounter++;

                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, i, j, magicNumber);
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);
        }
    }
}

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int firstDigitFirstNum = firstNumber / 1000;
        int secondDigitFirstNum = firstNumber / 100 % 10;
        int thirdDigitFirstNum = firstNumber / 10 % 10;
        int forthDigitFirstNum = firstNumber % 10;

        int firstDigitSecondNum = secondNumber / 1000;
        int secondDigitSecondNum = secondNumber / 100 % 10;
        int thirdDigitSecondNum = secondNumber / 10 % 10;
        int forthDigitSecondNum = secondNumber % 10;

        for (int i = firstDigitFirstNum; i <= firstDigitSecondNum; i++) {
            if (i % 2 == 0) {
                continue;
            }

            for (int j = secondDigitFirstNum; j <= secondDigitSecondNum; j++) {
                if (j % 2 == 0) {
                    continue;
                }

                for (int k = thirdDigitFirstNum; k <= thirdDigitSecondNum; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }

                    for (int l = forthDigitFirstNum; l <= forthDigitSecondNum; l++) {
                        if (l % 2 == 0) {
                            continue;
                        }

                        System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}

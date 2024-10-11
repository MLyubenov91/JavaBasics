import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());

        int coinCounter = 0;
        int amountInStotinki = (int) (amount * 100);

        int currentStotinkiCoin = 200;

        while (currentStotinkiCoin != 0) {
            coinCounter += amountInStotinki / currentStotinkiCoin;
            amountInStotinki %= currentStotinkiCoin;
            switch (currentStotinkiCoin) {
                case 200: currentStotinkiCoin = 100; break;
                case 100: currentStotinkiCoin = 50; break;
                case 50: currentStotinkiCoin = 20; break;
                case 20: currentStotinkiCoin = 10; break;
                case 10: currentStotinkiCoin = 5; break;
                case 5: currentStotinkiCoin = 2; break;
                case 2: currentStotinkiCoin = 1; break;
                case 1: currentStotinkiCoin = 0; break;

            }
        }
        System.out.println(coinCounter);
    }
}

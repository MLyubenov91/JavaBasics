import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        double money = 0;
        int evenBirthdayCounter = 1;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0) {
                money += 10 * evenBirthdayCounter;
                evenBirthdayCounter++;
            } else {
                toys++;
            }
        }

        money -= evenBirthdayCounter - 1;
        money += toys * toyPrice;

        if (money >= washingMachinePrice) {
            double remainingMoney = money - washingMachinePrice;
            System.out.printf("Yes! %.2f", remainingMoney);
        } else {
            double neededMoney = Math.abs(money - washingMachinePrice);
            System.out.printf("No! %.2f", neededMoney);
        }
    }
}

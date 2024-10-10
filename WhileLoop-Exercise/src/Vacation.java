import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int spendDaysCounter = 0;
        int totalDaysCounter = 0;

        while (availableMoney < neededMoney && spendDaysCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            totalDaysCounter++;

            if (command.equals("save")) {
                availableMoney += money;
                spendDaysCounter = 0;
            } else if (command.equals("spend")) {
                availableMoney -= money;
                spendDaysCounter++;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }
        }

        if (spendDaysCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(totalDaysCounter);
        }

        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", totalDaysCounter);
        }

    }
}

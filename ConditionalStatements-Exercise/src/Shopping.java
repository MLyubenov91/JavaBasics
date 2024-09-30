import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videocardPrice = 250;
        double processorPrice = (videocards * videocardPrice) * 0.35;
        double ramPrice = (videocards * videocardPrice) * 0.10;

        double totalCost = (videocards * videocardPrice) + (processors * processorPrice) + (ram * ramPrice);

        if (videocards > processors) {
            totalCost *= 0.85;
        }

        if (budget >= totalCost ) {
            double leftOverMoney = budget - totalCost;
            System.out.printf("You have %.2f leva left!", leftOverMoney);
        } else {
            double neededMoney = Math.abs(budget - totalCost);
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
        }
    }
}

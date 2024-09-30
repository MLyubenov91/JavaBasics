import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());

        double shoes = annualTax * 0.6;
        double clothes = shoes * 0.8;
        double ball = clothes * 0.25;
        double accessories = ball * 0.20;

        double totalAmount = annualTax + shoes + clothes + ball + accessories;

        System.out.println(totalAmount);
    }
}

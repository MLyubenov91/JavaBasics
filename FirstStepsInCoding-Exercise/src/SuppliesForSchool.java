import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

        double totalAmount = pens * 5.80 + markers * 7.20 + cleaningAgent * 1.20;
        double finalAmount = totalAmount * ((double) (100 - discountPercentage) / 100);

        System.out.println(finalAmount);
    }
}

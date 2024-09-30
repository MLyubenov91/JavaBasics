import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double materialsAmount = (nylon + 2) * 1.50 + (paint + paint * 0.10) * 14.50 + thinner * 5.00 + 0.40;
        double workAmount = (materialsAmount * 0.30) * hours;

        double totalPrice = materialsAmount + workAmount;

        System.out.println(totalPrice);
    }
}

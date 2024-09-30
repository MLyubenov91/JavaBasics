import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double totalPrice = 0;
        int nights = days - 1;

        switch (typeRoom) {
            case "room for one person" -> totalPrice = nights * 18.00;
            case "apartment" -> {
                totalPrice = nights * 25.00;
                if (days < 10) {
                    totalPrice *= 0.70;
                } else if (days <= 15) {
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.50;
                }
            }
            case "president apartment" -> {
                totalPrice = nights * 35.00;
                if (days < 10) {
                    totalPrice *= 0.90;
                } else if (days <= 15) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.80;
                }
            }
        }

        switch (rating) {
            case "positive" -> totalPrice *= 1.25;
            case "negative" -> totalPrice *= 0.90;
        }

        System.out.printf("%.2f", totalPrice);
    }
}

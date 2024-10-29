import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0;

        switch (destination) {
            case "Dubai" -> {
                switch (season) {
                    case "Winter" -> finalPrice = days * 45000;
                    case "Summer" -> finalPrice = days * 40000;
                }

                finalPrice *= 0.70;
            }
            case "Sofia" -> {
                switch (season) {
                    case "Winter" -> finalPrice = days * 17000;
                    case "Summer" -> finalPrice = days * 12500;
                }

                finalPrice *= 1.25;
            }
            case "London" -> {
                switch (season) {
                    case "Winter" -> finalPrice = days * 24000;
                    case "Summer" -> finalPrice = days * 20250;
                }
            }

        }

        double diff = Math.abs(budget - finalPrice);

        if (budget >= finalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May", "October" -> {
                studioPrice = nights * 50;
                apartmentPrice = nights * 65;

                if (nights > 7 && nights <= 14) {
                    studioPrice *= 0.95;
                };
                if (nights > 14) {
                    studioPrice *= 0.70;
                }
            }
            case "June", "September" -> {
                studioPrice = nights * 75.20;
                apartmentPrice = nights * 68.70;

                if (nights > 14) {
                    studioPrice *= 0.80;
                }
            }
            case "July", "August" -> {
                studioPrice = nights * 76;
                apartmentPrice = nights * 77;
            }
        }

        if (nights > 14) {
            apartmentPrice *= 0.90;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", studioPrice);
    }
}

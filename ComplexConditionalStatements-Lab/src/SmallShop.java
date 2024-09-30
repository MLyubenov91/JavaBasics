import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee" -> System.out.println(quantity * 0.50);
                case "water" -> System.out.println(quantity * 0.80);
                case "beer" -> System.out.println(quantity * 1.20);
                case "sweets" -> System.out.println(quantity * 1.45);
                case "peanuts" -> System.out.println(quantity * 1.60);
            }
        }

        if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee" -> System.out.println(quantity * 0.40);
                case "water" -> System.out.println(quantity * 0.70);
                case "beer" -> System.out.println(quantity * 1.15);
                case "sweets" -> System.out.println(quantity * 1.30);
                case "peanuts" -> System.out.println(quantity * 1.50);
            }
        }

        if (city.equals("Varna")) {
            switch (product) {
                case "coffee" -> System.out.println(quantity * 0.45);
                case "water" -> System.out.println(quantity * 0.70);
                case "beer" -> System.out.println(quantity * 1.10);
                case "sweets" -> System.out.println(quantity * 1.35);
                case "peanuts" -> System.out.println(quantity * 1.55);
            }
        }
    }
}

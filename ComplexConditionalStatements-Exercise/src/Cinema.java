import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * columns;
        double totalIncome = 0;

        switch (projectionType) {
            case "Premiere" -> totalIncome = totalSeats * 12.00;
            case "Normal" -> totalIncome = totalSeats * 7.50;
            case "Discount" -> totalIncome = totalSeats * 5.00;
        }

        System.out.printf("%.2f", totalIncome);
    }
}

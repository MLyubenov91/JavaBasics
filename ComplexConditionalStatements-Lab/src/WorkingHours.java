import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" -> System.out.println("open");
                case "Sunday" -> System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}

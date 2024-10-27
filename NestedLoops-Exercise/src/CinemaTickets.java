import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        String movie = scanner.nextLine();
        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int capacity = freeSeats;
            int movieTickets = 0;

            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student" -> studentTickets++;
                    case "kid" -> kidsTickets++;
                    case "standard" -> standardTickets++;
                }
                totalTickets++;
                movieTickets++;
                freeSeats--;

                if (freeSeats == 0) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, ((double)movieTickets/capacity) * 100.0);
            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", ((double) studentTickets / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n",((double) standardTickets / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", ((double) kidsTickets / totalTickets) * 100);
    }
}

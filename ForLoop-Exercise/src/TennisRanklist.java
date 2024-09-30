import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int wonTournirCounter = 0;
        int wonPoints = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W" -> {
                    wonPoints += 2000;
                    wonTournirCounter++;
                }
                case "F" -> wonPoints += 1200;
                case "SF" -> wonPoints += 720;
            }
        }

        int totalPoints = startingPoints + wonPoints;
        double averagePoints = Math.floor((double) wonPoints / tournamentsCount);
        double wonTournaments = (((double) wonTournirCounter / tournamentsCount) * 100);

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", wonTournaments);
    }
}

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timePerMeterInSeconds = Double.parseDouble(scanner.nextLine());

        double totalTime = distanceInMetres * timePerMeterInSeconds;
        double delay = Math.floor(distanceInMetres / 15) * 12.5;
        double finalResult = totalTime + delay;

        if (finalResult < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else {
            double neededSeconds = Math.abs(recordInSeconds - finalResult);
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSeconds);
        }
    }
}

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesTitle = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int lunchBreakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = (double) lunchBreakDuration / 8;
        double restTime = (double) lunchBreakDuration / 4;
        double remainingLunchBreakTime = lunchBreakDuration - lunchTime - restTime;

        if (remainingLunchBreakTime >= episodeDuration) {
            double remainingFreeTime = Math.ceil(remainingLunchBreakTime - episodeDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesTitle, remainingFreeTime);
        } else {
            double remainingFreeTime = Math.floor(remainingLunchBreakTime - episodeDuration);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesTitle, Math.abs(remainingFreeTime));
        }
    }
}

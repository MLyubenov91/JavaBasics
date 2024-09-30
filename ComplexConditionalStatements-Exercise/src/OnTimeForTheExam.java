import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examTimeH = Integer.parseInt(scanner.nextLine());
        int examTimeM = Integer.parseInt(scanner.nextLine());
        int arriveTimeH = Integer.parseInt(scanner.nextLine());
        int arriveTimeM = Integer.parseInt(scanner.nextLine());

        int timeOfExam = examTimeH * 60 + examTimeM;
        int timeOfArrival = arriveTimeH * 60 + arriveTimeM;
        int difference = timeOfExam - timeOfArrival;

        String status = "";
        String comparison = "";

        if (difference >=0 && difference <= 30) {
            status = "On time";
            comparison = "before";
        } else if (difference < 0) {
            status = "Late";
            comparison = "after";
            difference = -difference;
        } else {
            status = "Early";
            comparison = "before";
        }

        int compH = difference / 60;
        int compM = difference % 60;
        System.out.println(status);
        if (compH > 0) {
            System.out.printf("%d:%02d hours %s the start", compH, compM, comparison);
        } else if (compM > 0) {
            System.out.printf("%d minutes %s the start", compM, comparison);
        }
    }
}

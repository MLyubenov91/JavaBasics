import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int peopleCount = 0;

        int musala = 0;
        int montblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people < 6) {
                musala += people;
            } else if (people < 13) {
                montblan += people;
            } else if (people < 26) {
                kilimandjaro += people;
            } else if (people < 41) {
                k2 += people;
            } else {
                everest += people;
            }

            peopleCount += people;
        }

        System.out.printf("%.2f%%%n", (double) musala / peopleCount * 100);
        System.out.printf("%.2f%%%n", (double) montblan / peopleCount * 100);
        System.out.printf("%.2f%%%n", (double) kilimandjaro / peopleCount * 100);
        System.out.printf("%.2f%%%n", (double) k2 / peopleCount * 100);
        System.out.printf("%.2f%%%n", (double) everest / peopleCount * 100);
    }
}

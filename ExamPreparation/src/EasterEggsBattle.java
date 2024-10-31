import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "one" -> eggsSecondPlayer -= 1;
                case "two" -> eggsFirstPlayer -= 1;
            }

            if (eggsFirstPlayer == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecondPlayer);
                break;
            } else if (eggsSecondPlayer == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirstPlayer);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.printf("Player one has %d eggs left.%n", eggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.", eggsSecondPlayer);
        }

    }
}

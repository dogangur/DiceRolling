import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Number of Rounds: ");
        int rounds = scanner.nextInt();

        System.out.println("+-------+-------+-------+-------+--------+--------+--------+");
        System.out.println("| ROUND | DICE1 | DICE2 | DICE3 | TOTAL1 | TOTAL2 | TOTAL3 |");
        System.out.println("+-------+-------+-------+-------+--------+--------+--------+");

        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int round = 1; round <= rounds; round++) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int dice3 = random.nextInt(6) + 1;

            total1 += dice1;
            total2 += dice2;
            total3 += dice3;

            System.out.printf("|   %d   |   %d   |   %d   |   %d   |   %d    |   %d    |   %d    |%n",
                    round, dice1, dice2, dice3, total1, total2, total3);

            System.out.println("+-------+-------+-------+-------+--------+--------+--------+");
        }

        scanner.close();
    }
}

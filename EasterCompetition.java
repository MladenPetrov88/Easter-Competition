import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String bestBakerName = "";
        int bestBakerPoints = -1;

        for (int i = 0; i < count; i++)
        {
            String bakerName = scanner.nextLine();
            int points = 0;
            String command = scanner.nextLine();

            while (!command.equals("Stop"))
            {
                points += Integer.parseInt(command);
                command = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakerName, points);
            if (points > bestBakerPoints)
            {
                bestBakerName = bakerName;
                bestBakerPoints = points;
                System.out.printf("%s is the new number 1!%n", bakerName);
            }
        }
        System.out.printf("%s won competition with %d points!", bestBakerName, bestBakerPoints);
    }
}


import java.util.Scanner;

public class kaukiukai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atAll = 0;
        System.out.println("Įveskite kauliukų kiekį:");
        atAll = Integer.parseInt(scanner.nextLine());
        dices(scanner, atAll);

    }

    static void dices(Scanner scanner, int runs) {
        int possibleMax = runs * 6;
        int currentSum = 0;
        for (int i = 1; i <= runs; i++) {
            System.out.println(i + "-o kauliuko taškų kiekis:");
            currentSum += Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Iš viso buvo galima surinkti taškų: " + possibleMax);

        System.out.println("Tomas iš viso surinko: " + currentSum + " taškų");

        double average = (double) currentSum / runs;
        double rounded = Math.ceil(average * 10) / 10.0;
        System.out.println("Jo taškų vidurkis: " + rounded);

        if (average > 3) {
            System.out.println("Loterija laimėta.");
        } else {
            System.out.println("Loterija pralaimėta.");
        }
    }
}

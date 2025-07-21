import java.util.Scanner;
import java.util.Arrays;

public class ziemojantysPauksciai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite kiek kiekvienos rūšies paukščių liko žiemoti");
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] birds = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            birds[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(birds);
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
        }

        int biggestNumber = Arrays.stream(birds).max().getAsInt();
        int smallerNumber = Arrays.stream(birds).min().getAsInt();

        System.out.println("Skirtumas tarp didžiausio ir mažiausio kiekio: " + (biggestNumber - smallerNumber));
    }
}

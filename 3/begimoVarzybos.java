import java.util.Arrays;
import java.util.Scanner;

public class begimoVarzybos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoples = 0;
        System.out.println("Kiek dalyvavo bėgikų:");
        peoples = Integer.parseInt(scanner.nextLine());

        int[] result = loop(scanner, peoples);

        System.out.println("Greičiausio bėgiko laikas: " + result[0] + "sek.");
        System.out.println("Jis buvo " + result[1] + " sek geresnis už vidurkį.");
    }
    static int[] loop(Scanner scanner, int peoples){
        Integer[] seconds = new Integer[peoples];
        for(int i = 0; i < peoples; i++) {
            System.out.println("Įveskite " + (i +1) + " bėgiko laiką:");
            seconds[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = Arrays.stream(seconds).max(Integer::compare).get();
        int sum = Arrays.stream(seconds).mapToInt(Integer::intValue).sum();
        int average = sum / peoples;
        int betterThatAverage = max - average;

        return new int[] {max, betterThatAverage};
    }
}

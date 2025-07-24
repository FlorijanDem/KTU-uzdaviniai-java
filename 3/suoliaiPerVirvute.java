import java.util.Scanner;

public class suoliaiPerVirvute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumps = 0;
        System.out.println("Kiek kartų šokinėjo: ");
        jumps = Integer.parseInt(scanner.nextLine());
        Integer[] result = loop(scanner, jumps);
        System.out.println("Iš viso: " + result[0]);
        System.out.println("Vidutiniškai: " + result[1]);
    }
    static Integer[] loop(Scanner scanner, int jumps) {
        int sum = 0;
        for (int i = 1; i <= jumps; i++) {
            System.out.println("Kiek sušokinėjo kartų " + i + " bandymu:");
            sum += Integer.parseInt(scanner.nextLine());
        }
        int average = sum / jumps;
        return new Integer[] {sum, average};
    }
}

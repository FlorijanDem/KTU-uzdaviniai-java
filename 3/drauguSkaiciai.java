import java.util.Scanner;

public class drauguSkaiciai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite draugų sugalvotus skaičius:");
        System.out.println("Atsakimas: " + evenNumber(scanner));
        scanner.close();
    }
    static int evenNumber(Scanner scanner) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
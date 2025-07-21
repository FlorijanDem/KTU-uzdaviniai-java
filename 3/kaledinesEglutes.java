import java.util.Scanner;

public class kaledinesEglutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek eglučių atvežta?");
        int cristmasTree = Integer.parseInt(scanner.nextLine());
        double average = averageTree(scanner, cristmasTree);
        System.out.println("Eglutės aukščio vidurkis: " + average + "cm");
        scanner.close();

    }

    static double averageTree(Scanner scanner, int number) {

        int sumOfAll = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println("Įveskite " + i + " eglutės aukštį: ");
            sumOfAll += Integer.parseInt(scanner.nextLine());
        }
        double result = (double) sumOfAll / number;
        return result;
    }
}

import java.util.Scanner;

public class konkursas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = 0;
        int end = 0;

        System.out.println("Įveskite intervalo pradžią: ");
        begin = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite intervalo pabaigą: ");
        end = Integer.parseInt(scanner.nextLine());

        scanner.close();

        int result = Tshirt(begin, end);

        System.out.println("Reikalingų marškinėlių skaičius: " + result);
    }
    public static int Tshirt(int begin, int end) {
        int shirts = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 6 == 0) {
                shirts++;
            }
        }
        return shirts;
    }
}

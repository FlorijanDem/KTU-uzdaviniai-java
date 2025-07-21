import java.util.Scanner;

public class Skaiciai {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Įveskite a reikšmę. ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite b reikšmę. ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite c reikšmę.");
        c = Integer.parseInt(scanner.nextLine());
        scanner.close();
        reapeters(a, b, c);
    }

    public static void reapeters(int a, int b, int c) {
        if (a % 3 == 0) {
            System.out.println("Atsakymas: " + a);
        } else if (b % 3 == 0) {
            System.out.println("Atsakymas: " + b);
        } else if (c % 3 == 0) {
            System.out.println("Atsakymas: " + c);
        } else {
            System.out.println("Atsakymas: nėra");
        }
    }
}

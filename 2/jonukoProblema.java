import java.util.Scanner;

public class jonukoProblema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int typeOfCalculations = 0;
        int a = 0;
        int b = 0;

        System.out.println("Įveskite užduoties variantą. ");
        typeOfCalculations = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite a reikšmę. ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite b reikšmę. ");
        b = Integer.parseInt(scanner.nextLine());

        scanner.close();

        switch (typeOfCalculations) {
            case 1:
                System.out.println("Atsakymas: x = " + type1(a, b));
                break;

            case 2:
                System.out.println("Atsakymas: x = " + type2(a, b));
                break;

            case 3:
                System.out.println("Atsakymas: x = " + type3(a, b));
                break;

            default:
                System.out.println("Do not exists");
                break;
        }
    }

    public static int type1(int a, int b) {
        int x = a * b + 3;
        return x;
    }

    public static int type2(int a, int b) {
        int x = a + b;
        return x;
    }

    public static int type3(int a, int b) {
        int x = a - b;
        return x;
    }
}

import java.util.Scanner;

public class voveryte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nuts = 0;
        int childs = 0;

        System.out.println("Sukauptas riešutų kiekis X =");
        nuts = Integer.parseInt(scanner.nextLine());
        System.out.println("Voveriukų skaičius V=");
        childs = Integer.parseInt(scanner.nextLine());

        int result = loop(nuts, childs);

        System.out.println("Riešutų sukaupta " + result + " dienoms");

        if (result >= 92) {
            System.out.println("Riešutų užteks visai žiemai");
        } else {
            System.out.println("Riešutų neužteks visai žiemai");
        }
        scanner.close();
    }

    static int loop(int nuts, int childs) {
        int sum = nuts/((1+childs)*3)-1;
        return sum;
    }

}

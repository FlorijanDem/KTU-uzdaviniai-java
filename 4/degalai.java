import java.util.Scanner;

public class degalai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tank = 0;
        int fuelUsage = 0;

        System.out.println("Įveskite kuro bako talpą:");
        tank = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite kuro sąnaudas n:");
        fuelUsage = Integer.parseInt(scanner.nextLine());

        System.out.println("Keliauti bus galima " + loop(tank, fuelUsage) + " dienų/(as)/(ą).");
        scanner.close();
    }
    static int loop(int tank, int fuelUsage) {
        int circle = 1;
        while (tank != 0) {
            if (circle % 2 != 0) {
                tank -= fuelUsage;
            } else {
                tank -= fuelUsage * 2;
            }
            if (tank < 0) {
                break;
            }
            circle++;
        }
        return circle - 1;
    }
}

import java.util.Scanner;

public class saldainiai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int haveCandies = 0;
        System.out.println("Petriukas gavo saldainių: ");
        haveCandies = Integer.parseInt(scanner.nextLine());
        int[] result = loop(scanner, haveCandies);
        System.out
                .println("Petriukui saldainių užteks " + result[0] + " dienoms ir jam liks " + result[1] + " saldainiai.");
    }

    static int[] loop(Scanner scanner, int candies) {
        int nowExisting = candies;
        boolean tryMore = true;
        int days = 0;
        while (tryMore) {
            System.out.println("Per dieną suvalgė: ");
            int inThisDay = Integer.parseInt(scanner.nextLine());
            if (nowExisting >= inThisDay) {
                nowExisting -= inThisDay;
                days++;
            } else {
                tryMore = false;
            }
        }
        return new int[] { days, nowExisting };

    }
}

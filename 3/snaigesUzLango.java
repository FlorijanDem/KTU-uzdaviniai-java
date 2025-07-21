import java.util.Scanner;

public class snaigesUzLango {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);

        System.out.println("Įveskite, kiek snaigių nukrito per pirmąją sekundę ir kiek sekundžių snigo:");
        String[] snow = myinput.nextLine().split(" ");
        myinput.close();

        int flakesFromStart = Integer.parseInt(snow[0]);
        int seconds = Integer.parseInt(snow[1]);

        int result = calculate(flakesFromStart, seconds);
        System.out.println(result);
    }
    static int calculate(int unitsFromBegin, int seconds) {
        int sum = 0;
        int perSecond = unitsFromBegin;
        for (int i = 0; i < seconds; i++) {
            sum += perSecond;
            perSecond *= 2;
        }
        return sum;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class automobilis {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int longOfDistance = 264;
        int speed = 0;

        try {
            System.out.println("Koks automobilio greitis?");
            speed = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        float distanceInSecond = (float) speed * 1000 / 60 / 60;
        float sum = (float)longOfDistance / distanceInSecond;
        System.out.println("Automobilis tunelį pravažiuos per " + sum + " s");
    }
}
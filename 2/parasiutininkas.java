import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parasiutininkas {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        double height = 0;
        double haveTime = 0;
        final double gravity = 9.8;

        try {
            System.out.println("Iš kokio aukščio šoka parašiutininkas?");
            height = Double.parseDouble(myinput.readLine());
            System.out.println("Per kiek sekundžių išsiskleidžia jo parašiutas?");
            haveTime = Double.parseDouble(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        double willBeOpen = Math.sqrt(2 * height / gravity);
        if (willBeOpen > haveTime) {
            System.out.println("Parašiutas išsiskleis");
        } else if (willBeOpen <= haveTime) {
            System.out.println("Parašiutas neišsiskleis");
        } else {
            System.out.println("Need more data");
        }
    }
}

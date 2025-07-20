import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class keltas {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCars = 0;
        int canTravel = 0;

        try {
            System.out.println("Automobilių skaičius: ");
            numberOfCars = Integer.parseInt(myinput.readLine());
            System.out.println("Į keltą telpa automobilių: ");
            canTravel = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }

        System.out.println("Perkels per kartų: " + (int)(numberOfCars / canTravel));
        System.out.println("Liks neperkelta: " + (int)(numberOfCars % canTravel));
    }
}

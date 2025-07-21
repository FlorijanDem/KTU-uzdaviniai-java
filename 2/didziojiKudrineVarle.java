import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class didziojiKudrineVarle {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int weightPerUnit = 0;
        int numberOfFrogs = 0;

        try {
            System.out.println("Kiek sveria varlė?");
            weightPerUnit = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek varlių norima stebėti?");
            numberOfFrogs = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        int sum = weightPerUnit * numberOfFrogs;

        if (sum > 5000) {
            System.out.println("Varlių stebėjimui pakanka");
        } else {
            System.out.println("Varlių stebėjimui per mažai");
        }
    }
}

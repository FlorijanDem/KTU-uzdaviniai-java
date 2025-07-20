import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class puodeliai {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int cups = 0;
        int box = 3;
        int unused = 0;
        int fullBoxes = 0;

        try {
            System.out.println("Puodelių, kuriuos reikia supakuoti, skaičius:");
            cups = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }

        fullBoxes = cups / box;
        unused = cups % box;

        System.out.println("Pilnų dėžučių skaičius: " + fullBoxes);
        System.out.println("Nesupakuotų puodelių skaičius: " + unused);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taupykle {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int fiveCents = 0;
        int twentyCents = 0;
        int twoLits = 0;

        try {
            System.out.println("Kiek yra monetų po 5 ct?");
            fiveCents = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek yra monetų po 20 ct?");
            twentyCents = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek yra monetų po 2 Lt?");
            twoLits = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        float sumInLits = (float)(fiveCents * 5 + twentyCents * 20 + twoLits * 200) / 100;
        System.out.println("Taupyklėje yra " + sumInLits + " Lt.");
    }
}
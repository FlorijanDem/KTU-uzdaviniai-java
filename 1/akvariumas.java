import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class akvariumas {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int firstDay = 0;
        int addEveryDay = 0;
        int days = 0;

        try {
            System.out.println("Kiek žuvų gyvena akvariume?");
            firstDay = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek žuvų į akvariumą įdedama kiekvieną dieną?");
            addEveryDay = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek dienų praėjo?");
            days = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something wrong");
        }
        int inLastDay = firstDay + (addEveryDay * days);
        System.out.println("Po " + days + " dienų akvariume gyvens " + inLastDay + " žuvų.");
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class gimtadienis {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        // Cookies from Toutvydas be like base
        int fromTautvydas = 0;
        int fromOthers = 0;
        int members = 0;
    
        try {
            System.out.println("Kiek sausainių iškepė Tautvydas? ");
            fromTautvydas = Integer.parseInt(myinput.readLine());
            System.out.println("Keli draugai dar atsinešė po tiek pat sausainių?");
            fromOthers = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek žmonių iš viso dalyvavo šventėje?");
            members = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        int sumOfCookies = fromTautvydas + fromTautvydas * fromOthers;
        int forEveryMember = sumOfCookies / members;
        int forTautvydas = sumOfCookies % members;

        System.out.println("Kiekvienas šventės dalyvis gavo po " + forEveryMember + " sausainius");
        System.out.println("Tautvydui papildomai atiteko " + forTautvydas + " sausainiai");
    }

}

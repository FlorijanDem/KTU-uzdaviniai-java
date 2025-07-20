import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trapecijos {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader (new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int h = 0;

        try {
            System.out.println("Trapecijos ilgesniojo pagrindo ilgis:");
            a = Integer.parseInt(myinput.readLine());
            System.out.println("Trapecijos trumpesniojo pagrindo ilgis:");
            b = Integer.parseInt(myinput.readLine());
            System.out.println("Trapecijos aukštinės ilgis:");
            h = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        int sum = (a + b) * h / 2;
        System.out.println("Trapecijos plotas: " + sum);
    }
}
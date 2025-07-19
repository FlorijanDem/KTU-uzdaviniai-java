import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pamoka {
    public static void main(String[] args) {
        System.out.println("Input number");
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = 0;
        int secondNumber = 0;
        int numberThree = 0;
        int numberFour = 0;
        int numberFive = 0;
        try {
            System.out.println("Kiek pamokų yra pirmadienį?");
            firstNumber = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek pamokų yra antradienį?");
            secondNumber = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek pamokų yra trečiadienį? ");
            numberThree = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek pamokų yra ketvirtadienį?");
            numberFour = Integer.parseInt(myinput.readLine());
            System.out.println("Kiek pamokų yra penktadienį?");
            numberFive = Integer.parseInt(myinput.readLine());
        } catch (IOException ioe) {
            System.out.println("Error");
        }
        int sum = firstNumber + secondNumber + numberThree + numberFour + numberFive;
        int sumOfMins = sum * 45;

        System.out.println("Pamokų skaičius: " + sum);
        System.out.println("Tai sudaro minučių: " + sumOfMins);
    }
}

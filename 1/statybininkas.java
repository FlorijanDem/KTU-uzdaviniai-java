import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class statybininkas {
    public static void main(String[] args) {
        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int lenght = 0;
        int height = 0;
        float cost = 0;
        
        // in cm 
        int brickLength = 20;
        int brickHeight = 10;

        try {
            System.out.println("Sienos ilgis");
            String inputLength = myinput.readLine();
            lenght = convertToCm(inputLength);

            System.out.println("Sienos aukštis");
            String inputHeight = myinput.readLine();
            height = convertToCm(inputHeight);

            System.out.println("Plytos kaina");
            String inputCost = myinput.readLine();
            cost = convertToCents(inputCost);
        } catch (IOException ioe) {
            System.out.println("Something is wrong");
        }
        int brickArea = brickLength * brickHeight;
        int numberOfBricks = lenght * height / brickArea;

        float finalCost = (float)(cost / 100 * numberOfBricks);

        System.out.println("Plytų kiekis: " + numberOfBricks);
        System.out.println("Plytos kainuos " + String.format("%.2f", finalCost));
    }


    public static int convertToCm(String input) {
        input = input.trim().toLowerCase();
        if (input.endsWith("m")) {
            String number = input.replace("m", "").trim();
            return (int)(Float.parseFloat(number) * 100);
        } else if (input.endsWith("cm")) {
            String number = input.replace("cm", "").trim();
            return (int)(Float.parseFloat(number));
        } else {
            System.out.println("Wrong measure type! Need to use 'm' or 'cm' in the end of input");
            return 0;
        }
    }

    public static float convertToCents(String input) {
        input = input.trim();
        if (input.endsWith("Lt")) {
            String number = input.replace("Lt", "").trim();
            return (float)(Float.parseFloat(number) * 100);
        } else if (input.endsWith("Cent")) {
            String number = input.replace("Cent", "").trim();
            return (float)(Float.parseFloat(number));
        } else {
            System.out.println("Wrong type! Need to use 'Lt' or 'Cent' in the end");
            return 0;
        }
    }
}
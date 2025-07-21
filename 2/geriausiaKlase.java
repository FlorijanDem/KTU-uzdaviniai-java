import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class geriausiaKlase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite klasių vidurkius:");
        String [] classAverages = scanner.nextLine().split(" ");
        scanner.close();

        double biggestNumber = Arrays.stream(classAverages)
            .mapToDouble(Double::parseDouble)
            .max()
            .getAsDouble();

        ArrayList<Double> differences = new ArrayList<>();

        for (int i = 0; i < classAverages.length; i++) {
            double parsedNumber = Double.parseDouble(classAverages[i]);
            if (parsedNumber == biggestNumber) {
                continue;
            } else if (parsedNumber < biggestNumber){
                differences.add(biggestNumber - parsedNumber);
            }
        }
        
        System.out.println("Didžiausias vidurkis: " + biggestNumber);
        System.out.println("Kitų klasių vidurkiai skiriasi: " + String.join(", ", differences.stream().map(String::valueOf).toArray(String[]::new)));


    }
}

import java.util.Scanner;

public class matematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite 5 pažymius vienoje eilutėje, atskirtus tarpais:");
        String line = scanner.nextLine();
        scanner.close();
        
        String[] piece = line.split(" ");

        int sum = 0;
        for (int i = 0; i < piece.length; i++) {
            int mark = Integer.parseInt(piece[i]);
            sum += mark;
        }

        double medium = (double) sum / piece.length;

        if (medium > 9) {
            System.out.println("Petriukas gaus tris saldainius");
        } else if (medium >= 7 && medium <= 9) {
            System.out.println("Petriukas gaus du saldainius");
        } else {
            System.out.println("Petriukas gaus vieną saldainį");
        }
    }
}

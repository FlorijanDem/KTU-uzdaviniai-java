// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

import java.util.Scanner;

public class bandeles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite kainas a ir b:");
        String[] costs = scanner.nextLine().split(" ");
        double a = Double.parseDouble(costs[0]);
        double b = Double.parseDouble(costs[1]);

        System.out.println("Įveskite kiekius n1, n2, n3:");
        String[] quantity = scanner.nextLine().split(" ");
        int n1 = Integer.parseInt(quantity[0]);
        int n2 = Integer.parseInt(quantity[1]);
        int n3 = Integer.parseInt(quantity[2]);

        System.out.println("Įveskite bandelės kainą: ");
        double costPerUnit = Double.parseDouble(scanner.nextLine());

        scanner.close();
        double finalCost = 0;
        if (costPerUnit <= a) {
            finalCost = costPerUnit * n1;
        } else if (costPerUnit > a && costPerUnit <= b){
            finalCost = costPerUnit * n2;
        } else {
            finalCost = costPerUnit * n3;
        }

        System.out.printf("Už bandeles bus sumokėta: %.2f Lt.%n", finalCost);
    }
}

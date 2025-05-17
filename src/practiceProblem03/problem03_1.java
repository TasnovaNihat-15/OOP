package practiceProblem03;

import java.util.Scanner;

public class problem03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[5];
        double sum = 0 ;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}


package practiceProblem03;

import java.util.Scanner;

public class problem03_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] series = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            series[i] = sc.nextInt();
        }


        for (int i = size - 1; i >= 0; i--) {
            System.out.print(series[i] + " ");
        }
    }
}


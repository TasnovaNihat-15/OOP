package practiceProblem03;


import java.util.Scanner;

public class problem03_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int size = sc.nextInt();
        int[] numbers = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}

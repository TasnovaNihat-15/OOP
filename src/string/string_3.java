package string;

import java.util.Scanner;

public class string_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char target = sc.next().charAt(0);
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' occurred " + count + " times");
    }
}


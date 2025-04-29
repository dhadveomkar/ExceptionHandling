package StringToInteger;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number as a string: ");
        String input = scanner.nextLine();
        
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            scanner.close();
        }
    }
}
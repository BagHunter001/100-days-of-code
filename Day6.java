
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number as a string (integer):");
        String intString = scanner.nextLine();
        int intValue = Integer.parseInt(intString);
        System.out.println("String to Integer: " + intValue);
        System.out.println("Enter a number as a string (float):");
        String floatString = scanner.nextLine();
        float floatValue = Float.parseFloat(floatString);
        System.out.println("String to Float: " + floatValue);
        System.out.println("Enter an integer to convert to String:");
        int number = scanner.nextInt();
        String strValue1 = String.valueOf(number);
        System.out.println("Integer to String using valueOf(): " + strValue1);
        String strValue2 = Integer.toString(number);
        System.out.println("Integer to String using toString(): " + strValue2);
        scanner.close();
    }
}

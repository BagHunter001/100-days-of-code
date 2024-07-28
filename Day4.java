import java.util.Scanner;

public class Day4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(
                    "the following numbers will be used for area calculations the first number=width ,,the second number=length");
            System.out.print("Input your first number: ");
            double a = Double.valueOf(scanner.nextLine());
            System.out.print("Input your second number: ");
            double b = Double.valueOf(scanner.nextLine());

            if (a == b || a <= 0 || b <= 0) {
                System.out.println("strictly choose numbers that are positive and not equal");
            } else {
                double multiplication = a * b;
                double subtraction = a - b;
                double addition = a + b;
                double division = a / b;

                System.out.println("a * b = " + multiplication);
                System.out.println("a - b = " + subtraction);
                System.out.println("a + b = " + addition);
                System.out.println("a / b = " + division);
                
            }
            System.out.println();
            System.out.println("DO YOU WANT TO CONTINUE/? (YES/NO)");
            String message = scanner.nextLine();

            if (message.equals("NO")) {
                break;
        }else{
            continue;
        }
    }
}
}

import java.math.BigDecimal;
import java.util.Scanner;

public class DataTypeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (e.g., 42): ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a floating-point number (e.g., 3.14): ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value (e.g., 123.456): ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a character (e.g., A): ");
        char charValue = scanner.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.print("Enter a decimal value (e.g., 10.25): ");
        BigDecimal decimalValue = scanner.nextBigDecimal();

        System.out.println("\nEntered values:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("Decimal value: " + decimalValue);

        scanner.close();
    }
}

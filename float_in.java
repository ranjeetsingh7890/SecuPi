import java.util.Scanner;

public class DataTypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        // Perform multiplication
        float floatResult = num1 * num2;
        int intResult = (int) (num1 * num2);
        double doubleResult = (double) num1 * num2;
        long longResult = (long) (num1 * num2);

        System.out.println("Float multiplication is: " + floatResult);
        System.out.println("Integer multiplication is: " + intResult);
        System.out.println("Double multiplication is: " + doubleResult);
        System.out.println("Long multiplication is: " + longResult);

        scanner.close();
    }
}

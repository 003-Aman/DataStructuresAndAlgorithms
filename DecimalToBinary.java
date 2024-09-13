import java.util.Scanner;

public class DecimalToBinary {

    // Recursive method to convert decimal to binary
    public static void printBinary(int number) {
        if (number > 1) {
            printBinary(number / 2);  // Recursive call
        }
        System.out.print(number % 2);  // Print the binary digit
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();

            System.out.print("Binary representation: ");
            printBinary(decimalNumber);
            System.out.println();

            System.out.print("Do you want to convert another number? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                continueConversion = false;
            }
        }

        System.out.println("The time complexity of the algorithm is O(log n).");
        scanner.close();
    }
}

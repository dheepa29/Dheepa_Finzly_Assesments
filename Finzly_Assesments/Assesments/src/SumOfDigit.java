import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}

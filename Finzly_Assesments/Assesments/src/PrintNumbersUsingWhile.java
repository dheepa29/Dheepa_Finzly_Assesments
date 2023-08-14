import java.util.Scanner;

        public class PrintNumbersUsingWhile {
            public static void main(String[] args) {
                int i;

                // 1) Write a Program To print 1 to 25 nos.
                i = 1;
                while (i <= 25) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();

                // 2) Write a Program To print 25 to 1 nos.
                i = 25;
                while (i >= 1) {
                    System.out.print(i + " ");
                    i--;
                }
                System.out.println();

                // 3) Write a Program To print 1 to 100 Even nos.
                i = 1;
                while (i <= 100) {
                    if (i % 2 == 1) {
                        System.out.print(i + " ");
                    }
                    i++;
                }
                System.out.println();

                // 4) Write a Program To print 1 to 100 Odd nos.
                i = 1;
                while (i <= 100) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                    i++;
                }
                System.out.println();

                // 5) Write a Program To print sum of 1 to 50 Odd nos.
                int sumOdd = 0;
                i = 1;
                while (i <= 50) {
                    sumOdd += i;
                    i += 2;
                }
                System.out.println("Sum of Odd: " + sumOdd);

                // 6) Write a Program To print sum of 1 to 50 EVEN nos.
                int sumEven = 0;
                i = 2;
                while (i <= 50) {
                    sumEven += i;
                    i += 2;
                }
                System.out.println("Sum of Even: " + sumEven);

                // 7) Write a Program To print -45 to +45 nos.
                i = -45;
                while (i <= 45) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();

                // 8) Write a Program To print 50 to 100 nos.
                i = 50;
                while (i <= 100) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();

                // 9) Write a Program To print sum of odd and even no.
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the start number: ");
                int start = scanner.nextInt();

                System.out.print("Enter the end number: ");
                int end = scanner.nextInt();

                sumOdd = 0;
                sumEven = 0;
                i = start;
                while (i <= end) {
                    if (i % 2 == 0) {
                        sumEven += i;
                    } else {
                        sumOdd += i;
                    }
                    i++;
                }
                System.out.println("Sum of odd numbers: " + sumOdd);
                System.out.println("Sum of even numbers: " + sumEven);

                i = 1;
                while (i <= 100) {
                    if (i % 2 == 0) {
                        System.out.print("Even: " + i + " ");
                    } else {
                        System.out.print("Odd: " + i + " ");
                    }
                    i++;
                }
                System.out.println();

                // 11) Write a Program To print 1 to 100 no.
                i = 1;
                while (i <= 100) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();

                // 12) Write a Program To print 100 to 1 no.
                i = 100;
                while (i >= 1) {
                    System.out.print(i + " ");
                    i--;
                }
                System.out.println();

                // 13) Write a Program To print 30 to 50 no.
                i = 30;
                while (i <= 50) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();

                // 14) Write a Program To print count of even No 1 to 25 no.
                int sum = 0;
                i = 1;
                while (i <= 25) {
                    sum += i;
                    i += 2;
                }
                System.out.println("Sum of Odd: " + sum);

                // 15) Write a Program To print count of odd No 1 to 25 no.
                sum = 0;
                i = 2;
                while (i <= 25) {
                    sum += i;
                    i += 2;
                }
                System.out.println("Sum of Even: " + sum);



            }
        }


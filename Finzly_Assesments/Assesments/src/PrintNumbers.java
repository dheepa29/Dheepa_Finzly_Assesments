import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

//1) Write a Program To print 1 to 25 nos.
        for(int i=1;i<=25;i++){
            System.out.print(i+" ");
        }
        System.out.println();

// 2) Write a Program To print 25 to 1 nos.
        for(int i=25;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();

//        3) Write a Program To print 1 to 100 Odd nos.
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

//        4) Write a Program To print 1 to 100 even nos.
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

//        5) Write a Program To print sum of 1 to 50 Odd nos.
        int sum=0;
        for(int i=1;i<=50;i+=2) {
            sum += i;
        }
        System.out.print("Sum of Odd : "+sum+" ");
        System.out.println();

//        6) Write a Program To print sum of 1 to 50 EVEN nos.
        sum=0;
        for(int i=2;i<=50;i+=2) {
            sum += i;
        }
        System.out.print("Sum of Even : "+sum+" ");
        System.out.println();

//        7) Write a Program To print -45 to +45 nos.  // negative no and positive no
        for(int i=-45;i<=45;i++){
            System.out.print(i+" ");
        }
        System.out.println();

//        8) Write a Program To print 50 to 100 nos.
        for(int i=50;i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println();

//        9) Write a Program To print sum of odd and even no.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println();

//        10) Write a Program To print even and odd No

//        11) Write a Program To	 print 1 to 100 no.
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println();
//        12) Write a Program To print 100 to 1 no.
        for(int i=100;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
//        13) Write a Program To print 30 to 50 no.
        for(int i=30;i<=50;i++){
            System.out.print(i+" ");
        }
        System.out.println();
//        14) Write a Program To print count of even No 1 to 25 no.
        sum=0;
        for(int i=1;i<=25;i+=2) {
            sum += i;
        }
        System.out.print("Sum of Odd : "+sum+" ");
        System.out.println();

//        15) Write a Program To print count of odd No 1 to 25 no.
        sum=0;
        for(int i=2;i<=25;i+=2) {
            sum += i;
        }
        System.out.print("Sum of Even : "+sum+" ");
        System.out.println();
    }
    }

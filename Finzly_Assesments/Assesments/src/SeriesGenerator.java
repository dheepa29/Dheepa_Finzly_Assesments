public class SeriesGenerator {
    public static void main(String[] args) {
        // 1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2) Generate the Series... 9 18 27 36 45 54 63 72 81 90.
        for (int i = 9; i <= 90; i += 9) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
        for (int i = 1; i <= 10; i++) {
            System.out.print((i % 2 == 0) ? "-" + i + " " : i + " ");
        }
        System.out.println();


        // 4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 5) Generate the Series... 1 10 100 1000.
        int value = 1;
        for (int i = 1; i <= 4; i++) {
            System.out.print(value + " ");
            value *= 10;
        }
        System.out.println();


        // 6) Generate the Series... 1 3 6 10 15 21 28 36 45.
        value = 0;
        for (int i = 1; i <= 9; i++) {
            value += i;
            System.out.print(value + " ");
        }
        System.out.println();


        // 7) Generate the Series... 8 16 24 32 40 48 56 64 72 80.
        for (int i = 8; i <= 80; i += 8) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 8) Generate the Series... 0 1 1 2 3 5 8 13 21.
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 9; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
         // 9) Generate the series... 1 4 9 16 25 36 49 64 81 100.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();

        // 10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
        for (int i = 3; i <= 30; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 11) Generate the Series... 7 14 21 28 35 42 49 56 63 70.
        for (int i = 7; i <= 70; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 12) Generate the Series... 4 8 12 16 20 24 28 32 36 40.
        for (int i = 4; i <= 40; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 13) Generate the Series... 10 20 30 40 50 60 70 80 90 100.
        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 14) Generate the Series... 1 2 3 4 5 4 3 2 1.
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        for (int i = 4; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 15) Generate the Series... 6 12 18 24 30 36 42 48 54 60.
        for (int i = 6; i <= 60; i += 6) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


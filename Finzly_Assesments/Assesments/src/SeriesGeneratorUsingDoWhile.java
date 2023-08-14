public class SeriesGeneratorUsingDoWhile {
    public static void main(String[] args) {
        int i;

        // 1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println();

        // 2) Generate the Series... 9 18 27 36 45 54 63 72 81 90.
        i = 9;
        do {
            System.out.print(i + " ");
            i += 9;
        } while (i <= 90);
        System.out.println();

        // 3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
        i = 1;
        do {
            System.out.print((i % 2 == 0) ? "-" + i + " " : i + " ");
            i++;
        } while (i <= 10);
        System.out.println();

        // Continue with similar patterns for the remaining series...

        // 4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
        i = 5;
        do {
            System.out.print(i + " ");
            i += 5;
        } while (i <= 50);
        System.out.println();

        // 5) Generate the Series... 1 10 100 1000.
        int value = 1;
        i = 1;
        do {
            System.out.print(value + " ");
            value *= 10;
            i++;
        } while (i <= 4);
        System.out.println();

        // Continue with the remaining series...

        // 6) Generate the Series... 1 3 6 10 15 21 28 36 45.
        value = 0;
        i = 1;
        do {
            value += i;
            System.out.print(value + " ");
            i++;
        } while (i <= 9);
        System.out.println();

        // Continue with the remaining series..

        // 7) Generate the Series... 8 16 24 32 40 48 56 64 72 80.
        i = 8;
        do {
            System.out.print(i + " ");
            i += 8;
        } while (i <= 80);
        System.out.println();

        // 8) Generate the Series... 0 1 1 2 3 5 8 13 21.
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        i = 2;
        do {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            i++;
        } while (i < 9);
        System.out.println();

        // 9) Generate the series... 1 4 9 16 25 36 49 64 81 100.
        i = 1;
        do {
            System.out.print(i * i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
        // Continue with the remaining series...

        // 10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
        i = 3;
        do {
            System.out.print(i + " ");
            i += 3;
        } while (i <= 30);
        System.out.println();
        // 11) Generate the Series... 7 14 21 28 35 42 49 56 63 70.
        i = 7;
        do {
            System.out.print(i + " ");
            i += 7;
        } while (i <= 70);
        System.out.println();

        // 12) Generate the Series... 4 8 12 16 20 24 28 32 36 40.
        i = 4;
        do {
            System.out.print(i + " ");
            i += 4;
        } while (i <= 40);
        System.out.println();
        // 13) Generate the Series... 10 20 30 40 50 60 70 80 90 100.
        i = 10;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 100);
        System.out.println();
        // 14) Generate the Series... 1 2 3 4 5 4 3 2 1.
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        i = 4;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
        System.out.println();

        // 15) Generate the Series... 6 12 18 24 30 36 42 48 54 60.
        i = 6;
        do {
            System.out.print(i + " ");
            i += 6;
        } while (i <= 60);
        System.out.println();
    }
}

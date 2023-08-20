package studentApp;
import java.lang.Math;


public class EggPassingGame {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        for (int i = 2; i <= 38; i++) {
            sum = (int) Math.pow(n, i);
            n += sum;
            System.out.println(n);
        }
    }
}

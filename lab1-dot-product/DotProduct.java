import java.math.BigInteger;
import java.util.Random;

public class DotProduct {

    public static void main(String[] args) {
        int n = 5;

        int[] a = new int[n];
        int[] b = new int[n];
        BigInteger[] c = new BigInteger[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt();
            b[i] = random.nextInt();

            // product of two integer can be out of range of int - integer overflow
            BigInteger bigA = BigInteger.valueOf(a[i]);
            BigInteger bigB = BigInteger.valueOf(b[i]);
            c[i] = bigA.multiply(bigB);
        }


        System.out.print("array a = ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            System.out.print(" ");

        }
        System.out.println();


        System.out.print("array b = ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]);
            System.out.print(" ");

        }
        System.out.println();

        System.out.print("array c = ");
         for (int i = 0; i < n; i++) {
            System.out.print(c[i]);
            System.out.print(" ");

        }
        System.out.println();

    }
}
import java.util.Scanner;

public class KaratsubaMultiplication {
    /** Function to multiply two numbers **/
    public static long multiply(long x, long y)
    {
        int size1 = getSize(x);
        int size2 = getSize(y);
        /** Maximum of lengths of number **/
        int N = Math.max(size1, size2);
        /** for small values directly multiply **/
        if (N <= 2)
            return x * y;
        /** max length divided, rounded up **/
        N = (N / 2) + (N % 2);
        /** multiplier **/
        long m = (long)Math.pow(10, N);

        /** compute sub expressions **/
        long b = x / m;
        long a = x - (b * m);
        long d = y / m;
        long c = y - (d * m);
        /** compute sub expressions **/
        long z0 = multiply(a, c);
        long z1 = multiply(a + b, c + d);
        long z2 = multiply(b, d);

        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long)(Math.pow(10, 2 * N)));
    }
    /** Function to calculate length or number of digits in a number **/
    public static int getSize(long num)
    {
        int ctr = 0;
        while (num != 0)
        {
            ctr++;
            num /= 10;
        }
        return ctr;
    }
    /** Main function **/
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Karatsuba Multiplication Algorithm Test\n");

        /** Accept two integers **/
        System.out.println("Enter two integer numbers\n");
        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        /** Call function multiply of class Karatsuba **/
        long product = multiply(n1, n2);
        System.out.println("\nProduct : "+ product);
    }
}

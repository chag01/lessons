package alishev_lessons;

public class Factorial {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Factorial " +x + " = " + fac(x));
    }

    private static int fac(int n) {
        if (n == 1)
            return 1;
        System.out.println("n = " +n);
        return n * fac( n - 1);
    }
}

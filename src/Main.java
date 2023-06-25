public class Main {
    public static void main(String[] args) {
        int a = 4;
        int n = 50;
        double result = exponentiation(a, n);
        System.out.println("The result is " + result);
        System.out.println(Math.pow(a,n));
    }

    private static double exponentiation(double a, int n) { //быстрое возведение в степень
        double result = 1;
        double multiplication = a;
        while (n != 0) {
            if (n % 2 == 1) {
                result *= multiplication;
            }
            multiplication *= multiplication;
            n = n/2;
        }
        return result;
    }
}
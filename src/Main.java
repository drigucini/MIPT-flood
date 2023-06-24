public class Main {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        int result = exponentiation(a, n);
        System.out.println("The result is " + result);
    }

    private static int exponentiation(int a, int n) { //быстрое возведение в степень
        int result = 1;
        int multiplication = a;
        while (n != 0) {
            if (n % 2 == 1) {
                result *= multiplication;
                multiplication *= multiplication;
                n = n/2;
            }
        }
        return result;
    }
}
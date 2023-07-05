public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

        public static void task1 () {
        System.out.println("Task 1");
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

    public static void task2 () {
        System.out.println("Working with digit systems, part I");
        int check = convertTo10DigitSystem("211", 3);
        System.out.println(check);
    }

    private static int convertTo10DigitSystem(String number, int n) {
        int sum = 0;

        char[] array = new char[36];

        for (int i = 0; i <= 9; i++) {
            array[i] = (char) ('0' + i);
        }
        for (int i = 10; i < array.length; i++) {
            array[i] = (char) ('A' + i - 10);
        }

        for (int i = 0; i < number.length(); i++) {
            double pow = Math.pow(n, number.length() - i - 1);
            if (number.charAt(i) <= '9') {
                sum = sum + (number.charAt(i) - '0') * (int) pow;
            } else {
                sum = sum + (number.charAt(i) - 'A' + 10) * (int) pow;
            }
        }
        return sum;
    }
    public static void task3 () {
        System.out.println("Task 3");
    }

    public static void task4 () {
        System.out.println("Task 4");
    }

    public static void task5 () {
        System.out.println("Task 5");
    }

    public static void task6 () {
        System.out.println("Task 6");
    }

    public static void task7 () {
        System.out.println("Task 7");
    }



}
import java.util.Scanner;

public class Main {

    static char[] array = new char[36];

    private static void fillArray() {
        for (int i = 0; i <= 9; i++) {
            array[i] = (char) ('0' + i);
        }
        for (int i = 10; i < array.length; i++) {
            array[i] = (char) ('A' + i - 10);
        }
    }
    public static void main(String[] args) {
        fillArray();
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
        System.out.println("Converting to 10 digit system");
        System.out.println(convertTo10DigitSystem("211", 3));

        System.out.println("Converting to any digit from 10 digit");
        System.out.println(convertFrom10DigitToAnySystem(234,3));
    }

    private static int convertTo10DigitSystem(String number, int n) {
        int sum = 0;

        int multiplier = 1;
        for (int i = number.length() - 1; i >= 0; i--) {
//            double pow = Math.pow(n, number.length() - i - 1);
            if (number.charAt(i) <= '9') {
                sum = sum + (number.charAt(i) - '0') * multiplier;
            } else {
                sum = sum + (number.charAt(i) - 'A' + 10) * multiplier;
            }
            multiplier *= n;
        }
        return sum;
    }

    private static String convertFrom10DigitToAnySystem (int number, int n) {
        StringBuilder result = new StringBuilder();
        while (number != 0) {
            char temp = array[number%n];
            result.insert(0,temp);
            number/=n;
        }
        return result.toString();
    }

    public static void task3 () { //Recursive function training
        System.out.println("Task 3");
        System.out.println("Input n:");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int n = 10;
        System.out.println(recursiveFunction(n));
    }

    public static int recursiveFunction(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
            return recursiveFunction(n - 1) + recursiveFunction(n - 2) + recursiveFunction(n - 3);
    }

    public static void task4 () {
        System.out.println("Task 4");
        int n = 9;
        System.out.println("Sum equals to " + mySum(n));
    }

    public static int mySum(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return n + mySum(n - 2);
    }


    public static void task5 () {
        System.out.println("Task 5");
        int n = 10;
        System.out.println("The sum equals to " + findSum(n));
    }

    public static int findSum(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }

        return n + findSum(n - 1);
    }

    public static void task6 () {
        System.out.println("Task 6");
    }

    public static void task7 () {
        System.out.println("Task 7");
    }
}
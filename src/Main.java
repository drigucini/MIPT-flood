import java.sql.SQLOutput;
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
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();

    }

    public static void task1() {
        System.out.println("Task 1");
        int a = 4;
        int n = 50;
        double result = exponentiation(a, n);
        System.out.println("The result is " + result);
        System.out.println(Math.pow(a, n));
    }

    private static double exponentiation(double a, int n) { //быстрое возведение в степень
        double result = 1;
        double multiplication = a;
        while (n != 0) {
            if (n % 2 == 1) {
                result *= multiplication;
            }
            multiplication *= multiplication;
            n = n / 2;
        }
        return result;
    }

    public static void task2() {
        System.out.println("Working with digit systems, part I");
        System.out.println("Converting to 10 digit system");
        System.out.println(convertTo10DigitSystem("211", 3));

        System.out.println("Converting to any digit from 10 digit");
        System.out.println(convertFrom10DigitToAnySystem(234, 3));
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

    private static String convertFrom10DigitToAnySystem(int number, int n) {
        StringBuilder result = new StringBuilder();
        while (number != 0) {
            char temp = array[number % n];
            result.insert(0, temp);
            number /= n;
        }
        return result.toString();
    }

    public static void task3() { //Recursive function training
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

    public static void task4() {
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


    public static void task5() {
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

    public static void task6() {
        System.out.println("Task 6");
        int n = 10;
        System.out.println(findFactorial(n));
    }

    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 6;
        }
        return n * findFactorial(n - 1);
    }

    public static void task7() {
        System.out.println("Task 7");
        int n = 20;
        System.out.println("Fibonacci series up to " + n + " is:");

        for (int i = 1; i < n; i++) {
            System.out.print(printFibonacci(i) + " ");
        }
    }

    public static int printFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static void task8() {
        System.out.println("Task 8");
        int n = 10;
        countDown(n);
    }

    public static void countDown(int n) {
        if (n == 0) {
            System.out.print(n);
        } else {
            System.out.print(n + " ");
            countDown(n - 1);
        }

    }

    public static void task9() {
        System.out.println("Task 9");
        String text = "";
        System.out.println(reverseString(text));
    }

    public static String reverseString(String t) {
        if (t.length() == 0) {
            return "";
        }
        String temp = t.charAt(t.length() - 1) + "";
        return temp + reverseString(t.substring(0, t.length() - 1));
    }

    public static void task10() {
        System.out.println("Task 10");
        String text = "ABCD";
        System.out.println(countLengthString(text));
        System.out.println(duplicateString(text));
    }

    public static String duplicateString(String t) {
        if (t.length() == 1) {
            return t + t;
        }
        String temp = t.charAt(0) + "";
        return temp + temp + duplicateString(t.substring(1));
    }

    public static int countLengthString(String t) {
        if (t.length() == 0) {
            return 0;
        }
        return 1 + countLengthString(t.substring(1));
    }

    public static void task11() {
        System.out.println("Task 11");
        int n = 1234;
        System.out.println(reverseNumber(n, countDigits(n)));
        System.out.println(countDigits(n));
    }

    public static int reverseNumber(int n, int digits) {
        if (n / 10 == 0) {
            return n;
        }
        return (int) ((n % 10) * Math.pow(10, digits - 1) + reverseNumber(n / 10, digits - 1));
    }

    public static int countDigits(int n) {
        if (n / 10 == 0) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void task12() {
        System.out.println("Task 12");
        int n = 111110;
        System.out.println(countSumOfDigits(n));
    }

    public static int countSumOfDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 + countSumOfDigits(n / 10);
    }

    public static void task13() {
        System.out.println("Task 13");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        int counter = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'f') {
//                counter++;
//            }
//        }
//        System.out.println(counter);
    }

    public static void task14() {
//        System.out.println("Task 14");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        String temp = scanner.next();
//        char c = temp.charAt(0);
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == c) {
//                System.out.println(i);
//            }
//        }
    }

    public static void task15() {
        System.out.println("Task 15");
        String s = "23uhbo543igfda321091";
        System.out.println(getNumbersFromString(s));
        System.out.println(Character.isDigit('A'));
    }

    private static String getNumbersFromString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void task16() {
        System.out.println("Task 16");
        String s = "I am he is overnight";
        String[] parts = s.split(" ");
        int min = findIndexOfShortestWord(parts);
        int max = findIndexOfLongestWord(parts);
        System.out.println(s);
        System.out.println("The length of the shortest and the longest word is " + (min + max));
    }

    private static int findIndexOfLongestWord(String[] parts) {
        int max = parts[0].length();
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() > max) {
                max = parts[i].length();
            }
        }
        return max;

    }

    private static int findIndexOfShortestWord(String[] parts) {
        int min = parts[0].length();
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() < min) {
                min = parts[i].length();
            }
        }
        return min;
    }


    public static void task17() {
        System.out.println("Task 17");
        String s = "ababx";
        System.out.println(cutSuffix((s), "ab"));
    }

    private static String cutSuffix(String s, String suffix) {
        int index = s.lastIndexOf(suffix);
        if (index == -1) {
            return "Not found";
        }
        if ((s.length() - suffix.length()) != s.lastIndexOf(suffix)) {
            return s;
        }
        return s.substring(0,index);
    }

    public static void task18() {
        System.out.println("Task 18");

    }

}
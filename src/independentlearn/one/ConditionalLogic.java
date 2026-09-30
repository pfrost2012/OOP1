package weekOne;

import java.util.Scanner;

public class ConditionalLogic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        booleanLogicShortCircuitOps();
//        booleanBitWiseOps();
//        compareStrings();
//        System.out.println("What is the certification of the film");
//        int cert = sc.nextInt();
//        System.out.println("What age are you?");
//        int age = sc.nextInt();
//        System.out.println(admitToFilm(cert,age));
//        ternaryOperator();
        switchVowelOrConsonant();
    }


    public static void preAndPostDifference() {
        int x = 5;
        int y = 10;
        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " + x++);
        System.out.println("The value of x is " + x);

        System.out.println("The value of y is " + y);
        System.out.println("The value of --y is " + --y);
        System.out.println("The value of y-- is " + y--);
        System.out.println("The value of y is " + y);
    }

    public static void booleanLogicShortCircuitOps() {
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        if (num1 < 0 && num2++ < 0) {
            System.out.println(num2);
        } else if (num1 > 0 && num2++ > 0) {
            System.out.println(num2);
        } else if (num1 == 0 || num2++ == 0) {
            System.out.println(num2);
        } else if (num1 < 0 || num2++ < 0) {
            System.out.println(num2);
        }

    }

    public static void booleanBitWiseOps() {
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        if ((num1 < 0 & num2++ < 0)) {
            System.out.println(num2);
        } else if (num1 > 0 & num2++ > 0) {
            System.out.println(num2);
        } else if (num1 == 0 | num2++ == 0) {
            System.out.println(num2);
        } else if (num1 < 0 | num2++ < 0) {
            System.out.println(num2);

        }
    }

    public static void compareStrings() {
//            System.out.println("Enter Name: ");
//            String s1 = sc.next();
//            System.out.println("Enter next Name: ");
//            String s2 = sc.next();
//            System.out.println("Using == returns "+ s1==s2);
//            System.out.println("Using equals returns "+ s1.equals(s2));
//
//            String a1 = "Sean";
//            String a2 = "Sean";
//            System.out.println("Using == returns "+ (a1 == a2));

        String namea1 = new String("Sean");
        String namea2 = new String("Sean");
        ;
        System.out.println("Using == returns " + namea1 == namea2);
    }

    public static boolean admitToFilm(int cert, int age) {
        boolean admit = (age >= cert) ? true : false;
        return admit;
    }

    public static void ternaryOperator() {
        boolean isHappy = true;
        String mood = (isHappy == true) ? "I am happy!" : "I am not happy!";
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        int minVal = (x < y) ? x : y;
        System.out.println(minVal);
        System.out.println(mood);
    }

    public static void switchVowelOrConsonant() {
        System.out.println("Enter a character: ");
        char letter = sc.next().charAt(0);
        switch (letter) {
            case 65:
            case 'a':
            case 69:
            case 'e':
            case 0b1001111:
            case 'o':
            case 0x55:
            case 'u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is a consonant");
                break;
        }
    }

    public static void ifMonth() {

        final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6, JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
        System.out.println("Enter a month 1..12:");
        int month = sc.nextInt();
        if (month == JAN) {
            System.out.println("January");
        } else if (month == FEB) {
            System.out.println("February");
        } else if (month == MAR) {
            System.out.println("March");
        } else if (month == APR) {
            System.out.println("April");
        } else if (month == MAY) {
            System.out.println("May");
        } else if (month == JUN) {
            System.out.println("June");
        } else if (month == JUL) {
            System.out.println("July");
        } else if (month == AUG) {
            System.out.println("August");
        } else if (month == SEP) {
            System.out.println("September");
        } else if (month == OCT) {
            System.out.println("October");
        } else if (month == NOV) {
            System.out.println("November");
        } else if (month == DEC) {
            System.out.println("December");
        }else {
            System.out.println(month + " is out of range");
        }
    }
}

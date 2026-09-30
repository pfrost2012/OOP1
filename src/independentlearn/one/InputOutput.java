package weekOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutput {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
//        int age = getAge();
//        System.out.println("Your age is: "+age);
//        age = getAge("What is age?");
//        System.out.println("Your age is: "+age);
//        age = getAge("Please enter your age", "Pearse");
//        System.out.println("Your age is: "+age);
        boolean pension = checkPension(68);
        System.out.println(pension);
    }

    public static int getAge(){
        System.out.println("What is your age?");
        int age = sc.nextInt();
        return age;
    }

    public static int getAge(String statement){
        int age = 0;
        try {
            System.out.println(statement);
            age = sc.nextInt();
            return age;
        } catch (InputMismatchException e) {
            e.printStackTrace();

        }
        return age;
    }

    public static int getAge(String statement,String name) {
        System.out.println("Hi " + name + ", " + statement);
        int age = 0;
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.err.println("This is not a valid age");
            age = -999;
        }
        return age;
    }

    public static boolean checkPension(int age){
        boolean result = (age >= 65) ? true : false;
        return result;
    }

    public static String getName(){
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        return name;
    }

    public static void getName(String[] names){
        System.out.println("Enter your full name: ");
        names[0] = sc.next();
        names[1] = sc.next();
    }
}

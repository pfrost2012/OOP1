package weekOne;

import java.util.Scanner;

public class WeekOneExercises {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        boolean answer = didOswaldActAlone();
        //System.out.println(answer);
        if(answer){
            System.out.println("Yes he acted alone");
        }else{
            System.out.println("No he did not");
        }
        WeekOneExercises weekOneExercises = new WeekOneExercises();
        if(weekOneExercises.wasOjGuilty()){
            System.out.println("Yes he was guilty");
        }else{
            System.out.println("No he was not guilty");
        }

        String movie = favouriteFilm();
        System.out.println("Your favourite movie is "+movie);

        System.out.println("The rating for "+movie +" is "+filmRating(movie));
    }

    public static boolean didOswaldActAlone(){
        System.out.println("Did Oswald act alone?");
        return sc.nextBoolean();
    }

    public boolean wasOjGuilty(){
        System.out.println("Did Oj do it?");
        return sc.nextBoolean();
    }

    public static String favouriteFilm(){
        System.out.println("What is your favourite movie?");
        return sc.next();
    }

    public static int filmRating(String movie){
        System.out.println("Give this movie a rating out of 10");
        return sc.nextInt();
    }
}

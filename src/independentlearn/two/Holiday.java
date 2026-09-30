package com.independentlearn.two;

public class Holiday {
    static void main() {
        goSomewhere(Direction.NORTH);
        Direction d1 = Direction.SOUTH;
        goSomewhere(d1);
    }

    public static void goSomewhere(Direction d){
        System.out.println(d);
    }
}

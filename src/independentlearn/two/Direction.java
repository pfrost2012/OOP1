package com.independentlearn.two;

public enum Direction {
    NORTH("in a Northerly direction"),
    WEST("in a Westerly direction"),
    SOUTH("in a Southerly direction"),
    EAST("in a Easterly direction");

    private String direction;

    private Direction(String direction){
        this.direction = direction;
    }
    @Override
    public String toString(){
        return "We are travelling " + direction;
    }
}

package com.independentlearn.two ;

public class EnumTest {
    private Day day;

    EnumTest(Day day){
        this.day = day;
    }

    public void tellItLikeItIs(){
        switch(day){
            case MONDAY :
                System.out.println("Mondays are bad");
                break;
            case TUESDAY : case WEDNESDAY : case THURSDAY :
                System.out.println("Midweek days are okay");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best");
                break;
        }
    }

    static void main() {
        EnumTest enumTest = new EnumTest(Day.MONDAY);
        enumTest.tellItLikeItIs();
    }

}

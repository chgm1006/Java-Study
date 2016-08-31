package com.enumexam;

/**
 * Created by Forrest on 2016. 8. 31..
 */
public class EnumExam {
    public static void main(String[] args) {
        Week day = Week.MONDAY;

        System.out.println("Week.MONDAY :: " + Week.MONDAY);
        System.out.println("day.name :: " + day.name());
        System.out.println("day.ordinal :: " + day.ordinal());
        System.out.println("Week.valueOf :: " + Week.valueOf("SATURDAY"));
        System.out.println("day.compareTo :: " + day.compareTo(Week.SATURDAY));

        for(Week w: Week.values())
            System.out.println(w);
    }
}

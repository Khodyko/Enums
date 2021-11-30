package com.company.web;

import java.util.*;

import static com.company.web.Day.Mon_;

public class Main {

    public static void main(String[] args) {
//        //Task 1
//        Day t1 = Mon_;
//        System.out.println(t1.name());
//        System.out.println(t1.toString());
//        System.out.println(t1.ordinal());
//        //Task 3
//        String t2 = "Mon_";
//        String t2_3 = "abc";
//        Day t2_1 = Day.valueOf(t2);
//        System.out.println(t2_1.name());
//        //Day t2_2= Day.valueOf(t2_3); //invalid
//        //Task 4
//        List<Day> days = Arrays.asList(Day.values());
//        //Task 5
//        String t5_1 = "Mon_1";
//        String t5_2 = "abc";
//        //Optional<Day> day=Day.values();
//        String result = null;
//        for (Day day : Day.values()) {
//            if (day.name().equals(t5_1)) {
//                result = day.name();
//            }
//        }
//        Optional<String> opt = Optional.ofNullable(result);
//        opt.ifPresent(System.out::println);
        //Task 6
        Day t6_1 = Mon_;
        Day t6_2 = Mon_;
        System.out.println(t6_1 == t6_2);
        System.out.println(t6_1.equals(t6_2));
//        //Task 10
//        Day t10_1 = Mon_;
//        Day t10_2 = Mon_;
//        switch (t10_1) {
//            case Mon_: {
//                System.out.println("victory!");
//                break;
//            }
//            default: {
//                System.out.println("Lose");
//            }
//        }
//        // Task 13
//        EnumSet<Day> t13_1 = EnumSet.of(Day.Thu_, Day.Sat_);
//        EnumMap<Day, String> t13_2 = new EnumMap<Day, String>(Day.class);
//        t13_2.put(Mon_, "понедельник");
//        //Task 11
//        Operator day = new Operator(Mon_);
//        Operator day2 = new Operator(Mon_);
//        System.out.println(day.getEnumString());

    }
}

package lesson_47_2023_11_09.enum_set;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Volodymyr Sh on 09.11.2023
 * project name: AIT_Lessons
 */
public class EnumSetExample {
    public static void main(String[] args) {
        Set<Day> days = EnumSet.allOf(Day.class);
        System.out.println("days: " + days);

        Set<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SATURDAY);
        System.out.println("weekend: " + weekend);

        Set<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println("workDays: " + workDays);

        Set<Day> week = EnumSet.complementOf(EnumSet.allOf(Day.class));

        EnumSet<Day> week2 = EnumSet.copyOf(workDays);
        week2.addAll(weekend);
        System.out.println("week2: " + week2);

        days.remove(Day.MONDAY);
        System.out.println("days.remove: " + days);

        for (Day day : days){
            if (day == Day.SATURDAY){
                days.remove(Day.SATURDAY);
            }
        }

        System.out.println("days.remove.MONDAY: " + days);


    }
}

package Exercise._Sets;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println(days);

        Set<String> days2 = new LinkedHashSet<>();
        days2.add("Monday");
        days2.add("Tuesday");
        days2.add("Wednesday");
        days2.add("Thursday");
        days2.add("Friday");
        days2.add("Saturday");
        days2.add("Sunday");

        System.out.println(days2);

        boolean isEqual = days2.equals(days);

        System.out.println("Is the first Set equal to the second one? " + (isEqual));




    }
}

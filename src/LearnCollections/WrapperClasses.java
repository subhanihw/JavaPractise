package LearnCollections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;


public class WrapperClasses {
    public static void main(String[] args)
    {
        Person person = new Person("Mouli", 1);
        System.out.println(person);
        String s = "10038.8";
        Float ss = Float.valueOf(s);
        System.out.println(ss);
        Integer integer = Integer.valueOf("2323");
        Integer integer1 = 2323;
        LocalDate now = LocalDate.now();
        LocalDateTime DateTimeNow = LocalDateTime.now();
        LocalTime LocalTimeNow = LocalTime.now();
        System.out.println(now);
        LocalDate yesterday = LocalDate.of(2023, 10, 9);
        System.out.println(yesterday);

        // Finding given array is in sorted order
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] array2 = array.clone();
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array2, array));

    }
}

package LearnCollections;

import java.util.*;
import java.util.stream.Collectors;

public class SetEx {
    public static void main(String[] args) {
        List<String> characters = List.of("Naruto", "Sasuke", "Kakashi");
        Set<String> set = new HashSet<>(characters);
        for(String item: set) {
            if (item.equals("Sasuke"))
                System.out.println("Found");
        }
        set.forEach(System.out::print);
        System.out.println(set);
        Set<String> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSet);

        Set<String> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet);

        int[] arr = new int[] {65, 54, 44, 34, 12, 99};
        TreeSet<Integer> set1 = new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        Integer max = set1.last();
        Integer secMax = set1.lower(max);
        System.out.println(secMax);

        System.out.println(set1.subSet(set1.first(),true, set1.last(), true));
        System.out.println(set1.subSet(34, 54));
        System.out.println(set1.subSet(34,true, 54, true));
        System.out.println(set1.headSet(50));
        System.out.println(set1.tailSet(50));
    }
}

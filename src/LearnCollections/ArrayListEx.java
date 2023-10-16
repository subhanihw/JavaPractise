package LearnCollections;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        for(int i:arr) {
            System.out.println(i);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }
        list1.forEach(i -> System.out.print(i + ","));
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = List.of(1,2,3,45);
        System.out.println(list + " " + list2);

        List<String> sh = new ArrayList<>(Arrays.asList("Batman", "Superman", "Ironman", "Spiderman", "Thor", "Hulk"));
//        // Below loop raises ConcurrentModificationException because we can't use remove method in for each loop
//        for (String hero:sh) {
//            if (hero.endsWith("man")) {
//                sh.remove(hero);
//            }
//        }
        // Use Iterator instead of for each loop
        Iterator<String> iterator = sh.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("man"))
                iterator.remove();
        }
        System.out.println(sh);
        List value = new ArrayList<>(Arrays.asList("A", 1, 2, 1));
        System.out.println(value);
        // For raw types we need to cast the values to respective data types to use them
        String a = (String) value.get(0);
        Integer ah = (Integer) value.get(1);
        System.out.println(value.get(1).getClass().getName());

        List<Integer> arraylist = new ArrayList<>(Arrays.asList(1,4,2,8,10,-1));
        Collections.sort(arraylist);
        System.out.println(arraylist);

        List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Naruto", 11),
                new Person("Sasuke", 2)));
        Collections.sort(persons);
        System.out.println(persons);

        // Desc Order
        Collections.sort(persons, new DescPersons());
        System.out.println(persons);
    }
}

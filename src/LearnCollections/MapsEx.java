package LearnCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapsEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("Naruto", 18, "Sasuke", 20));
        hashMap.put("Itachi", 23);
        hashMap.put(null, 0);
        hashMap.put("Sasuke", 18);
        hashMap.getOrDefault("Mouli", 10);
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        Hashtable<String, Integer> hashtable = new Hashtable<>(Map.of("Naruto", 18, "Sasuke", 20));
        hashtable.put("Itachi", 23);
        // hashtable.put(null, 0); // Raises Error
        hashtable.put("Sasuke", 18);
        System.out.println(hashtable);
        System.out.println(hashtable.keySet());
        System.out.println(hashtable.values());

        // Occurrences of characters in string
        String str = "Namaste Bro";
        TreeMap<Character, Integer> freq = new TreeMap<>();
        for (char ch: str.toLowerCase().toCharArray()) {
            if (ch != ' ')
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
    }
}

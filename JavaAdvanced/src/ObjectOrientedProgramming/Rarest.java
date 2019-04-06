package ObjectOrientedProgramming;

import java.util.*;

public class Rarest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alyssa", 22);
        map.put("Char", 25);
        map.put("Dan", 25);
        map.put("Jeff", 20);
        map.put("Kasey", 20);
        map.put("Kim", 20);
        map.put("Mogran", 25);
        map.put("Ryan", 25);
        map.put("Stef", 22);

        System.out.println(rarest(map));
    }

    private static int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>();

        for (String s : map.keySet()) {
            int num = map.get(s);
            if (result.containsKey(num)) {
                result.put(num, result.get(num) + 1);
            } else {
                result.put(num, 1);
            }
        }

        Set<Integer> setKey = result.keySet();
        Iterator<Integer> i1 = setKey.iterator();
        int min = i1.next();

        while (i1.hasNext()) {
            int current = i1.next();
            if (result.get(current) < result.get(min)) {
                min = current;
            }
        }
        return min;
    }
}
/*
Exercise 1.10*:
Write a method rarest that accepts a map whose keys are strings and whose values are integers as a parameter and returns
the integer value that occurs the fewest times in the map. If there is a tie, return the smaller integer value. If the
map is empty, throw an exception.
For example, suppose the map contains mappings from students' names (strings) to their ages (integers). Your method
would return the least frequently occurring age. Consider a map variable m containing the following key/value pairs:
{Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25, Ryan=25, Stef=22}
Three people are age 20 (Jeff, Kasey, and Kim), two people are age 22 (Alyssa and Stef), and four people are age 25
(Char, Dan, Mogran, and Ryan). So a call of rarest(m) returns 22 because only two people are that age.
If there is a tie (two or more rarest ages that occur the same number of times), return the youngest age among them.
For example, if we added another pair of Kelly=22 to the map above, there would now be a tie of three people of age 20
(Jeff, Kasey, Kim) and three people of age 22 (Alyssa, Kelly, Stef). So a call of rarest(m) would now return 20 because
20 is the smaller of the rarest values.
Made by Vladislav Velinov.
*/

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
        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            int num = map.get(iterator.next());
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
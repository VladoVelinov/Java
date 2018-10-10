package datastructures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> mymap = new HashMap<>();

        mymap.put("Sofia", 1000);
        mymap.put("Plovdiv", 103);
        mymap.put("Burgas", 63);
        mymap.put("Pernik", 4);

        for(String key : mymap.keySet()){
            System.out.println(mymap.get(key));
            mymap.replace(key, 0);
        }

        System.out.println("================");
        for(String key : mymap.keySet()){
            System.out.println(mymap.get(key));

        }
    }
}
package datastructures.tasks;

import datastructures.LinkedList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(2);
        ll.add(7);
        ll.add(8);
        ll.add(1);

        int n = ll.getNumberOfElements();
        for (int i = 0; i <= n; i++) {
            System.out.println(ll.get(i));
        }
        System.out.println("====================");
        //code to remove duplicates
        //n = removeDuplicates(ll, n);

        //remove duplicates version using hashset
        HashSet<Integer> uniques = new HashSet<>();

        for (int i = 0; i <= n; i++) {
            int data = ll.get(i);
            if(!uniques.add(data)){
                ll.remove(i);
                n--;
            }
        }


        for (int i = 0; i <= n; i++) {
            System.out.println(ll.get(i));
        }
    }

    private static int removeDuplicates(LinkedList<Integer> ll, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if(ll.get(i) == ll.get(j)) {
                    ll.remove(j);
                    n--;
                }
            }
        }
        return n;
    }
}
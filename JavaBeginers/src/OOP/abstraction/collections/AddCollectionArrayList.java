package OOP.abstraction.collections;

import java.util.ArrayList;

public class AddCollectionArrayList<T> implements AddCollection<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public int add(T str) {
        this.arrayList.add(str);

        return arrayList.size() - 1;
    }
}
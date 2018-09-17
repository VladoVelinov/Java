package OOP.abstraction.collections;

import java.util.ArrayList;

public class AddRemoveCollectionArrayList<T> implements AddRemoveCollection<T>{
    protected ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public int add(T str) {
        arrayList.add(0, str);
        return 0;
    }

    @Override
    public T remove() {
        int index = arrayList.size() - 1;
        T result = arrayList.get(index);
        arrayList.remove(index);

        return result;
    }
}
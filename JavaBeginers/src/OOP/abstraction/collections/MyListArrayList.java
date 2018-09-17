package OOP.abstraction.collections;

public class MyListArrayList<T> extends AddRemoveCollectionArrayList<T> implements MyList<T>{
    @Override
    public T remove() {
        T res = (T)this.arrayList.get(0);
        this.arrayList.remove(0);

        return res;
    }

    @Override
    public int used() {
        return this.arrayList.size();
    }
}
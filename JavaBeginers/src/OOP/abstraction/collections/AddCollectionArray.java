package OOP.abstraction.collections;

public class AddCollectionArray<T> implements AddCollection<T>{
    private Object[] array;
    private int index = 0;

    public AddCollectionArray(int size){
        this.array = new Object[size];
    }

    @Override
    public int add(T str) {
        this.array[index] = str;
        index++;

        return index - 1;
    }
}
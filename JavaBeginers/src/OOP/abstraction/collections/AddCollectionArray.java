package OOP.abstraction.collections;

public class AddCollectionArray implements AddCollection{
    private String[] array;
    private int index = 0;

    public AddCollectionArray(int size){
        this.array = new String[size];
    }

    @Override
    public int add(String str) {
        this.array[index] = str;
        index++;

        return index - 1;
    }
}
package OOP.abstraction.collections;

public class AddRemoveCollectionArray<T> implements AddRemoveCollection<T>{
    protected Object[] array;
    protected int numberOfElements = 0;

    public AddRemoveCollectionArray(int size){
        this.array = new Object[size];
    }

    @Override
    public int add(T str) {
        this.shift();
        this.array[0] = str;
        this.numberOfElements++;

        return 0;
    }

    @Override
    public T remove() {
        int index = numberOfElements - 1;
        numberOfElements--;
        return (T)array[index];
    }

    protected void shift(){
        if(numberOfElements == 0)
            return;

        for (int i = numberOfElements - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
    }
}
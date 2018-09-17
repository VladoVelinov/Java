package OOP.abstraction.collections;

public class MyListArray<T> extends AddRemoveCollectionArray<T> implements MyList<T>{
    public MyListArray(int size){
        super(size);
    }

    @Override
    public T remove() {
        T res = (T)array[0];
        this.leftShift();
        numberOfElements--;

        return res;
    }

    @Override
    public int used() {
        return this.numberOfElements;
    }

    private void leftShift(){
        if(numberOfElements == 1)
            return;

        for (int i = 1; i < array.length ; i++) {
            array[i - 1] = array[i];
        }
    }
}
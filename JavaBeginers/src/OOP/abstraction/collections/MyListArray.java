package OOP.abstraction.collections;

public class MyListArray extends AddRemoveCollectionArray implements MyList{
    public MyListArray(int size){
        super(size);
    }

    @Override
    public String remove() {
        String res = array[0];
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
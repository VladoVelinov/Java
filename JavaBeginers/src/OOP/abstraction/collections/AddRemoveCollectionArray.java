package OOP.abstraction.collections;

public class AddRemoveCollectionArray implements AddRemoveCollection{
    protected String[] array;
    protected int numberOfElements = 0;

    public AddRemoveCollectionArray(int size){
        this.array = new String[size];
    }

    @Override
    public int add(String str) {
        this.shift();
        this.array[0] = str;
        this.numberOfElements++;

        return 0;
    }

    @Override
    public String remove() {
        int index = numberOfElements - 1;
        numberOfElements--;
        return array[index];
    }

    protected void shift(){
        if(numberOfElements == 0)
            return;

        for (int i = numberOfElements - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
    }
}
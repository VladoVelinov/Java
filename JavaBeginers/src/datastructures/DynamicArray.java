package datastructures;

public class DynamicArray<T> {
    private Object[] array;
    private int numberOfElements;
    private int capacity = 5;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    //Add element
    public void addToTail(T item){
        if(this.isFull()){
            expandArray();
        }

        this.array[numberOfElements] = item;
        numberOfElements++;
    }

    //remove element
    public void remove(int index){
        if(index >= numberOfElements)
            throw new IndexOutOfBoundsException();

        this.array[index] = null;
        this.shift(index);
        numberOfElements--;
    }

    //get by index
    public T get(int index){
        if(index >= capacity)
            throw new IndexOutOfBoundsException();

        return (T)this.array[index];
    }
    //set by index

    public void set(int index, T item){
        if(index >= capacity)
            throw new IndexOutOfBoundsException();

        this.array[index] = item;
    }
    public int getNumberOfElements() {
        return numberOfElements;
    }

    private void expandArray() {
        this.capacity  *= 2;
        Object[] newArray = new Object[capacity];

        for (int i = 0; i < numberOfElements; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private boolean isFull(){
        return numberOfElements == capacity;
    }

    private void shift(int startIndex){
        if(numberOfElements == 0)
            return;

        for (int i = startIndex; i < numberOfElements - 1; i++) {
            array[i] = array[i + 1];
        }
    }
}
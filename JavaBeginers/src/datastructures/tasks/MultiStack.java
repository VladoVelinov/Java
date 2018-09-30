package datastructures.tasks;

public class MultiStack<T> {
    Object[][] hiddenArr;

    private final int NUMBER_OF_STACKS = 3;
    private int[] counts = new int[NUMBER_OF_STACKS];

    public MultiStack(int size){
        hiddenArr = new Object[NUMBER_OF_STACKS][size];
    }

    public void push(int stackNum,T item){
        if(counts[stackNum] >  hiddenArr[stackNum].length - 1)
            return;

        hiddenArr[stackNum][counts[stackNum]] = item;
        counts[stackNum]++;
    }

    public void pop(int stackNum){
        hiddenArr[stackNum][counts[stackNum] - 1] = null;
        counts[stackNum]--;
    }

    public T peek(int stackNum){
        return (T)hiddenArr[stackNum][counts[stackNum] - 1];
    }

    public boolean isEmpty(int stackNum){
        return counts[stackNum] == 0;
    }
}
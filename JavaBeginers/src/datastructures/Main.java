package datastructures;

import datastructures.tasks.MultiStack;

public class Main {
    public static void main(String[] args) {
        MultiStack();
    }

    private static void MultiStack() {
        MultiStack<String> ms = new MultiStack<>(3);

        ms.push(0, "st1-0");
        ms.push(0, "st1-1");
        ms.push(0, "st1-2");
        ms.push(1, "st2-0");
        ms.push(1, "st2-1");
        ms.push(1, "st2-2");
        ms.push(0, "st1-0");
        ms.push(2, "st3-0");
        ms.push(2, "st3-4");

        for (int i = 0; i < 3; i++) {
            printStack(ms, i);
        }
    }

    private static void printStack(MultiStack<String> ms, int n) {
        while(!ms.isEmpty(n)){
            System.out.println(ms.peek(n));
            ms.pop(n);
        }
    }

    private static void queueMain() {
        Queue<Integer> myqueue = new Queue<>();

        myqueue.add(1);
        myqueue.add(2);
        myqueue.add(3);
        myqueue.add(null);
        myqueue.add(5);
        myqueue.add(6);

        while(!myqueue.isEmpty()){
            System.out.println(myqueue.remove());
        }
    }

    private static void stackMain(){
        Stack<Integer> myStack = new Stack<>();

        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
            System.out.println(myStack.peek());
        }

        myStack.pop();
    }

    private static void linkedListMain() {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("asd0");
        ll.add("asd1");
        ll.add("asd2");
        ll.add("asd3");
        ll.add("asd4");
        ll.add("asd5");

        ll.remove(5);
        ll.remove(0);
        ll.remove(3);

        for (int i = 0; i <= ll.getNumberOfElements(); i++) {
            System.out.println(ll.get(i));
        }
    }

    private static void dynamicArrayMain() {
        DynamicArray<String> myDynArr = new DynamicArray<>();
        System.out.printf("Capacity: %d%n", myDynArr.getCapacity());

        myDynArr.addToTail("aasd0");
        myDynArr.addToTail("aasd1");
        myDynArr.addToTail("aasd2");
        myDynArr.addToTail("aasd3");
        myDynArr.addToTail("aasd4");

        System.out.printf("Capacity: %d%n", myDynArr.getCapacity());
        myDynArr.remove(4);

        for (int i = 0; i < myDynArr.getNumberOfElements(); i++) {
            System.out.println(myDynArr.get(i));
        }

        System.out.println(myDynArr.getNumberOfElements());
    }
}
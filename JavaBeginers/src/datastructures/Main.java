package datastructures;

public class Main {
    public static void main(String[] args) {
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
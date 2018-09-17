package datastructures;

public class LinkedList<T> {
    private class Node<T>{
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int numberOfElements = 0;

    public void add(T item){
        if(head == null){
            head = new Node<>(item);
            return;
        }

        Node<T> current = head;
        Node<T> nextNode = current.next;

        while(current.next != null){
            current = nextNode;
            nextNode = nextNode.next;
        }

        current.next = new Node<>(item);
        numberOfElements++;
    }

    public void remove(int index){
        if(index > numberOfElements)
            return;

        if(head == null)
            return;

        if(index == 0) {
            head = head.next;
            numberOfElements--;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
        current.next = null;
        numberOfElements--;
    }

    public T get(int index){
        if(head == null)
            return null;

        Node<T> res = head;
        for (int i = 0; i < index; i++) {
            if(res == null)
                break;

            res = res.next;
        }

        if(res == null)
            return null;

        return res.data;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }
}
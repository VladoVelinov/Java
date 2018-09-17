package datastructures;

public class Stack<T> {
    private StackNode<T> head;

    public void push(T item){
        StackNode<T> node = new StackNode<>(item);

        node.next = head;
        head = node;
    }

    public void pop(){
        if(!isEmpty())
            head = head.next;
    }

    public T peek(){
        if(isEmpty())
            return null;

        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }

    private class StackNode<T>{
        T data;
        StackNode next;

        public StackNode(T data) {
            this.data = data;
        }
    }
}
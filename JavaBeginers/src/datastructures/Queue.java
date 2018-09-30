package datastructures;

public class Queue<T> {
    private QueueNode<T> head;
    private QueueNode<T> tail;

    //add
    public void add(T data){
        QueueNode<T> item = new QueueNode<>(data);

        if(head  == null && tail == null){
            head = item;
            tail = item;
        }

        tail.next = item;
        tail = item;
    }

    //remove
    public T remove() {
        if(isEmpty())
            return null;

        T res = head.data;
        if(head == tail){
            tail = null;
        }

        head = head.next;

        return res;
    }

    public boolean isEmpty(){
        return head  == null && tail == null;
    }

    private class QueueNode<T>{
        T data;
        QueueNode next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

}
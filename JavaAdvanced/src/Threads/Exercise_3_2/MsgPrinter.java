package Threads.Exercise_3_2;

class MsgPrinter{
    private String  currentMessage;

    void printMsg( String msg ){
        synchronized (this) {
            currentMessage = msg;
        }
        System.out.println(Thread.currentThread().getName() + " prints " + currentMessage);
    }
}
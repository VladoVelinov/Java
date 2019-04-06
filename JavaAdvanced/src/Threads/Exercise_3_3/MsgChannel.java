package Threads.Exercise_3_3;

class MsgChannel{
    private String message = null;

    synchronized String getMessage() {
        try {
            while( message == null ) {
                System.out.println(Thread.currentThread().getName() + " waiting");
                wait();
            }
            String outMsg = message;
            message = null;
            notifyAll();
            return outMsg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    synchronized void setMessage(String message) {
        try {
            while( this.message != null ) {
                System.out.println(Thread.currentThread().getName() + " waiting");
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " setting message " + message);
            this.message = message;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
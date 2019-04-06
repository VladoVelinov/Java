package Threads.Exercise_3_2;

class MsgGenerator implements Runnable{
    private MsgPrinter msgPrinter;
    private String message;

    MsgGenerator(MsgPrinter msgPrinter, String msg) {
        this.msgPrinter = msgPrinter;
        this.message = msg;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 2; i++){
                msgPrinter.printMsg(message);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
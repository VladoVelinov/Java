package Threads.Exercise_3_3;

class MsgConsumer implements Runnable{

    private MsgChannel channel;

    MsgConsumer(MsgChannel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        System.out.println("Consumer start");
        try{
            for(int i = 0; i < 15; i++){
                String currentMsg = channel.getMessage();
                System.out.println("Consumer: " + currentMsg);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Consumer End");
    }
}
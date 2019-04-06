package Threads.Exercise_3_3;

class MsgProducer implements Runnable{

    private MsgChannel channel;

    MsgProducer(MsgChannel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        try{
            for(int i = 0; i < 5; i++){
                channel.setMessage(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
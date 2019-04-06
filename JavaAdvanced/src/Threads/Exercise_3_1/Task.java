package Threads.Exercise_3_1;

class Task implements Runnable {
    static int count = 0;

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " starting ...");
            for(int i = 0; i < 100; i++){
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(1);
                synchronized (Task.class) {
                    count = count + 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
package demo2;

public class ThreadOne implements Runnable {
    private Object lock;
    public ThreadOne(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 0; i < 52; i+=2){
            synchronized(this.lock){
                System.out.print(i);
                System.out.print(i+1);
                try{
                    lock.notify();
                    lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

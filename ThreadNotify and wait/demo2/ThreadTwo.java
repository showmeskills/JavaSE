package demo2;

public class ThreadTwo implements Runnable {
    private Object lock;

    public ThreadTwo(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        char[] chars = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        for (int i=0;i<chars.length;i++) {

            synchronized (lock) {
                System.out.println(chars[i]);

                try {
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }     
    }
}

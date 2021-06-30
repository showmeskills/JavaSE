package demo2;

public class Demo02 {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(new ThreadOne(lock));
        Thread t2 = new Thread(new ThreadTwo(lock));
        t1.start();
        t2.start();
    }

}

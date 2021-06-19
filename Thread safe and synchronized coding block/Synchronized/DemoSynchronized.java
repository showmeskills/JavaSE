package Synchronized;


public class DemoSynchronized {
    public static void main(String[] args){
        //必须是访问同一run方法或者是共享的数据
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}

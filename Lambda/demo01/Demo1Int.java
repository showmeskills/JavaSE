package demo01;

public class Demo1Int implements Runnable {
    @Override
    public void run (){
        System.out.println(Thread.currentThread().getName()+"new Thread have been done");
    }
}

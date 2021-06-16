package setName;

public class Test {
    public static void main(String[] args) {
        MyThread threadDemo = new MyThread();
        // setName方法
        threadDemo.setName("T1");
        threadDemo.start();

        new MyThread("T2").start();
        new MyThread("T3").start();

        // main 线程
        System.out.println(Thread.currentThread().getName());// main
    }
}

package methodThree;

public class Test {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        DemoThread run = new DemoThread();
        // 创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        // 调用start方法开启多线程
        t0.setName("t0");
        t1.setName("t1");
        t2.setName("t2");
        t0.start();
        t1.start();
        t2.start();
    }
}

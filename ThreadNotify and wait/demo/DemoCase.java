package demo;

/*
    等待唤醒案例:线程之间的通信
        创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法,放弃cpu的执行,进入到waiting状态(无限等待状态)
        创建一个老板线程(生产者):花了5秒做包子,做包子之后,调用notify方法,唤醒顾客吃包子
    注意:
        顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个执行
        同步使用的锁对象必须保证唯一
        只有锁对象调用wait和notify方法
    Object 类中的方法
    void wait () 
        在其它线程调用次对象的notify()方法或notifyAll()方法钱,导致当前线程等待.
    void notify()
        唤醒在此对象监视器上等待的单个线程
        会继续执行wait方法之后的代码

*/

public class DemoCase {
    public static void main(String[] args) {
        // 创建锁对象,保证唯一
        Object obj = new Object();
        // 创建一个顾客线程(消费者)
        new Thread() {
            @Override
            public void run() {
                // 一直等着买包子
                while (true) {
                    // 保证等待和唤醒的线程只能又一个执行,需要使用同步技术
                    synchronized (obj) {
                        System.out.println("告知老板要的包子的种类和数量");
                        // 调用wait方法,放弃cpu的执行,进入waiting状态(无限等待)
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了,开吃!");
                        System.out.println("----------------------------");
                    }
                }
            }
        }.start();
        // 创建一个老板的线程
        new Thread() {
            @Override
            public void run() {
                while(true){
                    try{
                        //sleep 方法不在写在同步代码块里面,因为它不会释放锁
                        Thread.sleep(5000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(obj){
                        System.out.println("老板5秒钟之后作保包子,告知顾客,可以吃包子了");
                        //做好包子之后,调用notify方法,唤醒顾客吃包子
                        obj.notify();
                    }
                }
            }
        }.start();

    }
}

package demo;

/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m) 方法,在毫秒值结束之后,线程睡醒进入到Runnbale/Blocked状态
    2.使用wait(long m) 方法,wait方法如果在毫秒值结束之后,如没有被notify唤醒,就会自动唤醒,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
        void notify()唤醒在此对象监视器上等待的个人线程
        void notifyAll() 唤醒在此对象监视器上等待的所有线程

*/
public class DemoCase2 {
    public static void main(String[] args) {
        Object obj = new Object();
        // 顾客1
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("顾客1告知老板要的包子的种类和数量");
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了,顾客1开吃!");
                        System.out.println("----------------------------");
                    }
                }
            }
        }.start();

        // 顾客2
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("顾客2告知老板要的包子的种类和数量");
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了,顾客2开吃!");
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
                                //唤醒所有等待顾客
                                obj.notifyAll();
                                //obj.notify 如果有多个线程随机唤醒一个
                            }
                        }
                    }
                }.start();
    }
}

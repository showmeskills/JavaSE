package demo2;

public class Demo03 {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                int meter = 0;
                boolean isFlag = true;
                while (isFlag) {
                    synchronized (obj) {
                        meter++;
                        System.out.println("兔子" + meter + "米");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }.start();

        new Thread() {
            public void run() {
                int meter = 0;
                boolean isFlag = true;
                while (isFlag) {
                    synchronized (obj) {
                        meter++;
                        System.out.println("乌龟" + meter + "米");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        // sleep 方法不在写在同步代码块里面,因为它不会释放锁
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        // 唤醒所有等待顾客
                        obj.notifyAll();
                        // obj.notify 如果有多个线程随机唤醒一个
                    }
                }
            }
        }.start();
    }
}

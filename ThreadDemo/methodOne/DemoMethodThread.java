package methodOne;


public class DemoMethodThread implements Runnable {
    private int ticket = 100;
    // 创建一个锁对象
    Object obj = new Object();

    @Override
    public void run (){
         // 使用死循环,让卖票重复执行
         while (true) {
            // 添加同步代码块
            synchronized (obj) {
                // 先判断票是否存在
                if (ticket > 0) {
                    // 提高安全问题出现的概率,让程序睡眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 票存在,卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    this.ticket--;
                }
            }
         }
    }
}
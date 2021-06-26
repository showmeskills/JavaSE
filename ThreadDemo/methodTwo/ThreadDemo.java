package methodTwo;

public class ThreadDemo implements Runnable {
    // private static int tickets = 100;
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            // buyTicketsStatic();
            buyTickets();
        }
    }

    /*
     * static method priority to this class, and thus it had not ThreadDemo;
     */
    // public static /* synchronized */ void buyTicketsStatic() {
    //     synchronized (ThreadDemo.class) {
    //         if (tickets > 0) {
    //             try {
    //                 Thread.sleep(10);
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //             System.out.println(Thread.currentThread().getName() + "----->正在卖第" + tickets + "张票");
    //             tickets--;
    //         }
    //     }
    // }

    public void buyTickets(){
        synchronized(this){
            if(tickets>0){
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"----->正在卖第"+tickets+"张票");
                tickets--;
            }
        }
    }
}

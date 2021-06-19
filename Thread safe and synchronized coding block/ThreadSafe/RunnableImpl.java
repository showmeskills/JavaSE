package ThreadSafe;

public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket = 100;
    @Override
    public void run(){
        //使用死循环,让卖票重复执行
        while(true){
            //先判断票是否存在
            if(this.ticket > 0){
                //提高安全性问题,让程序睡眠
                try{
                    Thread.sleep(10);
                }catch(Exception e){
                    e.printStackTrace();
                }
                //票存在,卖票
                System.out.println(Thread.currentThread().getName()+"正在卖第"+this.ticket+"张票");
                this.ticket--;
            }

        }
    }
}
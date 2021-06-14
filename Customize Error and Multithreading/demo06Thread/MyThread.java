package demo06Thread;
/*
    创建一个线程的子类
*/
public class MyThread extends Thread{
    //在Thread的子类中重写Thread类中run方法,设置线程任务
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("run: "+i);
        }
    }
}

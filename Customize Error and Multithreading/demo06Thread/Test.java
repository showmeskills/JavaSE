package demo06Thread;



/*
    创建多线程程序的第一种方式:创建Thread的子类
    Thread:是描述线程的类,我们需要实现多线程程序,就必须继承Thread类
    重写run 方法
    实例Thread的子类时候调用start方法开启多线程运行
    void start 使该线程执行Java虚拟机调用该线程的run方法
    java程序属于抢占式调度,哪个线程的优先级更高,哪个线程先执行,同一个级别,随机执行一个
*/
public class Test {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();

        for(int i = 0; i <20;i++){
            System.out.println("main: "+i);
        }
    }
}

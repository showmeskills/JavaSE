package getName;
/*
    常用API
    1.使用Thread类中的方法getName()
        String getName() 返回该线程的名称
    2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
        static Thread currentThread() 返回当前正在执行的线程对象的引用;

*/
public class ThreadDemo extends Thread{
    @Override
    public void run (){
        //  String getName() 返回该线程的名称
        // String name = getName();
        // System.out.println(name);

        // static Thread currentThread() 返回当前正在执行的线程对象的引用
        // Thread t = Thread.currentThread();
        // System.out.println(t);//Thread[Thread-0,5,main] 意思是当前执行的线程-0,优先级5,在main方法里运行
        // String name = t.getName();
        // System.out.println(name);

        //链式调用 输出当前所有线程 Thread-0,Thread-1,Thread-2; 
        System.out.println(Thread.currentThread().getName());//可以直接所有所有线程名
    }
}
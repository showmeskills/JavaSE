package setName;
/*
    设置线程名字有两中方法
    1.使用Thread 类中的方法setName(名字)
        void setName(String name) 改变线程名称,使之参数name相同
    2.创建一个带参数的构造器方法参数传递线程的名称;调用父类的带参构造器,把线程名称传递给父类
        Thread(String name) 分配新的Thread对象
    

*/
public class MyThread extends Thread{
    public MyThread(){}
    public MyThread(String name){
        super(name);//把name参数传递给父类Thread 中的 setName
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

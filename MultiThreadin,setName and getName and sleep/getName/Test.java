package getName;
/*
    线程的名称:
        主线程:main
        新线程:Thread-0,Thread-1,Thread-2

*/
public class Test {
    public static void main(String[] args){
         ThreadDemo threadDemo = new ThreadDemo();
             //Thread - 0/1/2
        threadDemo.start();

        new ThreadDemo().start();
        new ThreadDemo().start();

        //main 线程
        System.out.println(Thread.currentThread().getName());//main
    }
}

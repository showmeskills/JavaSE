package LambdaThread;

public class Lambda02 {
    public static void main(String[] args){
        new Thread(()->{
            for(int i=0; i<50;i++){
                System.out.println(Thread.currentThread().getName()+"runing1");
            }
        }).start();
        new Thread(()->{
            for(int i=0; i<50;i++){
                System.out.println(Thread.currentThread().getName()+"runing2");
            }
        }).start();
    }
}

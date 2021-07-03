package LambdaThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class LambdaThread {
    public static void main (String[] args){
        //ExecutorService threadPool = Executors.newSingleThreadExecutor();
        //ExecutorService threadPool = Executors.newFixedThreadPool(4);
        ExecutorService threadPool = Executors.newCachedThreadPool();
        try{
            for (int i = 0; i < 100; i++){
                threadPool.execute(()->System.out.println(Thread.currentThread().getName()+"current thread"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            threadPool.shutdown();
        }
    }
}

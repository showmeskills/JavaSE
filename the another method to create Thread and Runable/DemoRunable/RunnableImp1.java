package DemoRunable;
import java.lang.Runnable;
import java.lang.Thread;

public class RunnableImp1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i <20;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
package demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
public class Demo01 {
    public static void main(String[] args){
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new Demo1Int());
        es.submit(new Demo1Int());
        es.submit(new Demo1Int());
        es.shutdown();
    }
}
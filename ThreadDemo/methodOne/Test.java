package methodOne;

public class Test {
    public static void main(String[] args){
      //必须是访问同一run方法或者是共享的数据
      DemoMethodThread run = new DemoMethodThread();
      Thread t0 = new Thread(run);
      Thread t1 = new Thread(run);
      Thread t2 = new Thread(run);
      t0.setName("tt0");
      t1.setName("tt1");
      t2.setName("tt2");
      t0.start();
      t1.start();
      t2.start();
    }
}

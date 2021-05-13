public interface DefaultInterface {
    public default void method(){
        System.out.println("我是接口中的默认方法,没有被重写");
    }
    public abstract void eat();
}

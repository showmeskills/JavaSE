public interface A{
    public abstract void showA();
    public default void showB(){
        System.out.println("this is an interface a default method");
    }
    static void showStatic(){
        System.out.println("this is an interface a static method");
    }
}
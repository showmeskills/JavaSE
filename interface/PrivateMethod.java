public interface PrivateMethod {
    private void methodProviate(){
        System.out.println("private method in interface");
    }
    private static void methodPrivateStatic(){
        System.out.println("private static method in interface");
    }
    public default void method(){
        //调用非静态私有方法
        this.methodProviate();
        //调用静态私有方法
        PrivateMethod.methodPrivateStatic();
    }
}

package demo;

public class Person {
    static int a;
    //静态代码块
    static {
        a = 0;
        System.out.println("静态代码块先执行"+a);
    }

    public Person() {
        System.out.println("构造方法执行");
    }
}

package demo;

public class MyClass {
    int num =5;//成员变量
    static int numStatic;//静态变量

    //成员方法
    public void method(){
        System.out.println("this is memeber method");
        //成员方法可以访问成员变量
        System.out.println(this.num);
        //访问静态成员
        System.out.println(MyClass.numStatic);
        methodStatic();
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("this is a static memeber method");
        //静态方法访问静态属性
        System.out.println(numStatic);
        //静态方法访问非静态成员==>会报错System.out.println(num);
        //静态方法不能访问非静态成员和this
        //如何静态方法想使用非静态属性和方法,可以使用实例对象后调用属性
        MyClass myClass = new MyClass();
        System.out.println("===>"+myClass.num);
        myClass.method();
    }
}

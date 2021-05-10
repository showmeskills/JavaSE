/*
抽象方法,就是加上了abstract关键字,然后去掉打括号,直接分号结束
抽象类:抽象方法所在的类,必须是抽象类才能,在class 之前写上abstract

如何使用抽象类和抽象方法
1.不能直接创建new 抽象类
2.必须用一个子类来继承抽象类
3.子类必须覆盖重写抽象父类当中,所有的抽象方法
*/
//抽象类
public abstract class Animal{
    //抽象方法,只有声明没有具体方法
    public abstract void eat();
    public abstract void run();
}
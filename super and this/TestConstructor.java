/*
继承关系中,父子类构造方法的特点
1.子类构造方法当中有一个默认隐含 super() 调用,所以一定是父类的构造函数,后执行的子类构造
2.子类构造方法可以通过super()关键字来调用父类的重栽函数(方法)
3.super的父类构造调用,必须是子类构造方法的第一个语句.一个子的类构造不能调用多次super()
*/

public class TestConstructor {
    public static void main(String[] args) {
        Son son = new Son();
        
    }
}

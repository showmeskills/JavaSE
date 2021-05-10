package demo02;

/*
    super 关键字用来访问父类内容,而this关键字用来访问本类内容
    三种用法
    1.在本类成员方法中,访问本类的成员变量
    2.在本类成员方法中,访问本类的另一个成员方法
    3.在本类的构造方法中,访问本类的另一个构造方法
    在第三种用法中要注意
    A.this(...)调用也必须是构造方法的第一个语句,唯一一个
    B.super和this两种构造调用,不能同时使用
*/
public class Son extends Father {
    int num = 20;

    public Son() {
        //super();和this 不能同时使用
        this(3);// 调用本类的有参构造器
        /*
         * public Son(int num){ this.num = num; }
         */
    }
    //son 类有参构造器
    public Son(int num) {
        this.num = num;
    }

    public void method() {
        System.out.println(this.num);
    }

    public void methodTwo() {
        this.method();// 调用本类的方法
    }

}

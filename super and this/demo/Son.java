package demo;
/*
super 关键字的用法有三种
1.在子类的成员方法中,访问父类的成员变量
2.在子类的成员方法中,访问父类的成员方法
3.在子类的构造方法中,访问父类的构造方法
*/
public class Son extends Father {
    int num = 20;
    public Son(){super();}//访问无参构造器

    public void methodSon(){System.out.println(super.num);}//调用父类的变量成员

    public void method(){
        super.method();//访问父类中的method
        System.out.println("子类方法");
    }
}

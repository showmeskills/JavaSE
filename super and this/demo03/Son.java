package demo03;

public class Son extends Father{
    int num = 20;
    @Override
    public void method(){
        super.method();//调用父类的方法
        System.out.println("子类的方法,上面是子类调用父类方法");
    }
    public void show(){
        int num = 30;
        System.out.println("局部变量"+num);
        System.out.println("本类变量"+this.num);
        System.out.println("父类变量"+super.num);
    }

}

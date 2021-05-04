package demo;

// 一旦使用了static 修饰成员方法,那么这个成员方法就变成了静态方法
// 静态方法属于类的而不属于实例对象的;
public class StaticMethod {
    public static void main(String[] args) {
      

        StaticMethod staticMethod = new StaticMethod();
        staticMethod.main2();//非静态方法调用

        StaticMethod.main1();//静态方法调用
        
        //对于本类当中的静态方法,可以省略类名称
        main1();
    }
    public static void main1(){

    }
    public void main2(){

    }
}

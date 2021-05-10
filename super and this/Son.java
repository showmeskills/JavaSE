public class Son extends Father {
     //调用父类的变量
    int num = super.num;
    public Son(){
        //调用父类的构造器,无参和有参只能有一个
        //super();//在调用父类无参构造方法
        super(20);//在调用父类重栽的构造方法'
        System.out.println("子类构造方法!");
        System.out.println(this.num);//20
    }
    public void method(){
        //super();//错误写法!只有子类构造方法,才能调用父类构造方法,这里只能调用父类的方法和变量成员
        //调用父类的方法
        super.method();
       
    }
}

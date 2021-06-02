package methodGeneric;

public class Demo {
    public static void main(String[] args){
        //调用含有泛型的方法method
       //传递什么类型,泛型就是什么类型
       method(10);//泛型是int
       method("10");//泛型是String
       method(10.0);//泛型是Double
       method(true);//泛型是boolean
       Demo.method01("静态方法,不建议创建对象调用");
    }
    public static <M> void method(M m){
        System.out.println(m);
    }
    public static <S> void method01(S s){
        System.out.println(s);
    }
}

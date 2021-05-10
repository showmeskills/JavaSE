
/*
一个抽象类不一定含有抽象方法
只要保证抽象方法所在的类是抽象类
这样没有抽象方法的抽象类,也不能直接创建对象,在一些特殊场景有用途
*/
public class AbstractFather {
    public static void main(String[] args) {
        Son son = new Son();
        son.eat();
    }
}

package demo;

//静态代码块的作用
//作用:当第一次用到本类时,静态代码块执行唯一的一次
//静态块会优先执行
//静态代码块只能写静态成员变量,不能写成员变量
public class PersonTest {
    public static void main(String[] args) {
        Person one = new Person();
    }
}

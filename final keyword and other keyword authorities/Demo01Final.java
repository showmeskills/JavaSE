import authorityDecorator.AuthorityDecorator;

/**
 * final关键字代表最终,不可改变的
 * 常见四种用法:
 * 1.可以用来修饰一个类
 * 2.可以用来修饰一个方法
 * 3.还可以用来修饰一个局部变量
 * 4.还可以用来修饰一个成员变量
 */

public class Demo01Final{
    public static void main(String[] args){
        //final 修饰局部变量,是不能再被赋值的
        final int NUM = 200;
        final int NUM_02;
        NUM_02 = 100;
        //对于基本类型来说,不可变说的是变量当中的数据不可以改变
        //对于引用类型来说,不可变说的是变量当中的地址值不可改变
        Student student = new Student("我啊");
        String name = student.getName();
        System.out.println("地址值:"+student);//地址值:Student@1175e2db
        System.out.println("name:"+name);

        Student student01 = new Student();
        System.out.println("地址值:"+student01);//地址值:Student@36aa7bc2
        String name01 = student01.getName();
        System.out.println("name01:"+name01);
        System.out.println("--------------------");

        //引用数据类型是地址不能改变,如果成员变量没有设置final 还是可以变的
        final Student student02 = new Student("Terrabce");//这里就代表最终的
        //student02 = new Student(); 这样会报错
        student02.setName("wofsdfadsad");
        String name02 = student02.getName();
        System.out.println("name02:"+name02);
        System.out.println("地址值:"+student02);//地址值:Student@76ccd017
        System.out.println("--------------------");

        method();

        Person person = new Person("Terrance0101");
        System.out.println(person.getName());

        //在不同文件夹中只能使用public
        AuthorityDecorator AuthorityDecorator = new AuthorityDecorator();
        int publicNum = AuthorityDecorator.publicNum;
    }

    public static void method(){
        // final int c = 0;
        // for(int i=0; i < 10; i++){
        //     c = i;
        // }
        for(int i = 0; i < 10; i++){
            final int c = i;
            System.out.println(c);
        }
    }
}
/**
 * 1.final类
 * final 类的格式:
 * 含义:当前这个类不能有任何的子类.(太监类)
 * 注意:一个类如果是final的,那么其中所有的成员方法都无法进行覆盖重写(因为没有儿子)
 * final 类不能作为父类, 但是final类可以作为一个子类
 * 2.final 方法
 * 当final关键字用来修饰一个方法的时候,这个方法就是最终方法,也就是不能被覆盖重写.
 * 格式:
 * 修饰符 final 返回值 方法名称(参数列表){方法体}
 * 注意事项:
 * 对于类,方法来说,abstract 关键字和final关键字不能同时使用,因为矛盾
 * final和abstract 关键字不能同时出现
 * 3.final 修饰一个局部变量
 * 
 */
abstract class AbstractClass{
    public final void method(){};
    public abstract void methodAbstract();
    protected final void methodFinal(){};
}
class GrandFather{
    public void method(){System.out.println("GrandFather");}
    public final void methodGrandFather(){System.out.println("GrandFather");}
    private final void methodGrandFather01(){System.out.println("GrandFather01");}
}
final class Father extends GrandFather{
    @Override
    public void method(){System.out.println("Father");}
    // @Override final方法不能被重写回报错
    // public final void methodGrandFather(){System.out.println("Father");}
}

//final类不能被继承
// class Son extends Father{}

/**
 * final 修饰成员变量
 */
class Student {
    private String STUDENT_NAME ="Terry";
    private final int STUDENT_AGE = 20;
    public Student(){};
    public Student(String name){
        this.STUDENT_NAME = name;
    }
    public final String getName (){
        return this.STUDENT_NAME;
    }
    public final int getAge(){
        return this.STUDENT_AGE;
    }
    public final void setName(String name){
        this.STUDENT_NAME = name;
    }
}
/**
 * 1.由于成员变量具有默认值,所有用了final之后必须手动赋值,不会再给默认值
 * 2.对于final的成员变量,要么使用直接赋值,要么通过构造方法赋值.二者选其一.
 * 3.必须保证类当中所有重栽的构造方法,都最终会对final的成员变量进行赋值(有参和无参构造其都必须给final成员变量赋值)
 */
class Person {
    //赋值方法一
    private final String NAME; //="Terrance";//需要手动赋值不会再给默认值
    //赋值方法二
    public Person(){this.NAME = "Terrance";}
    public Person(String name){
        this.NAME = name; //不可以再次被赋值
    }
    public final String getName (){
        return this.NAME;
    }
}

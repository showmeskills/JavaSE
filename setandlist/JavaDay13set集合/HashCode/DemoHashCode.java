package HashCode;

/*
 哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
在Object类有一个方法,可以获取对象的哈希值
int hashCode() 返回该对象的哈希码值
hashCode 方法的源码:
 public native int hashCode();
 native:代表该方法调用的是本地操作系统的方法:
*/


public class DemoHashCode {
    public static void main(String[] args){
        //Person 类继承了Object类,所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//1993134103

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//405662939
    }
}

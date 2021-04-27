/*
字符串常量池: 程序当中直接写上的双引号字符串,就是存放在字符串常量池中;
对于基本数据类型来说 == 就是进行数值的比较
对于引用数据类型来说 == 就是进行地址值比较
常量池:静态常量池,运行时常量池
静态常量池 存在于class文件中,比如经常使用的 javap-verbose中,常量池总是在最前面
运行时常量池,就是在class文件被加载进了内存之后,常量池保存在了方法区中,通常说的常量值
的是运行时常量池.所以呢,讨论的都是运行时常量池字符串常量池
最典型的就是字符串

普通的String a = "abc"; 存在方法区里面(常量池)
然而 String b = new String("abc"); 存放在堆中
 a == b 会是 false;
*/

public class Demo02String {
    public static void main(String[] args){
        String str1 = "abc";//存在常量池中
        String str2 = "abc";
        char [] charArray = {'a','b','c'};
        String str3 = new String(charArray);//存在堆中
        String str4 = new String("abc");//堆和堆中相同的字符串,地址不同,因为这里比较的是地址值
        System.out.println(str1 == str2 );//true;
        System.out.println(str1 == str3);//false;
        System.out.println(str2 == str3);//false;
        System.out.println(str1 == str4);//false;
        System.out.println(str3 == str4);//false;
    }
}

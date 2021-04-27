/*
当字符串在堆中 那么 == 是比较对象的地址值
如果确实需要字符串的内容比较,可以使用2哥方法
public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会
注意事项:
1.任何对象都能用object进行接受
2.equals 方法具有对称性,也就是a.equals(b) 和 b.equals(a)效果一样
3/如果比较双发一个常量一个变量,推荐把常量字符串写在前面
推荐: "abc".equals(str) 不推荐:str.equals("abc") 因为会报NullPointerException;

public boolean equalsIgnoreCase(String str):忽略大小写,进行内容比较

总结: 当字符串被保存在堆中 需要通过方法才能进行内容比较
1.equals() 不忽略大小写
2.equalsIgnoreCase() 忽略大小写(只有英文字母)
*/

public class Demo01StringEquals {
    public static void main(String[] args){
        //存在常量池中
         String str1 = "Hello";
         String str2 = "Hello";
         //存在堆中
         char [] charArray = {'H','e','l','l','o'};
         String str3 = new String(charArray);
         String str4 = new String ("Hello");
         System.out.println(str3.equals(str2));//堆于常量池中比较 true
         System.out.println(str3.equals(str1));//堆于常量池中比较 true
         System.out.println(str4.equals(str3));//堆于堆中的比较 true
         System.out.println("Hello".equals(str4));//字符串和堆字符串比较 true;


         String str5 = new String("hello");
         String str6 = new String("Hello");
         System.out.println(str5.equalsIgnoreCase(str6));//true 忽略大小写
    }
}

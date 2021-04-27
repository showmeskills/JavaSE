
//java.lang.String; java.lang下面的都不需要导包
/*
    字符串的内容 永不可变
    正是因为字符串不可改变所以,使用字符串是可以共享使用的
    String str2 = "abc";
    String str3 = "abc";
    System.out.println(str2 == str3); =>返回true
    字符串效果上当相于char[]字符数组,底层原理是byte[]字节数组
*/

public class StringType {
    public static void main(String[] args){
        //使用空参字符串
        String str1 = new String("123");//小括号留空 说明:字符串什么内容都没有
        System.out.println("第一个字符串"+str1.toString());
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str2 == str3);

        //根据字符数组创建字符串
        char [] charArray = {'A','B','C'};
        String str4 = new String(charArray);//把字符数组转字符串
        System.out.println(str4);

        //根据字节数组创建字符串
        byte [] byteArray = {97,98,99};
        String str5 = new String(byteArray);//因为97在编码标中对应的就是a
        System.out.println(str5);//abc

        //直接定义字符串
        String str6 = "wo cao ya";
        
    }
}
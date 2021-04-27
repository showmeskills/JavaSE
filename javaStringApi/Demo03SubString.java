/*
    字符串的截取方法:
    public String substring(int index):截取从参数位置一直到字符串末尾,返回新字符串
    public String substring(int begin, int end):截取从begin 开始,一直到end结束,中的字符串
    备注:[begin,end) 包含begin,不包含end 就是end-1
*/

public class Demo03SubString {
    public static void main(String[] args){
        String str1 = "HelloWorld";

        String str2 = str1.substring(5);
        System.out.println(str2);

        String str3 = str1.substring(2,8);
        System.out.println(str3);

        /*
            下面这种写法,字符串的内容依然是没有改变的
            下面有两个字符串:"Hello","Java"
            strA当中保存的是地址值
            本来地址值是Hello的0x666
            然后地址值变成了Java的0x999
            总结地址不同 值依然存在
        */

        String strA = "Hello";
        System.out.println(strA);
         strA = "Java";
        System.out.println(strA);
    }
}

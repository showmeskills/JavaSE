/*
    String 当中与获取相关的常用方法有:

    public int length():获取字符串当中含有的字符个数,拿到字符串长度
    public String concat(String str):将当前字符串和参数字符串拼接成返回值新的字符串
    public char charAt(int index):获取指定索引位置的单位字符(索引从0开始)
    public int indexOf(String str): 查找参数字符串在本字符串当中首次出现的索引位置,
    如果没有则返回-1
*/

public class Demo02StringGet {
    public static void main(String[] args){
        int length = "abcbdsfkjsdkfjsf".length();
        System.out.println(length);

        String str = "abcd";
        String str1 = new String("world");
        String str2 = str.concat(str1);
        System.out.println(str2);


        char ch = "hellow".charAt(1);
        System.out.println(ch);//e;

        int index = "hellow".indexOf("llo");
        System.out.println(index);//2;返回第一次出现的字符串的索引,没有值返回-1


    }
}

/*
    String当中与转换相关的常用方法有:
    public char[] toCharrArray():将当前字符串拆分为字符数组作为返回值
    public byte[] getBytes(): 将获得当前字符串底层的字节数组;
    public String replace(CharSequence oldString, CharSequence newString):
    将所有出现的老字符串替换成为新的字符串,返回

*/

public class Demo04StringConvert {
    public static void main(String [] args){
        //转换为字符数组
        char [] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for(int i = 0; i<bytes.length;i++){
            System.out.println(bytes[i]);//97,98,99
        }
        //字符串的内容替换
        String str1 = "what the fuck";
        String str2 = str1.replace("uc","xx");
        String str3 = "会不会玩,挖槽你大爷的";
        String str4 = str3.replace("你大爷的","****");
        System.out.println(str4);
    }
}

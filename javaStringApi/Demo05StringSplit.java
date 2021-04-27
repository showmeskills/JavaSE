/*
 分割字符串的方法
    public String[] split(String regex): 按照参数的规则,将字符串切分成为若干部分;返回一个字符串数组
    注意事项:
    split 方法的参数其实是一个 "正则表达式",今后学习
    今天要注意:如何按照英文句点'.'进行切分,必须写"\\."(两个反斜杠) \\表示转译字符
*/
public class Demo05StringSplit {
    public static void main(String[] args){
        //以逗号分割
        String str1 = "aaa,bbb,ccc";
        String[] str2 = str1.split(",");
        for(int i = 0; i < str2.length;i++){
            System.out.println(str2[i]);
        }

        //以空格分割
        String str3 = "aaa bbb ccc";
        String[] str4 = str3.split("\\s+");
        for(int i = 0; i < str4.length;i++){
            System.out.println(str4[i]);
        }


         //以空格分割
         String str5 = "aaa.bbb.ccc";
         String[] str6 = str5.split("\\.");
         for(int i = 0; i < str6.length;i++){
             System.out.println(str6[i]);
         }
    }
}

/*
    题目:
    键盘输入一个字符串,并且统计其中各种字符出现的次数
    种类有:大写字母,小写字母,数字,其它

    1.Scanner类
    2.键盘输入的是字符串,那么String str = scanner.next();
    3.定义四个变量,分别代表四种字符格子的出现次数
    4.需要对字符串一个字,一个字检查,string-->char[],方法就是toCharArray()
    5.遍历char[]字符数组,对当前字符的种类进行判断,并且用四个变量进行++动作;
    6.打印输出四个变量,分别代表四种字符出现次数
*/
import java.util.Scanner;

public class Demo7StringPractise02 {
    public static void main(String[] args){
        Scanner scanner = Demo7StringPractise02.method();
        String input = scanner.next();
        int upper = 0;
        int lower = 0;
        int number = 0;
        int other = 0;
        //转换字符
        char [] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length;i++){
            char ch = charArray[i];
            if('A' <= ch && ch <= 'Z'){
                upper++;
            }else if ('a' <= ch && ch <= 'z'){
                lower++;
            }else if('0' <= ch && ch <= '9'){
                number++;
            }else{
                other++;
            }
        }
        System.out.println(upper+" "+lower+" "+number+" "+other);
    }
    public static Scanner method () {
        return new Scanner(System.in);
    }
  
}

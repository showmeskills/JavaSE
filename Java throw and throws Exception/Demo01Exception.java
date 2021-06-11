import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是java 语言中所有错误或异常的超类
        Exception:编译期异常,进行编译(写代码)java程序出现的问题
            RuntimeException:运行期异常,java程序运行过程中出现的问题
            异常就相当于得了一个小毛病(感冒,发烧),把异常处理掉,程序可以继续执行
        Error:错误
            错误就相当于程序得了一个无法治愈的毛病,必须修改源代码,程序才能继续执行
        

*/

public class Demo01Exception{
    public static void main(String[] args) /*throws ParseException*/{
        //Exception:编译期异常,进行编译(写代码)java程序出现的问题
        //解决方法一:
        //throws ParseException 
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // sdf.parse("1999-0909");
        //方法二:try and catch
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Date date = null;
        // try{
        //     date = sdf.parse("1999-09-09");//把字符串格式日期,解析为date格式日期
        // }catch(ParseException e){
        //     e.printStackTrace();
        // }
        // System.out.println(date);//Thu Sep 09 00:00:00 AEST 1999

        // RuntimeException:运行期异常,java程序运行中出现的问题
        //     int[] arr = {1,2,3};
        //     try{
        //         //可能出现异常的代码
        //         System.out.println(arr[3]);
        //     }catch(Exception e){
        //         System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //     }
            /*
                Error:错误
                outOfMemoryError:Java heap space
                内存溢出的错误,创建的数组太大了,超出了给JVM分配的内存
            */
            // int [] arr=new int[1024*1024*1024];//java.lang.OutOfMemoryError: Java heap space
            //必须修改代码创建的数组小一点
            //int [] arr=new int[1024*1024];
    }
}
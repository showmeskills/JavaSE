import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/*
java.text.SimpleDateFormat:是 日期/时间格式化的一个类
作用
    格式化(也就是日期-文本)解析(文本-日期)
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    方法
        日期(Date)->文本(string)
        sdf.format(Date date) 按照指定的模式,把Date日期,格式化为符合模式的字符串
        返回一个String
        String format = sdf.format(date);

        文本(string)->日期(Date)
        Date sdf.parse(String source) 把符合模式字符串,解析为Date日期
        返回日期格式
        Date date = sdf.parse("2088年08月08日 15时51分54秒");//需要与SimpleDateFormat日期格式一致

    构造方法
        SimpleDateFormat(String pattern)
            用给指定的模式和默认语言环境的日期格式符合构造SimpleDateFormat
            参数 String pattern 
                传递指定的模式
                模式区别大小写
                y 年
                M 月
                d 日
                H 时
                m 分
                s 秒
*/


public class DateDemo2 {
    public static void main(String[] args) throws Exception {
        demo01();
        demo02();
    }
    /*
        使用DateFormat类中的format方法,把日期格式化为文本
        使用步骤
            1.创建一个SimpleDateFormat，因为DateFormat是一个抽象类,构造方法中指定模式

    */
    private static void demo01(){
        //设置日期形式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);//2021/05/23 23:56:34
        System.out.println(date);//Sun May 23 23:56:34 AEST 2021
    }
    private static void demo02() throws Exception{
         //设置日期形式
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
         //这个方法回有异常 所以要throws Exception
         Date date = sdf.parse("2088年08月08日 15时51分54秒");//需要与SimpleDateFormat日期格式一致
         System.out.println(date);//Sun Aug 08 15:51:54 AEST 2088
    }
}

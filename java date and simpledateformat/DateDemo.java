import java.util.Date;
/*
    java.util.Date:表示日期和时间;
    类Date 表示特定的瞬间,精确到毫秒;
    毫秒值的作用:可以对时间和日期进行计算;
    可以计算 2099-01-03 到 2088-01-01 中间有多少天;
    可以日期转换为毫秒进行计算,计算完毕,在把毫秒转换为日期;

    把日期转换为毫秒:
    当前的日期:2088-01-01
    时间原点(0毫秒):1970年1月1日00:00:00(英国格林威治)
    就是计算当前日期到时间原点之间一共经历了多少毫秒
    注意:
    中国属于东八区,会把时间增加8个小时
    1970年1月1日08:00:00;
    把毫秒转换为日期:
    1天 = 24 * 60 * 60 =86400秒 *1000 = 86400000ms
*/
public class DateDemo{
    public static void main(String[] args) {
        //获取当前系统时间
        System.out.println(System.currentTimeMillis());
        demo();
        demo1();
        demo2();
    }   
    public static void demo(){
        //获取当前系统的日期和时间(不带参数构造器)
        Date date = new Date();
        System.out.println(date);//Sun May 23 23:10:27 AEST 2021
    }
    public static void demo1(){
        //Date类的带参数构造方法
        //Date(long date):传递毫秒值,把毫秒值转换为Date日期
        Date date = new Date(0);
        System.out.println(date);//Thu Jan 01 11:00:00 AEDT 1970, 当0L
        date = new Date(1621775654952l);//记得数字尾巴上加l/L
        System.out.println(date);//Sun May 23 23:14:14 AEST 2021
    }
    public static void demo2(){
        Date date = new Date();
        //date.getTime() 把日期转为毫秒值
        long time = date.getTime();
        System.out.println(time);//同等于System.currentTimeMillis()
    }
}
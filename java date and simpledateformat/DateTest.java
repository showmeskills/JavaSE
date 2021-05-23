import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
请使用日期时间相关的API,计算出一个人已经出生天
分析:
1.使用Scanner类中的方法next()获取出生日期
2.使用DateFormat类中的方法 parse, 把字符串出生日期解析成Date
3.把Date 格式的出生日期转换为毫秒值
4.获取当前日期的毫秒值
5.使用当前日期的毫秒值-出生日期
6.把毫秒值转换为天
*/

public class DateTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的出生年");
        String year = scanner.next();
        System.out.println("请输入你的出生月");
        String month = scanner.next();
        System.out.println("请输入你的出生日");
        String day = scanner.next();
        String birthday = year+"年"+month+"月"+day+"日";
        Date date = new Date();
        //获取1970 1月1日到现在毫秒数
        long currentMS = date.getTime();
        //设置日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //生成 yyyy年MM月dd日 日期
        Date birthDate = simpleDateFormat.parse(birthday);
        //日期转毫秒
        long birthdayMs = birthDate.getTime();
        Date a = new Date(55555555522l);
        System.out.println(a);
        long gap = currentMS - birthdayMs;
        //换成天数
        String totalDate = gap/1000/60/60/24 + "天";
        System.out.println(totalDate);



        scanner.close();
    }
}

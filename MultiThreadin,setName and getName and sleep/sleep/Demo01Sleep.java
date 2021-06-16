package sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    public static void sleep(long millis):使用当前正在执行的线程以指定的毫秒数暂停(暂时停止模拟,毫秒数结束之后,线程继续执行)
*/
public class Demo01Sleep {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        //计时秒表功能
        for(int i = 0; i <=60;i++){
            System.out.println(format);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        int hour = 0;
        int min = 0;
        int sec = 0;
        //计时秒表功能
        for(int i = 0; i <=60;i++){
            sec=i;
            if(sec%10 == 0){
                min+=1;
            }
            if(min%10 == 0){
                hour+=1;
            }
            System.out.println(hour+":"+min+":"+sec);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

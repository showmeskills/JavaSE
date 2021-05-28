import java.util.Arrays;

/*
    java.lang.System
        类中提供了大量的静态方法,可以获取当前系统相关的信息或系统级的操作

*/

public class DemoSystem {
    public static void main(String[] args){
        // demo();
        demo1();
    }

    private static void demo(){
        long s = System.currentTimeMillis();

        for(int i = 0; i < 9999;i++){
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
    private static void demo1(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println(Arrays.toString(dest));//[6, 7, 8, 9, 10]
        System.arraycopy(src, 1, dest, 2, 3);
        System.out.println(Arrays.toString(dest));//[6, 2, 3, 4, 10]
    }

}
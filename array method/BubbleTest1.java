/*

*/
import java.util.*;
public class BubbleTest {
    public static void main(String[] args){
        int [] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
        //冒泡排序
        /**
         * 两两对比
         * 外层循环是比几轮 8个元素 7轮
         * 
         */

         for(int i=0; i<arr.length-1;i++){
             for(int j=0; j<arr.length-1-i;j++){
                 if(arr[j] > arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
         }

        System.out.println(Arrays.toString(arr));
     
    }
}

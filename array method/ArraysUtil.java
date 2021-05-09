/*
自定义数组的工具类
*/

public class ArraysUtil {
    // max number
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // min number
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // sum array;
    public int getSum(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result+=arr[i];
        }
        return result;
    }

    // average array;
    public int getAverage(int[] arr) {
        return this.getSum(arr)/arr.length;
    }

    // reverse array;
    public int[] reverse(int[] array) {
        int[] arr = new int[array.length];
        for(int i = 0; i < arr.length; i++){
            arr[arr.length - 1-i] = array[i]; 
        }
        return arr;
    }

    // copy arrays
    public int[] copy(int[] array) {
        int[] arr = new int[array.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = array[i]; 
        }
        return arr;
    }

    // array sort
    public int[] sort(int[] array) {
        int [] arr = new int[array.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = array[i];
        }
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j <arr.length- 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    //将数字数组转字符串
    public String print(int[] arr) {
        String str = "[";
        for(int i = 0; i <arr.length; i++){
           if(i == arr.length-1){
            str+=arr[i]+"]";
           }else{
            str+= arr[i]+",";
           }
        }
        return str;
    }
    //将数字转字符串数组
    public String[] printTwo(int[] arr){
        String[] strArray = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            strArray[i] = arr[i]+"";
        }
        return strArray;
    }
    // search specific elements
    public String getIndex(int[] arr, int dest) {
        int index = 0;
        String message = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == dest){
                index = i;
            }
        }
        if(index > 0){
            message = Integer.toString(index);
            return message;
        }else{
            message = "不存在";
            return message;
        }
    }
}

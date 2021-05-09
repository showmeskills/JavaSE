import java.util.Arrays;
public class RevisionArray{
    //bubble sort
    public static int[] bubbleSort(int[] array){
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
    //反转
    public static int[] reverseArray(int[] array){
        int[] arr = new int[array.length];
        for(int i = 0; i < arr.length; i++){
            arr[arr.length - 1-i] = array[i]; 
        }

        return arr;
    }
    //copy 数组
    public static int[] copyArray(int[] array){
        int[] arr = new int[array.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = array[i]; 
        }
        return arr;
    }
    public static int[] copyOfArray(int[] array){
        int [] arr = Arrays.copyOf(array, array.length);
        return arr;
    }
    //lineSearch
    public static String lineSearch(int[] array,int num){
        int index = 0;
        String message = "";
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
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
    public static void main(String[] args){
        int [] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        // int [] arrReturn = bubbleSort(arr);
        // System.out.println(Arrays.toString(arrReturn));

        // int [] reverseArrayReturn = reverseArray(arr);
        // System.out.println(Arrays.toString(reverseArrayReturn));

        //int [] copyReturn = copyArray(arr);
        // int [] copyReturn = copyOfArray(arr);
        // for(int i = 0; i < arr.length; i++){
        //     copyReturn[i] = i;
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(copyReturn));

         String lineSearch = lineSearch(arr,22);
         System.out.println(lineSearch);

    }
}
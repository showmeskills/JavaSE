public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int ele = getElement(arr,4);
        System.out.println(ele);
    }

    public static int getElement(int[] arr, int index){
        int ele = arr[index];
        return ele;
    }   
}

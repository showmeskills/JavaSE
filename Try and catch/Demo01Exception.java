import java.util.List;

public class Demo01Exception {
    public static void main(String[] args) {
        /*
         * 多个异常使用捕获又该如何处理呢? 1.多个异常分别处理 2.多个异常一次捕获,多次处理 3.多个异常一次捕获,一次处理
         */
        // 多个异常分别处理;写多个try and catch
        // try{
        // int [] arr = {1,2,3};
        // System.out.println(arr[3]);
        // //数组下标越界
        // }catch(ArrayIndexOutOfBoundsException e){
        // System.out.println(e);
        // }
        // try{
        // List<Integer> list = List.of(1,2,3);
        // System.out.println(list.get(3));
        // //集合下标越界
        // }catch(IndexOutOfBoundsException e){
        // System.out.println(e);
        // }

        /*
         * 一个try多个catch注意事项: catch里边定义的异常变量,如果又父子类关系,那么子类异常变量必须写在上边,否则会报错
         * ArrayIndexOutOfBoudsException extends IndexOutOfBoundsException 所以ArrayIndex
         * 写在IndexOut 上面
         */
        // 2.多个异常一次捕获,多次处理
        // try{
        // int [] arr = {1,2,3};
        // System.out.println(arr[3]);
        // List<Integer> list = List.of(1,2,3);
        // System.out.println(list.get(3));
        // }catch(ArrayIndexOutOfBoundsException e){
        // System.out.println(e);
        // }catch(IndexOutOfBoundsException e){
        // System.out.println(e);
        // }
        // 3.多个异常一次捕获一次处理
        // try{
        // int[] arr = {1,2,3};
        // System.out.println(arr[3]);
        // List<Integer> list = List.of(1,2,3);
        // System.out.println(list.get(3));
        // } catch(Exception e){
        // System.out.println(e);
        // }
        // 不抛出异常 交给jvm处理
        // int[] arr = {1,2,3};
        // System.out.println(arr[3]);
        // List<Integer> list = List.of(1,2,3);
        // System.out.println(list.get(3));
        int a = getA();
        System.out.println(a);
    }
    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            //System.out.println("一定会执行");
            a = 100;
            return a;
        }
    }
}

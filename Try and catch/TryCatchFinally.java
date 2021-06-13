import java.io.FileNotFoundException;
import java.io.IOException;
/*
    try...catch:异常处理第二种方式,自己处理异常
    格式:
        try{
            可能产生异常的带阿妹
        }catch(定义一个变量,用来接收try中抛出的异常对象){
            异常的处理逻辑,异常对象之后,怎么处理异常对象
            一般在工作中,会把异常的信息记录到一个日志中
        }

*/

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
             readFile("c:\\a.tx");
        }catch(Exception e){

            System.out.println(e.getMessage());//传递过来的路径不是c:\a.txt
            //在io包下重写了toString 的方法
            System.out.println(e.toString());//java.io.FileNotFoundException: 传递过来的路径不是c:\a.txt
            //异常处理的逻辑
            //e.printStackTrace();
        } finally{
            //无论是否抛不抛错 都会运行
            System.out.println("资源释放");
        }
    }

    public static void readFile(String path) throws FileNotFoundException, IOException {
        if (!path.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递过来的路径不是c:\\a.txt");
        }
        /*
         * 如果传递的路径,不是.txt结尾 那么我们就抛出IO异常对象,告知方法的调用者,文件的后缀名不对
         * 
         */
        if (!path.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        //System.out.println("路径没有问题,读取文件");
    }
}
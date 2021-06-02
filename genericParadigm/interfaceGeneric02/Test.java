package interfaceGeneric02;

public class Test {
    public static void main(String[] args){
        Demo<String,Integer> demo = new Demo<String,Integer>();
        demo.method01("123");
        demo.method02(123);
    }
}

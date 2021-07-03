package LambdaWithInterface;

public class LambdaInterface {
    public static void main(String[] args){
        invokeMake(()->System.out.println("what are you ding"));
    }
    public static void invokeMake(AnyInter anyInter){
        anyInter.make();
    }
}

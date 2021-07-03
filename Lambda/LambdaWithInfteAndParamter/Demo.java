package LambdaWithInfteAndParamter;

public class Demo {
    public static void main(String[] args) {
        invokeCalc(100,200,(int a, int b)-> a+b);
    }
    public static void invokeCalc(int a, int b, Calculator calculator){
        int sum = a + b;
        System.out.println(sum);
    }
}

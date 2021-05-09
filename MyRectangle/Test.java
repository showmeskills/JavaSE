public class Test {
    public static void main(String[] args){
        MyRectangle myRectangle = new MyRectangle(5,10);
        int area = myRectangle.area();
        int perimerter = myRectangle.perimeter();
        System.out.println("area:=>"+area);
        System.out.println("perimeter:=>"+perimerter);
    }
}

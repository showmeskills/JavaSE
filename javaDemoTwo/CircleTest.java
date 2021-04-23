public class CircleTest {
    double S;
    double pie = Math.PI;


    public double format(double diameter) { 
        double diam = Math.pow((diameter/2),2);
        return  this.S = this.pie *diam;
    }
}


class Test {
    public static void main(String[] args){
        CircleTest circleTest = new CircleTest();
        double result = circleTest.format(10);
        System.out.println(result);
    }
}
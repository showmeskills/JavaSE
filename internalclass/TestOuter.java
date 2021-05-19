public class TestOuter {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.method(10);

        Outer.Inner inner = new Outer().new Inner();
        inner.method(20);
    }
}

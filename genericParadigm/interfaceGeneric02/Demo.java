package interfaceGeneric02;

public class Demo<E,I> implements DemoInterface<E,I> {
    @Override
    public void method01(E e){
        System.out.println(e);
    }
    @Override 
    public void method02(I i){
        System.out.println(i);
    }
}

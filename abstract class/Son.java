
public class Son extends Father{

    public Son(){
        super();//不写会默认调用父类构造器
        System.out.println("子类构造方法");
    }
    @Override
    public void eat(){
        System.out.println("eat rise");
    }
}

public class Demo implements MyInterface{
    @Override
    public void method(){};
    @Override
    public void methodOne(){};
    @Override
    public void methodTwo(){};
    @Override
    public void methodThree(){};
}

abstract class Demo2 implements MyInterface{

}

class Demo3 implements DefaultInterface{
    @Override
    public void eat(){};
}

class Demo4 implements StaticInterface{
   
}
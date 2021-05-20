package demo01;
public class C extends B {
    int numc = 30;
    public C (){
        this.showA();
        this.showB();
        this.showC();
    }
    @Override
    public void showA(){
        System.out.println(super.numa);
    }
    @Override
    public void showB(){
        System.out.println(super.numb);
    }
    public void showC(){
        System.out.println(this.numc);
    }
}

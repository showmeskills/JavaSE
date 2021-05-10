package demo02;

public class Cat extends Animal{
    String name = super.name;
    public Cat(){
        super("a Cat");
    }
    @Override
    public void eat(){
        System.out.println(this.name+"\t"+"is eating a fish");
    }
    @Override
    public void drink(){
        System.out.println(this.name+"\t"+"is drinking milk");
    }
}

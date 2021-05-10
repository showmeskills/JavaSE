package demo02;

public class Dog extends Animal {
    String name = super.name;
    public Dog(){
        super("a Dog");
    }
    @Override
    public void eat(){
        System.out.println(this.name+"\t"+"is eating a bone");
    }
    @Override
    public void drink(){
        System.out.println(this.name+"\t"+"is drinking water");
    }
}

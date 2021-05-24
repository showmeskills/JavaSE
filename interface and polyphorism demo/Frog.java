public class Frog extends Animal implements Swimming{
    public Frog(){};
    public Frog(int age){
        super.age = age;
    }
    @Override
    public void swimming(){
        System.out.println("frog style");
    }
    @Override
    public void action(){
        System.out.println("frog is eating bugs");
    }
    public void drink(){
        System.out.println("frog is drinking");
    }
}
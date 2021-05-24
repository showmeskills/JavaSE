public class Dog extends Animal implements Swimming{
    public Dog(){};
    public Dog(int age){
        super.age = age;
    }
    @Override
    public void swimming(){
        System.out.println("dog style");
    }
    @Override
    public void action(){
        System.out.println("dog is eatin bone");
    }
    public void drink(){
        System.out.println("dog is drinking");
    }
}

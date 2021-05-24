public class Sheep extends Animal {
    public Sheep(){};
    public Sheep(int age){
        super.age = age;
    }
    @Override
    public void action(){
        System.out.println("sheep is eating grass");
    }
    public void drink(){
        System.out.println("sheep is drinking");
    }
}

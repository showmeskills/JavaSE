package demo02;
//最高的抽象父类
public abstract class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract void drink();
}



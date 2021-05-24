public class People {
    public People(){
        this.method(new Dog());
        this.method(new Frog());
        this.method(new Sheep());
    };
    public void method(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.action();
            dog.drink();
            dog.swimming();
        }else if(animal instanceof Frog){
            Frog frog = (Frog)animal;
            frog.action();
            frog.drink();
            frog.swimming();
        }else if(animal instanceof Sheep){
            Sheep sheep = (Sheep)animal;
            sheep.action();
            sheep.drink();
        }
    }
}

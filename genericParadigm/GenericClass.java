public class GenericClass<E,I>{
    private E name;
    private I age;
    public GenericClass(){};
    public GenericClass(E name, I age){
        this.name = name;
        this.age = age;
    }
    public E getName(){
        return this.name;
    }
    public I getAge(){
        return this.age;
    }
    public void setName(E name){
        this.name = name;
    }
    public void setAge(I age){
        this.age = age;
    }
}
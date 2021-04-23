public class Person{
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(this.age);
    }
    public int addAge(int i){
        return this.age += i;
    }
}

class Utils{
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Terrance";
        person.age = 20;
        person.sex = 1;
        person.study();
        person.addAge(2);
        person.showAge();
        Person person1 = new Person();
        person1.addAge(10);
        person1.showAge();


    }
}


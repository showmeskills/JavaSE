public class Person {
    private String name;
    private int age;
    public Person(){};
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person{"+
            "name:"+this.name+
            ",age:"+this.age+"}";
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof Person){
            Person person = (Person)obj;
            boolean b = this.name.equals(person.name)&& this.age == person.age;
            return b;
        }
        return false;
    }
}
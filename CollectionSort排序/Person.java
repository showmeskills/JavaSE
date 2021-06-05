public class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(){};
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person:{" +
            "name="+this.getName()+
            ", age="+this.getAge()+
        "}";
    }
    @Override
    //升序
    public int compareTo(Person o){
        return o.getAge() - this.getAge();
    }
}


package HashCode;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(){};
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    // @Override 
    // public boolean equals(Object o){
    //     if(this == o) return true;
    //     if(o == null || getClass() != o.getClass()) return false;
    //     Person person = (Person) o;
    //     return age == person.age &&
    //             Objects.equals(name, person.name);

    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(this.name, this.age);
    // }

    // @Override
    // public String toString() {
    //     return "Person{" +
    //         "name="+this.name+
    //         ", age=" +this.age+
    //         "}";
    // }
    public String getName(){
        return this.name;
    };
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

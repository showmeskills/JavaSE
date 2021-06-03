import java.util.HashSet;
import java.util.Iterator;
public class Test {
    public static void main(String[] args){
        HashSet<Person> hashset = new HashSet<Person>();
        Person person01 = new Person("小美女",18);
        Person person02 = new Person("小美女",18);
        Person person03 = new Person("大美女",20);
        //person01 和 person02 是一样的hashCode 值
        System.out.println(person01.hashCode());
        System.out.println(person02.hashCode());
        //person03 是不一样的
        System.out.println(person03.hashCode());

        hashset.add(person01);
        hashset.add(person02); 
        hashset.add(person03);
        System.out.println(hashset);
        Iterator<Person> iterator = hashset.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.hashCode());
        }
    }
}

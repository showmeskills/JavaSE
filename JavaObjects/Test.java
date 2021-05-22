import java.util.Objects;

public class Test {
    public static void main(String[] args){
        Person person = new Person("Terrance",20);
        String info = person.toString();
        System.out.println(info);


        Person p1 = new Person("terry",20);
        Person p2 = new Person("terry",20);

        System.out.println(p1==p2);//contrast address btw
        System.out.println(p1.equals(p2));//constrast attribute

        String a = "abc";
        String b = "abc";

        boolean result = Objects.equals(a,b);
        System.out.println(result);
    }
}

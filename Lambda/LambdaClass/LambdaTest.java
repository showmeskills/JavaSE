package LambdaClass;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args){
        Person [] arr = {
            new Person("Terry",55),
            new Person("Terrance",45),
            new Person("Erik",35),
            new Person("Loonger",15),
        };
        Arrays.sort(arr,(o1,o2)->o1.getAge() - o2.getAge());
        for(Person ele : arr){
            System.out.println(ele);
        }
    }
}

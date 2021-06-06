import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class CollectionSortDemo {
    public static void main(String[] args){
        method();
        method01();
        method02();
        method03();

    }

    public static void method(){
        int[] arr ={3,4,6,8,9,2,1,2,1};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int ele : arr){
            list.add(ele);
        }
        Collections.sort(list);
        System.out.println(list);
     }
    public static void method01(){
        int[] arr ={3,4,6,8,9,2,1,2,1};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int ele : arr){
            list.add(ele);
        }
        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2 - o1;
            }
        });
        System.out.println(list);
        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o1 - o2;
            }
        });
        System.out.println(list);
    }
    
    public static void method02(){
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("cTerry",100));
        list.add(new Student("dTe",80));
        list.add(new Student("fTer",90));
        list.add(new Student("gTerry",70));
        list.add(new Student("iTerry",30));
        list.add(new Student("jTerry",10));
        //age sort
        Collections.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
        //name sort
        Collections.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                int result = o1.getName().charAt(0) - o2.getName().charAt(0);
                if(result == 0){
                    result = o1.getAge() - o2.hashCode();
                }
                return result;
            }
        });
    }

    public static void method03(){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("cTerry",100));
        list.add(new Person("dTe",80));
        list.add(new Person("fTer",90));
        list.add(new Person("gTerry",70));
        list.add(new Person("iTerry",30));
        list.add(new Person("jTerry",10));
        Collections.sort(list);
        System.out.println(list);
    }
}

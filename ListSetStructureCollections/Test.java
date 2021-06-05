public class Test {
    public static void main(String[] args){
        String [] arr = {"a", "b", "c"};
        Demo02 demo02 = new Demo02();
        for(String ele : arr){
            demo02.put(ele);
        }
        System.out.println(demo02);

        while(!demo02.isEmpty()){
            Object obj =  demo02.get();
            System.out.println(obj);
        }

    }
}

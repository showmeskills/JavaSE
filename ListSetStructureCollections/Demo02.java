import java.util.LinkedList;

public class Demo02 {
    private LinkedList<Object> list;
    public Demo02() {
        this.list = new LinkedList<Object>();
    }
    public void put(Object o){
        this.list.addLast(o);
    }
    public Object get(){
        return this.list.remove();
    }
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    @Override
    public String toString(){
        return "Demo02 :"+
            this.list
        +"";
    }
}

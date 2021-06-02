package interfaceGeneric;

public class ImpClass implements InterfaceGeneric<String>{
    @Override
    public void method(String str){
        System.out.println(str);
    }
}

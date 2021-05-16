public class Keyboard implements USB{
    @Override
    public void open(){
        System.out.println("open keyboard usb");
    }
    @Override
    public void close(){
        System.out.println("close keyboard usb");
    }
    public void typeFunction(){
        System.out.println("keyboard has a type function");
    }

}

public class Mouse implements USB {
    @Override
    public void open(){
        System.out.println("open mouse usb");
    }
    @Override
    public void close(){
        System.out.println("close mouse usb");
    }
    public void clickFunction(){
        System.out.println("mouse has a click function");
    }

}

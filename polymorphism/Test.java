public class Test{
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.powerOn();
        USB usb = new Mouse();
        laptop.useDevice(usb);
        laptop.useDevice(new Keyboard());
        laptop.powerOff();
    }
}
public class Laptop {
    public void powerOn(){
        System.out.println("turn on laptop");
    }
    public void powerOff(){
        System.out.println("turn off laptop");
    }
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.clickFunction();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.typeFunction();
        }
        usb.close();
    }
}

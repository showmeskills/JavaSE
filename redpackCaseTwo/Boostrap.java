import red.OpenMode;

public class Boostrap {
    public static void main(String[] args){
        MyRed myRed = new MyRed("wehcat redpack");
        myRed.setOwnerName("Terrance");
        // OpenMode openMode = new NormalMode();
        // myRed.setOpenWay(openMode);
        OpenMode openMode = new RandomMode();
        myRed.setOpenWay(openMode);
    }
}

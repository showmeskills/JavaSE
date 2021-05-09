
public class Point{
    int x, y;
    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void movePoint(int dx, int dy){
        this.x += dx;
        this.y += dy;
        System.out.println("x:"+this.x+"\t"+"y:"+this.y);
    }
}
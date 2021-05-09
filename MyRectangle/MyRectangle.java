public class MyRectangle{
    int width, height;
    public MyRectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }
    public int perimeter(){
        int result = (this.height+this.width)*2;
        return result;
    }
    public int area(){
        int result = this.height * this.width;
        return result;
    }
}
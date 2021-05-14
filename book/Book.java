public class Book{
    private String title;
    private int pageNum;
    public Book(){
        this.pageNum = 200;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPageNum(int pageNum){
        if(pageNum < 200){
            System.out.println("page numbers is less 200");
            return;
        }
        this.pageNum = pageNum;
    }
    public void detail(){
        System.out.println("title:"+this.title+",pages:"+this.pageNum);
    }
}
public class BookTwo {
    private String name;
    private String author;
    private String publisher;
    private int price;

    public BookTwo(){
        this.price = 10;
    };

    public BookTwo(String name, String author, String publisher,int price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if(price < 10){
            this.price = 10;
        }else{
            this.price = price;
        }
    }
    public void serPrice(int price){
        if(price < 10){
            this.price = 10;
        }else{
            this.price = price;
        }
    }

    public void detail(){
        System.out.println("book name:"+this.name+",book author:"+this.author+",publisher:"+this.publisher+",price:"+this.price);
    }
}

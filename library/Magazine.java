public class Magazine extends Book {
    public Magazine(){
        System.out.println("Magazine start");
    }
    public Magazine(String name,String author,String publishing_house,double price,String id){
        super.name = name;
        super.author = author;
        super.publishing_house = publishing_house;
        super.price = price;
        super.id = id;
        super.toString();
    }
    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setAuthor(String author) {
        super.author = author;
        
    }

    @Override
    public String getAuthor() {
        return super.author;
    }

    @Override
    public void setPublishing_house(String publishing_house) {
      super.publishing_house = publishing_house;
    }

    @Override
    public String getPublishing_house() {
        return publishing_house;
    }

    @Override
    void setPrice(double price) {
        super.price =  price;
    }

    @Override
    double getPrice() {
        return super.price;
    }

    @Override
    void setId(String id) {
        super.id = id;
    }

    @Override
    String getId() {
        return super.id;
    }
}

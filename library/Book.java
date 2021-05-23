public abstract class Book {
    protected String name;
    protected String author;
    protected String publishing_house;
    protected double price;
    protected String id;
    public Book(){
        super();
        System.out.println("not parameter contructor has been called");
    }

    abstract void setName(String name);
    abstract String getName();
    abstract void setAuthor(String author);
    abstract String getAuthor();
    abstract void setPublishing_house(String publishing_name);
    abstract String getPublishing_house();
    abstract void setPrice(double price);
    abstract double getPrice();
    abstract void setId(String id);
    abstract String getId();
    @Override
    public String toString() {
        return "\n Book={"
        +"name:"+this.name+","
        +"author:"+this.author+","
        +"publishing_house:"+this.publishing_house+","
        +"price:"+this.price+","
        +"id:"+this.id+"}\n";
    }
}
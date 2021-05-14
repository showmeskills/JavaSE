public class TestBook {
    public static void main(String[] args){
        Book book =new Book();
        book.setPageNum(200);
        book.setTitle("Test Book");
        book.detail();

        BookTwo testBook = new BookTwo("t122","wr2234","2sfw",200);
        testBook.detail();
        
    }
}

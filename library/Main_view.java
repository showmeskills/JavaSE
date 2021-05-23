import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @description library util class
 * @author Terrance
 */

public class Main_view {
    ArrayList<NormalBook> normalBookList = new ArrayList<NormalBook>();
    ArrayList<EBook> eBookList = new ArrayList<EBook>();
    ArrayList<Magazine> magazineList = new ArrayList<Magazine>();
    String[] bookName = new String[] { "西游记", "三体", "姿治通鉴", "java编程", "Android开发" };
    String[] author = new String[] { "吴承恩", "刘自信", "司马光", "宋鹏飞", "杨清" };
    String[] publishing_house = new String[] { "人民教育出版社", "机械工业出版社", "清华历史出版社", "北京联合大学出版社", "高等教育初版本" };
    double[] price = new double[] { 22.5, 50.0, 30.8, 12.5, 200.0 };
    String[] id = new String[] { "AN1001", "AN1002", "AN1003", "AN1004", "AN1005" };
    Scanner scanner = new Scanner(System.in);

    Main_view() {
        this.initialBook();
    };

    /**
     * @description initial system
     * @Author Terrance;
     */
    void initialBook() {
        do {
            System.out.println("----welcome to library system----");
            System.out.println("Please select your book category");
            System.out.println("1.NormalBook");
            System.out.println("2.EBook");
            System.out.println("3.Magazine");
            System.out.println("4.Exist");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    this.normalBook();
                    return;
                case 2:
                    this.eBook();
                    return;
                case 3:
                    this.magazine();
                    return;
                case 4:
                    System.out.println("--welcome to use library system,hope to see you again--");
                    return;
                default:
                    System.out.println("you selected number is not correct");
                    System.out.println("please try again");
                    this.initialBook();
            }
        } while (scanner.nextInt() > 0 && scanner.nextInt() < 5);
    }

    /**
     * @description create a different category book;
     * @author Terrance
     */
    void normalBook() {
        for (int i = 0; i < this.bookName.length; i++) {
            this.normalBookList.add(new NormalBook(this.bookName[i] + "normal", this.author[i],
                    this.publishing_house[i], this.price[i], this.id[i]));
        }
        initializeBook("NormalBook");
    }

    void eBook() {
        for (int i = 0; i < this.bookName.length; i++) {
            this.eBookList.add(new EBook(this.bookName[i] + "ebook", this.author[i], this.publishing_house[i],
                    this.price[i], this.id[i]));
        }
        initializeBook("EBook");
    }

    void magazine() {
        for (int i = 0; i < this.bookName.length; i++) {
            this.magazineList.add(new Magazine(this.bookName[i] + "magazine", this.author[i], this.publishing_house[i],
                    this.price[i], this.id[i]));
        }
        initializeBook("Magazine");
    }

    /**
     * @description add delete search post data;
     * @author Terrance
     */
    void initializeBook(String title) {
        do {
            System.out.println("---" + title + "----");
            System.out.println("select your options");
            System.out.println("1. add book");
            System.out.println("2. remove book");
            System.out.println("3. search book");
            System.out.println("4. list all books");
            System.out.println("5. go back last menu");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    this.addBook(title);
                    return;
                case 2:
                    this.removeBook(title);
                    this.initializeBook(title);
                    return;
                case 3:
                    this.searchBook(title);
                    return;
                case 4:
                    this.allList(title);
                    return;
                case 5:
                    System.out.println("go back to the last menu");
                    this.initialBook();
                    return;
                default:
                    System.out.println("----your selected wrong number,please try it again----");
                    this.initializeBook(title);
                    return;
            }
        } while (scanner.nextInt() > 0 && scanner.nextInt() < 6);
    }

    /**
     * @description show all de books
     * @Author Terrance
     */
    void allList(String title) {
        if (title == "Magazine") {
            System.out.println(this.magazineList);
            this.initializeBook(title);
        } else if (title == "EBook") {
            System.out.println(this.eBookList);
            this.initializeBook(title);
        } else if (title == "NormalBook") {
            System.out.println(this.normalBookList);
            this.initializeBook(title);
        }
    }

    /**
     * @description add book middleware;
     * @author Terrance;
     */
    void addBook(String title) {
        if (title == "NormalBook") {
            this.addNormalBook();
        } else if (title == "EBook") {
            this.addEbook();
        } else if (title == "Magazine") {
            this.addMagazine();
        }
    }

    void addNormalBook() {
        NormalBook normalBook = new NormalBook();
        System.out.println("---please enter your book name---");
        normalBook.setName(scanner.next());
        System.out.println("---please enter your book author--");
        normalBook.setAuthor(scanner.next());
        System.out.println("---please enter your publishing_house--");
        normalBook.setPublishing_house(scanner.next());
        System.out.println("---please enter your book price--");
        normalBook.setPrice(scanner.nextDouble());
        int index = Integer.parseInt(this.normalBookList.get(this.normalBookList.size()-1).id.substring(5));
        String id = "AN100"+(++index);
        normalBook.setId(id);
        this.normalBookList.add(normalBook);
        System.out.println("--add completed--");
        this.initializeBook("NormalBook");
    }

    void addEbook() {
        EBook eBook = new EBook();
        System.out.println("---please enter your book name---");
        eBook.setName(scanner.next());
        System.out.println("---please enter your book author--");
        eBook.setAuthor(scanner.next());
        System.out.println("---please enter your publishing_house--");
        eBook.setPublishing_house(scanner.next());
        System.out.println("---please enter your book price--");
        eBook.setPrice(scanner.nextDouble());
        int index = 5;
        String id = "AN100"+(++index);
        eBook.setId(id);
        this.eBookList.add(eBook);
        System.out.println("--add completed--");
        this.initializeBook("EBook");
    }

    void addMagazine() {
        Magazine magazine = new Magazine();
        System.out.println("---please enter your book name---");
        magazine.setName(scanner.next());
        System.out.println("---please enter your book author--");
        magazine.setAuthor(scanner.next());
        System.out.println("---please enter your publishing_house--");
        magazine.setPublishing_house(scanner.next());
        System.out.println("---please enter your book price--");
        magazine.setPrice(scanner.nextDouble());
        int index = 5;
        String id = "AN100"+(++index);
        magazine.setId(id);
        this.magazineList.add(magazine);
        System.out.println("--add completed--");
        this.initializeBook("Magazine");
    }

    /**
     * 
     * @description delete function
     * @author Terrance
     */
    void removeBook(String title){
        if (title == "NormalBook") {
            this.removeNormalBook();
        } else if (title == "EBook") {
            this.removeEbook();
        } else if (title == "Magazine") {
            this.removeMagazine();
        }
    }
    public void removeNormalBook(){
        System.out.println("--Please enter delete book id--");
        String id = scanner.next();
        for(int i=0;i<this.normalBookList.size();i++){
            if(this.normalBookList.get(i).id.equals(id)){
                System.out.println("delete id: "+this.normalBookList.get(i).id+"  book");
                this.normalBookList.remove(i);
            }
        }
    }
    public void removeEbook(){
        System.out.println("--Please enter delete book id--");
        String id = scanner.next();
        for(int i=0;i<this.eBookList.size();i++){
            if(this.eBookList.get(i).id.equals(id)){
                System.out.println("delete id: "+this.eBookList.get(i).id+"  book");
                this.eBookList.remove(i);
            }
        }
    }
    public void removeMagazine(){
        System.out.println("--Please enter delete book id--");
        String id = scanner.next();
        for(int i=0;i<this.magazineList.size();i++){
            if(this.magazineList.get(i).id.equals(id)){
                System.out.println("delete id: "+this.magazineList.get(i).id+"  book");
                this.magazineList.remove(i);
            }
        }
    }
    
    /**
     * @description search function
     * @author Terrance
     */
    void searchBook(String title){
        if (title == "NormalBook") {
            this.searchNormalBook();
        } else if (title == "EBook") {
            this.searchEbook();
        } else if (title == "Magazine") {
            this.searchMagazine();
        }
    }
    public void searchNormalBook(){
        System.out.println("--Please enter delete book id--");
        String id = scanner.next();
        for(int i=0;i<this.normalBookList.size();i++){
            if(this.normalBookList.get(i).id.equals(id)){
                System.out.println("id: "+this.normalBookList.get(i).id+"book info:"+this.normalBookList.get(i));
            }
        }
    }
    public void searchEbook(){
        System.out.println("--Please enter delete book id--");
        String id = scanner.next();
        for(int i=0;i<this.eBookList.size();i++){
            if(this.eBookList.get(i).id.equals(id)){
                System.out.println("id: "+this.eBookList.get(i).id+"book info:"+this.eBookList.get(i));
            }
        }
    }
    public void searchMagazine(){
        System.out.println("--Please enter delete book id--");
        String id = scanner.next();
        for(int i=0;i<this.magazineList.size();i++){
            if(this.magazineList.get(i).id.equals(id)){
                System.out.println("id: "+this.magazineList.get(i).id+"book info:"+this.magazineList.get(i));
            }
        }
    }
}

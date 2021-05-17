package authorityDecorator;
//在同一文件夹下 protected,public
public class Authority {
  public void method(){
    AuthorityDecorator authorityDecorator=  new AuthorityDecorator();
    int number = authorityDecorator.number;
    int publicNum = authorityDecorator.publicNum;
  }
}

package authorityDecorator;
//继承 protected public
public class MySon extends AuthorityDecorator{
    int num = super.number;
    int publicNum = super.publicNum;
}

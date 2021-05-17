package authorityDecorator;
/*
    java中四种权限修饰符
                                public>protected>default>private
        同一个类(我自己)            Y       Y          Y       Y
同一个包(我邻居,同一个文件夹的)       Y       Y          Y       N
        不同的包的子类(我儿子)       Y       Y          N       N
        不同的包的非子类(陌生人)     Y        N         N       N
        public 所有类中可以用 当不是同一级的文件夹中使用时候需要导包
        //在上一级文件夹中使用
        import authorityDecorator.AuthorityDecorator;

        //在不同文件夹中只能使用public
        AuthorityDecorator AuthorityDecorator = new AuthorityDecorator();
        int publicNum = AuthorityDecorator.publicNum;
        protected 能在子类,本类和同一文件中使用
        default 本类和同一文件夹
        private 只能在本类使用
*/


public class AuthorityDecorator {
    private static int num = 10;
    protected int number = 10;
    public int publicNum = 10;
    public static void main(String[] args){
        int num1 = num;
    }
}



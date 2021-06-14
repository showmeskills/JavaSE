import java.util.Scanner;

public class Demo01RegisterException {
    static String[] usernames = { "张三", "李四", "王五" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = scanner.next();
        checkName(username);
        scanner.close();
    }

    public static void checkName(String username) {
        for (String ele : usernames) {
            if (ele.equals(username)) {
                // true:用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
                try {
                    throw new RegisterException("亲，该用户名已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return; // 结束方法
                }
            }
        }
        System.out.println("注册成功");
    }
}
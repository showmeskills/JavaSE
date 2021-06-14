import java.util.Scanner;

public class Demo02RegisterException {
    static String[] usernames = { "张三", "李四", "王五" };

    public static void main(String[] args) throws RegisterException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = scanner.next();
        checkName(username);
        scanner.close();
    }

    public static void checkName(String username) {
        for (String ele : usernames) {
            if (ele.equals(username)) {
                throw new RegisterException("亲，该用户名已经被注册");
            }
        }
        System.out.println("注册成功");
    }
}
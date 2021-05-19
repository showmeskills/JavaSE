public class Test {
    public static void main(String[] args) {
        AnonymousInter anonymousInter = new AnonymousInter() {
            @Override
            public void methodOne() {
                System.out.println("重写bbb");
            }

            @Override
            public void methodTwo() {
                System.out.println("重写2");
            }
        };
        anonymousInter.methodOne();
        anonymousInter.methodTwo();

        new AnonymousInter() {
            @Override
            public void methodOne() {
                System.out.println("重写bbbbb");
            }

            @Override
            public void methodTwo() {
                System.out.println("重写2");
            }
        }.methodOne();;
    }
}

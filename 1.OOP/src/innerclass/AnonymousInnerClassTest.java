package innerclass;

class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i) {

        final int num = 100;

        // 익명 내부 클래스
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };

    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("TEST");
        }
    };

}

public class AnonymousInnerClassTest {

    public static void main(String[] args) {

        Outer2 outer = new Outer2();

        Runnable runnable = outer.getRunnable(50);

        runnable.run();

    }

}

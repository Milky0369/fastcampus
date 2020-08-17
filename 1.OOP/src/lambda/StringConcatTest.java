package lambda;

public class StringConcatTest {

    public static void main(String[] args) {

        StringconImpl impl = new StringconImpl();
        impl.makeString("Hello", "World!");

        // 람다식
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("Hello","World!");

        // 익명 클래스
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        concat2.makeString("Hello", "World!");

    }

}

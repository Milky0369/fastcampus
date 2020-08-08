package string;

public class StringBuilderTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        System.out.println(System.identityHashCode(android));

        // StringBuilder는 단일 쓰레드 상태에서 사용하고 StringBuffer는 멀티 스레드 상태에서 사용한다.
        // 문자를 이어 붙이는 경우에 사용하도록 하자. -> StringTest2의 사항 참고
        StringBuilder builder = new StringBuilder(java);
        builder.append(android);

        java = builder.toString();

        System.out.println(System.identityHashCode(java));

        System.out.println(java);

    }

}

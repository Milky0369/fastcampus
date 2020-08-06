package string;

public class StringTest {

    public static void main(String[] args) {

        // new 를 이용하여 객체를 생성할 경우 heap Memory에 인스턴스가 생성된다.
        String str1 = new String("abc");
        String str2 = new String("abc");

        // 때문에 주소값이 달라 false 가 출력된다.
        System.out.println(str1 == str2);

        // 그냥 = 로 넣으면 상수풀에 있는 값을 가르킨다.
        String str3 = "abc";
        String str4 = "abc";

        // 상수풀상 같은 곳을 가리키기 때문에 같다고 나온다.
        System.out.println(str3 == str4);

        // equals는 값 비교이기 때문에 true가 나온다.

    }

}

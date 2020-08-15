package innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass{

        int iNum = 100;
        // static int sInNum = 200; // static 을 만들려면 내부 클래스 자체가 static이 되어야 한다. -> OutClass 생성 이후에 만들어지기 때문

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }

    }

    public void usingInner() {
        inClass.inTest();
    }

    // Static inner class는 InClass와 반대로 OutClass 생성되고 나서 사용할 수 있는건 아니다.
    static class InStaticClass {

        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        // static 아닌거에는 만들수 없음
        static void sTest() {
            // System.out.println(inNum); // static 안에서는 static으로 선언된것만 사용가능
            System.out.println(sInNum);
            System.out.println(sNum);
        }

    }

}

public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass(); // 내부의 InClass 생성됨
        outClass.usingInner(); // private로 선언된 InClass를 사용하기 위해 usingInner메서드를 통해 InClass를 호출한다.

        // outClass 참조변수를 이용하여 InClass를 생성가능하다.
        OutClass.InClass myInClass = outClass.new InClass();
        myInClass.inTest();

        // static inner class
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest(); // static으로 하면 이렇게도 호출 가능하다.

    }

}

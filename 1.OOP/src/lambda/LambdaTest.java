package lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {

    public static void main(String[] args) {

        PrintString lambda = s -> System.out.println(s);

        lambda.showString("Hello World!");

        showMyString(lambda);

        PrintString lambda2 = returnString();
        lambda2.showString("Hello World");

    }

    public static void showMyString(PrintString p){
        p.showString("Hello Lambda!");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "!!!");
    }

}

package generic;

public class Powder extends Meterial {

    @Override
    public String toString() {
        return "재료는 Powder 입니다.";
    }

    @Override
    void doPrinting() {
        System.out.println("Powder로 프린팅 합니다.");
    }
}

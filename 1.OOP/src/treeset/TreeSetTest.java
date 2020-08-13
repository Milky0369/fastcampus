package treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        // 정렬이 되어 출력된다.
        // String 클래스에 들어가면 Comparable이 구현되어 있기 때문이다.
        for(String str : treeSet){
            System.out.println(str);
        }

    }

}

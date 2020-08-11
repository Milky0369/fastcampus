package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        // Set은 중복을 허용하지 않음.
        HashSet<String> set = new HashSet<String>(0);

        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");

        set.add("이순신");

        System.out.println(set.toString());

        // ArrayList는 인덱스 번호로 관리되지 때문에 중복허용
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("이순신");
        arrayList.add("김유신");
        arrayList.add("강감찬");

        arrayList.add("이순신");

        System.out.println(arrayList.toString());

        // Set에 대해서 순회를 하려면 Iterator를 사용해서 하면 된다.
        Iterator<String> ir = set.iterator();

        while(ir.hasNext()){

            String str = ir.next();

            System.out.println(str);

        }

    }

}

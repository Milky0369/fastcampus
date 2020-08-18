package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Tomas");
        list.add("Edward");
        list.add("Jack");

        Stream<String> stream = list.stream();

        // 리스트 내의 대상을 출력하고 싶을때
        stream.forEach( s -> System.out.println(s) );


        // sort 하고 싶을때, if compareable이 구현되어 있을때 사용가능.
        list.parallelStream().sorted().forEach( s -> System.out.println(s));

        // 각 이름들의 길이를 확인하고 싶을때.
        list.stream().map( s -> s.length()).forEach( n -> System.out.println(n) );

    }

}

package stream;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    public static void main(String[] args) {

        Customer custLee = new Customer("이순신", 40, 100);
        Customer custKim = new Customer("김유신", 20, 100);
        Customer custHong = new Customer("홍길동", 13, 50);

        List<Customer> list = new ArrayList<Customer>();

        list.add(custLee);
        list.add(custKim);
        list.add(custHong);

        System.out.println(list); // toString 으로 재정의한 내용 출력

        list.stream().map( c -> c.getName()).forEach(s -> System.out.println(s)); // stream을 이용하여 한명씩 이름만 출력

        int total = list.stream().mapToInt( c -> c.getPrice() ).sum(); // stream을 이용하여 전체 요금 합계

        System.out.println(total);

        list.stream().filter( c -> c.getAge() >= 20).map( c -> c.getName() ).sorted().forEach( s-> System.out.println(s) ); // 20대 이상만 가져와보기

    }

}

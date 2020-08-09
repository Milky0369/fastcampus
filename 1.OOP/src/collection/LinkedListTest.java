package collection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        // ArrayList는 빠르다.
        // Vactor는 Thread safe 하다
        // LinkedList는 수정 삭제가 쉽다.
        LinkedList<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);

        myList.add(1, "D");

        System.out.println(myList);

        // get 인덱스 번째는 List에만 있는 특성이다.
        // Set에는 중복을 허용하지 않기 때문에 인덱스로 가져오지 않는다.
        for(String aaa : myList){
            System.out.println(aaa);
        }

    }

}

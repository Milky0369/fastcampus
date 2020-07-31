package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) {
		
		System.out.println("정렬방식을 선택 하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		try {
			int sc = System.in.read();
			
			Sort sort = null;
			
			if(sc == 'B' || sc == 'b') {
				sort = new BubbleSort();
			} else if(sc == 'H' || sc == 'h') {
				sort = new HeapSort();
			} else if(sc == 'Q' || sc == 'q') {
				sort = new QuickSort();
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

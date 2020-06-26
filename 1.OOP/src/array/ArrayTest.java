package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// int[] arr = new int[10]; // 기본적 선언
		// int[] arr = new int[] {1,2,3}; // 초기 선언
		// int[] arr = {1,2,3,4,5,6,7,8,9,10} // 선언과 동시에 초기화
		
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0, num=1; i < arr.length; i++, num++) {
			arr[i] = num;
		}

		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		double[] dArr = new double[5];
		int count = 0;
		
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		// 나머지 3, 4는 0으로 초기화 된다.
		
		double total = 1;
		for(int i = 0; i < count; i++) {
			total *= dArr[i];
		}
		
		System.out.println(total);
		
	}
	
}

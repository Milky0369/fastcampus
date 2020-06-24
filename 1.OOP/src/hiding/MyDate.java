package hiding;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;

	// get만 하고 set을 하지 못하는 경우 readOnly -> 중요 정보 데이터를 조작하지 못하게 하겠다. 라는 느낌
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		// this를 사용하는 이유는 보통 매개변수와 멤버변수의 이름을 같이해야 한다.
		// 만일 this를 빼면 day에 day를 대입하는 결과가 발생하기 때문에 멤버변수에 값이 들어가지 않게 된다.
		// this를 사용하여 멤버변수의 메모리 주소값을 가리키게 한다.
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		} else {
			this.month = month;
		}
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day; 
	}
	
	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
		
	}
	
}

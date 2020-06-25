package hiding;

import java.util.Calendar;
import java.util.Date;

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
//			isValid = false;
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
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void isValid() {
		boolean yun = false;
		boolean valid = true;

		if(month < 1 || month > 12) {
			valid = false;
		}
		
		//서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. ...
		//서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. ...
		//서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					yun = true;
				} else {
					yun = false;
				}
			} else {
				yun = true;
			}
			
		} else {
			yun = false;
		}

		// 30일인 월 : 4, 6, 9, 11
		// 31일인 월 : 1, 3, 5, 7, 8, 10, 12
		// 예외 : 2월은 윤년 29, 평년 28
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day > 31 || day < 1) {
					valid = false;
				}
				break;
			case 4: case 6: case 9: case 11:
				if(day > 30 || day < 1) {
					valid = false;
				}
				break;
			case 2:
				if(yun) {
					if(day > 29 || day < 1) {
						valid = false;
					}
				} else {
					if(day > 28 || day < 1) {
						valid = false;
					}
				}
		}
		
		if(valid) {
			System.out.println("유효한 날짜입니다.");
		} else {
			System.out.println("유효한 날짜가 아닙니다.");
		}
	}
	
//	public void showDate() {
//
//		if (isValid) {
//			System.out.println(year + "년 " + month + "월 " + day + "일");
//		} else {
//			System.out.println("유효하지 않은 날짜 입니다.");
//		}
//		
//	}
	
}

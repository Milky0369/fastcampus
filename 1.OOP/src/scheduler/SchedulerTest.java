package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선 순위가 높은 고객우선 숙련도 높은 상담원");
		
		int ch = System.in.read();
		
		Scheduler schd = null;
		
		if(ch == 'R' || ch == 'r') {
			schd = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			schd = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			schd = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		schd.getNextCall();
		schd.sendCallToAgent();
		
	}
	
}

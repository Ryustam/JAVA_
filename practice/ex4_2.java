package practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 현재 날짜 구하기
		LocalDate nowDate = LocalDate.now();
		// 포맷 정의
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy년MM월dd일 ");
		// 포맷 적용
		String dateformatedNow = nowDate.format(dateformat);
		// 결과 출력
		System.out.print(dateformatedNow); // 2021/06/17

		//현재 시간 구하기
		LocalTime nowTime = LocalTime.now();
		// 포맷 정의하기
		DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		// 포맷 적용하기
		String timeformatedNow = nowTime.format(timeformat);
		// 포맷 적용된 현재 시간 출력
		System.out.println(timeformatedNow);

		
	}

}

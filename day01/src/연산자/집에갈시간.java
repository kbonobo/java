package 연산자;

import java.util.Date;

public class 집에갈시간 {
	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		System.out.println("현재 시각은:" +hour);
		
		//비교연산자의결과는 boolean
		//true/false
		if(hour < 16){   //true
			System.out.println("집에 갈 시간이 좀 남아있군요");
			}
		else {//false
			System.out.println("집에 갈 시간입니다");
		}
		
	}

}

package ������;

import java.util.Date;

public class �������ð� {
	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		System.out.println("���� �ð���:" +hour);
		
		//�񱳿������ǰ���� boolean
		//true/false
		if(hour < 16){   //true
			System.out.println("���� �� �ð��� �� �����ֱ���");
			}
		else {//false
			System.out.println("���� �� �ð��Դϴ�");
		}
		
	}

}

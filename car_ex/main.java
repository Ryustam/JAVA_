package car_ex;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck s1[] = new Truck[3];
		
		s1[0]=new Truck("이마이티","현대",2000,500,1000);
		s1[1]=new Truck("5톤","현대",2000,6500,5000);
		s1[2]=new Truck("15톤","현대",2000,10000,15000);
		
		start(s1);
		
	}
	
	public static void start(Truck arr[]) {
		int choice;
		boolean offset=true;
		Scanner sc = new Scanner(System.in);
		
		while(offset) {
			System.out.println("메뉴선택");
			System.out.println("1.트럭정보조회 2.트럭 적재량 검사");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					for(int i=0;i<arr.length;i++) {
						arr[i].showInfo();
					}						
					break;
				case 2:
					for(int i=0;i<arr.length;i++) {
						arr[i].inspectLoad();
					}
					break;
				default :
					offset=false;
					System.out.println("시스템 종료");
					break;
			}
		}
		
	}
}

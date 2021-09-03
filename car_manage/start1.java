package car_manage;

import java.util.Scanner;

public class start1 {
	start1(){
		
	}
	
	public void Crud(Vehicle1 arr[]) {
		
		int code;
		boolean offset=true;
		Scanner sc = new Scanner(System.in);
		
		while(offset) {
			System.out.println("1.차량 정보 등록");
			System.out.println("2.차량 정보 검색");
			System.out.println("3.차량 정보 수정");
			System.out.println("4.차량 정보 삭제");
			System.out.println("5.종료");
			System.out.print("선택");
			
			code=sc.nextInt();
			
			switch(code) {
			case 1: 
				carAdd(arr);
				break;
			case 2:  
				carSearch(arr);
				break;
			case 3:
				carChange(arr);
				break;
			case 4:
				carDelete(arr);
				break;
			case 5:
				offset=false;
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		
	}
	

	public void carAdd(Vehicle1 arr[]) {
		String ID;
		String name;
		String provider;
		int price;
		Boolean navi;
		int load;
		for(int i=0 ;i<arr.length;i++) {
			System.out.println("등록할 차량이 어떤 차량입니까?");
			System.out.println("1.일반차량");
			System.out.println("2.트럭");
			System.out.println("3.오토바이");
			Scanner sc = new Scanner(System.in);
			int code=sc.nextInt();
			switch(code) {
				case 1:
					System.out.println("등록아이디 입력:");
					ID=sc.next();
					System.out.println("차량명 입력:");
					name=sc.next();
					System.out.println("제조사 입력:");
					provider=sc.next();
					System.out.println("가격 입력:");
					price=sc.nextInt();
					System.out.println("네이게이션 여부(Y/N):");
					navi=naviConv();
					arr[i]= new Car1(ID,name,provider,price,navi);
					System.out.println("차량 등록 완료!\n");
					break;
				case 2:
					System.out.println("등록아이디 입력:");
					ID=sc.next();
					System.out.println("차량명 입력:");
					name=sc.next();
					System.out.println("제조사 입력:");
					provider=sc.next();
					System.out.println("가격 입력:");
					price=sc.nextInt();
					System.out.println("네이게이션 여부(Y/N):");
					navi=naviConv();
					System.out.println("적재량 입력:");
					load=sc.nextInt();
					arr[i]= new Truck1(ID,name,provider,price,navi,load);
					System.out.println("차량 등록 완료!\n");
					break;
					
				case 3:
					System.out.println("등록아이디 입력:");
					ID=sc.next();
					System.out.println("차량명 입력:");
					name=sc.next();
					System.out.println("제조사 입력:");
					provider=sc.next();
					System.out.println("가격 입력:");
					price=sc.nextInt();
					arr[i]= new Bike1(ID,name,provider,price);
					System.out.println("차량 등록 완료!\n");
			}
		
		
		}
		
	}
	
	public void carSearch(Vehicle1 arr[]) {
		Scanner sc = new Scanner(System.in);
		String ID;
		
		System.out.println("조회할 차량 아이디 입력:");
		ID=sc.next();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null){
				System.out.println("정보가 없습니다.");
			}else if(arr[i].getID().equals(ID)) {
				arr[i].showInfo();
				System.out.println("");
			}else {
				System.out.println("등록된 정보가 없습니다.");
			}
		}
	}
	
	public void carChange(Vehicle1 arr[]) {
		Scanner sc = new Scanner(System.in);
		String ID;
		int price;
		
		System.out.println("조회할 차량 아이디 입력:");
		ID=sc.next();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getID().equals(ID)) {
				System.out.printf("차량 아이디:%s 확인!\n",ID);
				System.out.println("수정할 가격 입력:");
				price=sc.nextInt();
				arr[i].setPrice(price);
				System.out.println("수정완료!");
			}
		}
		
	}
	public void carDelete(Vehicle1 arr[]) {
		Scanner sc = new Scanner(System.in);
		String ID;
		
		System.out.println("삭제할 차량 아이디 입력:");
		ID=sc.next();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getID().equals(ID)) {
				System.out.printf("차량 아이디:%s 확인!\n",ID);
				arr[i]=null;
				System.gc();
				System.out.println("삭제완료!");
			}
		}
		
	}
	public boolean naviConv() {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		String input;
		
		input=sc.next();
		
		if(input.equals("Y") ||input.equals("y")) {
			result=true;
		} else if(input.equals("N") ||input.equals("n")){
			result=false;
		}
		return result;
	}
}
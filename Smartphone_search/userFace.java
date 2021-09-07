package Smartphone_search;

import java.util.Scanner;

class userFace {
	
	userFace(){
		
	}
	
	public void mainOut(phoneSearch phone[]) {
	
		int code;
		boolean offset=true;
		Scanner sc = new Scanner(System.in);
		
		while(offset) {
			System.out.println("1.모두 조회");
			System.out.println("2.모델명 조회");
			System.out.println("3.제조사 조회");
			System.out.println("4.가격 조회");
			System.out.println("5.종료");
			System.out.print("선택");
			
			code=sc.nextInt();
			
			switch(code) {
			case 1: 
				phoneInfo(phone);
				break;
			case 2:  
				nameSearch(phone);
				break;
			case 3:
				companySearch(phone);
				break;
			case 4:
				priceSearch(phone);
				break;
			case 5:
				offset=false;
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

	private void priceSearch(phoneSearch[] phone) {
		Scanner sc = new Scanner(System.in);
		int start_price;
		int end_price;
		
		System.out.println("시작 가격을 입력하세요.");
		start_price=sc.nextInt();
		System.out.println("끝 가격을 입력하세요.");
		end_price=sc.nextInt();
		
		priceCalc s1= new priceCalc(start_price,end_price);
		
		for(int i=0;i<phone.length;i++) {
			s1.Calc(phone[i]);
		}
		
	}

	private void companySearch(phoneSearch[] phone) {
		Scanner sc = new Scanner(System.in);
		String company;

		System.out.println("제조사를 입력하시오");
		company=sc.next();
		for(int i=0 ;i<phone.length;i++) {
			if(phone[i]==null) {
				continue;
			}
			if(phone[i].getCompany().equals(company)) {
				phone[i].showInfo();
			}
		}
		
	}

	private void nameSearch(phoneSearch[] phone) {
		Scanner sc = new Scanner(System.in);
		String model;
		
		System.out.println("모델명을 입력하시오");
		model=sc.nextLine();
		for(int i=0 ; i<phone.length;i++) {
			if(phone[i]==null) {
				continue;
			}
			if(phone[i].getName().contains(model)==true) {
				phone[i].showInfo();
			}
		}
		
		
		
	}

	private void phoneInfo(phoneSearch[] phone) {
		
		for(int i=0;i<phone.length;i++) {
			if(phone[i]==null) {
				continue;
			}
			phone[i].showInfo();
		}
	}
	
}

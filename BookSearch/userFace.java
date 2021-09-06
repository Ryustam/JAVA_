package BookSearch;

import java.util.Scanner;

class userFace {
	userFace(){
		
	}
	
	public void mainOut(Book Book[]) {
	
		int code;
		boolean offset=true;
		Scanner sc = new Scanner(System.in);
		
		while(offset) {
			System.out.println("1.제목 검색");
			System.out.println("2.저자 검색");
			System.out.println("3.출판사 검색");
			System.out.println("4.소장처 검색");
			System.out.println("5.출판년도 검색");
			System.out.print("선택");
			
			code=sc.nextInt();
			
			switch(code) {
			case 1: 
				nameSearch(Book);
				break;
			case 2:  
				authorSearch(Book);
				break;
			case 3:
				publisherSearch(Book);
				break;
			case 4:
				LibrarySearch(Book);
				break;
			case 5:
				yearSearch(Book);
				break;
			case 6:
				offset=false;
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

	private void yearSearch(Book Book[]) {
		// TODO Auto-generated method stub
		String start_year;
		String end_year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작(년-월-일)를 입력하세요");
		start_year= sc.nextLine();
		System.out.println("끝(년-월-일)를 입력하세요");
		end_year= sc.nextLine();
		
		System.out.println(start_year);
		System.out.println(end_year);
		
		
		yearCalc s1 = new yearCalc(start_year,end_year);
		
		for(int i=0;i<Book.length;i++) {
			s1.calc(Book[i]);
			System.out.println("");
		}
	}


	private void LibrarySearch(Book Book[]) {
		String Library;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소장처를 입력하세요");
		Library= sc.next();
		
		for(int i=0;i<Book.length;i++) {
			if(Book[i]==null) {
				break;
			}else if(Library.equals(Book[i].getLibraryName())) {
				Book[i].showInfo();
				System.out.println("");
			}
		}
		
	}

	private void publisherSearch(Book Book[]) {
		String publisher;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출판사 이름을 입력하세요");
		publisher= sc.next();
		
		for(int i=0;i<Book.length;i++) {
			if(Book[i]==null) {
				break;
			}else if(publisher.equals(Book[i].getPublisher())) {
				Book[i].showInfo();
				System.out.println("");
			}
		}
		
	}

	private void authorSearch(Book Book[]) {
		String Author;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("저자를 입력하세요");
		Author= sc.next();
		
		for(int i=0;i<Book.length;i++) {
			if(Book[i]==null) {
				break;
			}else if(Author.equals(Book[i].getAuthor())) {
				Book[i].showInfo();
				System.out.println("");
			}
		}
	}

	private void nameSearch(Book Book[]) {
		Scanner sc = new Scanner(System.in);
		String bookName;
		
		System.out.println("책 이름을 입력하세요");
		bookName= sc.nextLine();
		
		for(int i=0;i<Book.length;i++) {
			if(Book[i]==null) {
				break;
			}
			else if(Book[i].getBookName().contains(bookName)==true){
				Book[i].showInfo();
				System.out.println("");
			}
		}
	}
	
}

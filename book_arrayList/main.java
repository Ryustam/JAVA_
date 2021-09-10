package book_arrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class main {

	public static void main(String[] args) {
	
	ArrayList<books> bookList= new ArrayList<books>();
	
	books p1 = new books("a","도도","류승윤","대구출판사","2001-01-01","대구도서관");
	bookList.add(p1);
	start(bookList);
		

	}

	private static void start(ArrayList<books> bookList) {
		Scanner sc = new Scanner(System.in);
		int select;
		boolean code = true;
		
		while(code) {
			userOutput();
			select=sc.nextInt();
			
			switch(select) {
				case 1:
					bookAdd(bookList);
					break;
				case 2:
					bookShowInfo(bookList);
					break;
				case 3:
					bookSearch(bookList);
					break;
				case 4:
					bookModify(bookList);
					break;
				case 5:
					bookDelete(bookList);
					break;
				case 6:
					code=false;
					System.out.println("시스템 종료");
					break;	
			}
			
		}
	}

	private static void bookDelete(ArrayList<books> bookList) {
		Scanner sc = new Scanner(System.in);
		String sign;
		boolean info = false;
		System.out.println("청구기호를 입력하시오");
		sign=sc.next();
		
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getSign().equals(sign)==true) {
				bookList.remove(i);
				info =true;
				System.out.println("삭제 성공!");
			}
		}
		if(info == false) {
			System.out.println("없는 도서입니다.");
		}
		
	}

	private static void bookModify(ArrayList<books> bookList) {
		Scanner sc = new Scanner(System.in);
		String sign;
		String library;
		boolean info = false;
		System.out.println("청구기호를 입력하시오");
		sign=sc.next();
		
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getSign().equals(sign)==true) {
				System.out.println("소장처를 다시 입력하세요.");
				library=sc.next();
				bookList.get(i).setLibrary(library);
				System.out.println("수정완료");
				info =true;
			}
		}
		if(info == false) {
			System.out.println("없는 도서입니다.");
		}
	}

	private static void bookSearch(ArrayList<books> bookList) {
		Scanner sc = new Scanner(System.in);
		
		int code;
		
		System.out.println("찾으려는 책의 정보를 고르세요");
		System.out.println("1.제목");
		System.out.println("2.저자");
		System.out.println("3.출판사");
		System.out.println("4.출판년도(범위 예:YYYY-MM-DD)");
		System.out.println("5.소장처");
		
		code=sc.nextInt();
		sc.nextLine();
		switch(code) {
			case 1:
				String name;
				System.out.println("입력:");
				name=sc.next();
				for(int i=0;i<bookList.size();i++) {
					if(bookList.get(i).getName().contains(name)==true) {
						bookList.get(i).showInfo();
					}
				}
				break;
			case 2:
				String writer;
				System.out.println("입력:");
				writer=sc.next();
				for(int i=0;i<bookList.size();i++) {
					if(bookList.get(i).getWriter().contains(writer)==true) {
						bookList.get(i).showInfo();
					}
				}
				break;
			case 3:
				String provider;
				System.out.println("입력:");
				provider=sc.next();
				for(int i=0;i<bookList.size();i++) {
					if(bookList.get(i).getProvider().contains(provider)==true) {
						bookList.get(i).showInfo();
					}
				}
				break;
			case 4:
				String start_year;
				String end_year;
				
				System.out.println("시작년도");
				start_year=sc.nextLine();
				System.out.println("끝년도");
				end_year=sc.nextLine();
				
				year_calc(start_year,end_year,bookList);
				break;
				
			case 5:
				String library;
				System.out.println("입력:");
				library=sc.next();
				for(int i=0;i<bookList.size();i++) {
					if(bookList.get(i).getLibrazy().contains(library)==true) {
						bookList.get(i).showInfo();
					}
				}
				break;	
		}
		
	}

	private static void year_calc(String start_year, String end_year,ArrayList<books> bookList) {
		
		
		int arr[][] = new int[3][4];
		
		StringTokenizer start_stok = new StringTokenizer(start_year,"-");
		StringTokenizer end_stok = new StringTokenizer(end_year,"-");
		for(int i=0;i<bookList.size();i++) {
			StringTokenizer year_stok = new StringTokenizer(bookList.get(i).getYear(),"-");
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(j==0) {
						arr[j][k]=Integer.parseInt(start_stok.nextToken());
					}
					if(j==1) {
						arr[j][k]=Integer.parseInt(end_stok.nextToken());
					}
					if(j==2) {
						arr[j][k]=Integer.parseInt(year_stok.nextToken());
					}
				
				}
				arr[j][3]=arr[j][0]*365+arr[j][1]*30+arr[j][2];
			}
			if(arr[0][3]<=arr[2][3] && arr[2][3]<=arr[1][3]) {
				bookList.get(i).showInfo();
			}
		}
		
	}

	private static void bookShowInfo(ArrayList<books> bookList) {
		if(bookList.size()==0) {
			System.out.println("데이터가 없습니다.");
		}else {
			for(int i=0;i<bookList.size();i++) {
				bookList.get(i).showInfo();
			}
		}
		
	}

	private static void bookAdd(ArrayList<books> bookList) {
		
		Scanner sc = new Scanner(System.in);
		
		String sign;
		String name;
		String writer;
		String provider;
		String year;
		String library;
		
		System.out.println("청구기호는 ?");
		sign=sc.next();
		System.out.println("책 제목은 ?");
		name=sc.next();
		System.out.println("저자는?");
		writer=sc.next();
		System.out.println("출판사는?");
		provider=sc.next();
		System.out.println("출판년도는?(YYYY-MM-DD");
		year=sc.next();
		System.out.println("소장처는?");
		library=sc.next();
		
		books s1 = new books(sign,name,writer,provider,year,library);
		bookList.add(s1);
	}

	private static void userOutput() {
		System.out.println("1.도서 추가");
		System.out.println("2.도서 모두 조회");
		System.out.println("3.도서 조회");
		System.out.println("4.도서 수정(소장처)");
		System.out.println("5.사용자 삭제(청구기호)");
		System.out.println();
	}
	
}

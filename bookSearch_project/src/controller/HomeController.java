package controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import DTO.memberVO;
import service.memberService;

public class HomeController {

	public static void main(String[] args) {
		ArrayList<memberVO> dtos;
		ArrayList<memberVO> dtosSearch;
		ArrayList<memberVO> dtosID;
		ArrayList<memberVO> dtosRent;
		memberService service = new memberService();
		Scanner sc = new Scanner(System.in);
		LocalDate todaysDate = LocalDate.now();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		int choice=0;
		String input;
		String BookName;
		String Author;
		String Publisher;
		String PublishingYear;
		int Page;
		String LibraryName;
		int ID;
		String StorePlace;
		int CheckOutNum;
		String isCheckOut;
		String temp = null;
		
		while(true) {
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				dtos=service.getAllMembers();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("책이름:%s ",dtos.get(i).getBookName());
					System.out.printf("저자:%s ",dtos.get(i).Author());
					System.out.printf("출판사:%s ",dtos.get(i).getPublisher());
					System.out.printf("출판년도:%s ",dtos.get(i).getPublishingYear());
					System.out.printf("페이지:%d ",dtos.get(i).getPage());
					System.out.printf("소장도서관:%s ",dtos.get(i).getLibraryName());
					System.out.printf("책ID:%d ",dtos.get(i).getID());
					System.out.printf("소장처:%s ",dtos.get(i).getStorePlace());
					System.out.printf("대출횟수:%d ",dtos.get(i).getCheckOutNum());
					System.out.printf("대출여부:%s ",dtos.get(i).getisCheckOut());
					System.out.println();
				}
			}else if(choice==2) {
				input=sc.next();
				dtos=service.searchBook(input);
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("책이름:%s ",dtos.get(i).getBookName());
					System.out.printf("저자:%s ",dtos.get(i).Author());
					System.out.printf("출판사:%s ",dtos.get(i).getPublisher());
					System.out.printf("출판년도:%s ",dtos.get(i).getPublishingYear());
					System.out.printf("페이지:%d ",dtos.get(i).getPage());
					System.out.printf("소장도서관:%s ",dtos.get(i).getLibraryName());
					System.out.printf("책ID:%d ",dtos.get(i).getID());
					System.out.printf("소장처:%s ",dtos.get(i).getStorePlace());
					System.out.printf("대출횟수:%d ",dtos.get(i).getCheckOutNum());
					System.out.printf("대출여부:%s ",dtos.get(i).getisCheckOut());
					System.out.println();
				}
			}else if (choice==3) {
				System.out.printf("책이름:");
				BookName=sc.next();
				System.out.printf("저자:");
				Author=sc.next();
				System.out.printf("출판사:");
				Publisher=sc.next();
				System.out.printf("출판년도:");
				PublishingYear=sc.next();
				System.out.printf("페이지:");
				Page=sc.nextInt();
				System.out.printf("소장도서관:");
				LibraryName=sc.next();
				System.out.printf("책ID:");
				ID=sc.nextInt();
				System.out.printf("소장처:");
				StorePlace=sc.next();
				System.out.printf("대출횟수:");
				CheckOutNum=sc.nextInt();
				System.out.printf("대출여부:(true/false)");
				isCheckOut=sc.next();

				service.addBook(BookName,Author,Publisher,PublishingYear,Page,LibraryName,ID,
						 StorePlace,CheckOutNum,isCheckOut);
			}
			else if(choice==4) {
				System.out.printf("책제목을 입력하세요: ");
				BookName=sc.next();
				dtosID=service.searchID(BookName);
				for(int i=0; i<dtosID.size(); i++) {
					System.out.printf("책제목:%s ",dtosID.get(i).getBookName());
					System.out.printf("ID:%s ",dtosID.get(i).getID());
					System.out.println();
				}
				
			}
			else if(choice==5) {
				System.out.printf("삭제할 책의 ID를 입력하세요: ");
				ID=sc.nextInt();
				service.deleteBook(ID);
				
			}
			else if(choice==6) {
				System.out.println("조회할 책제목을 입력하세요.");
				BookName=sc.next();
				
				dtosRent=service.rentBookSearch(BookName);
				for(int i=0; i<dtosRent.size(); i++) {
					System.out.printf("책제목:%s\n",dtosRent.get(i).getBookName());
					System.out.printf("대출횟수:%d\n",dtosRent.get(i).getCheckOutNum());
					System.out.printf("대출%s ",dtosRent.get(i).getisCheckOut());
					temp=dtosRent.get(i).getisCheckOut();
					System.out.println();
					
					if(temp.equals("가능")) {
						System.out.println("대출하시겠습니까? (Y/N)");
						input=sc.next();
						if(input.contains("Y") ||input.contains("y")) {
							System.out.println("대출이 완료되었습니다.");
							System.out.println("대출일:"+todaysDate);
							cal.add(Calendar.DAY_OF_MONTH,+7);
							System.out.println("반납일:"+format.format(cal.getTime()));
							
							service.rentBook(dtosRent.get(i).getBookName(),dtosRent.get(i).getCheckOutNum()+1);
							
							
						}else if(input.contains("N") ||input.contains("n")) {
							System.out.println("대출이 취소되었습니다.");
						}	
					}else if(temp.equals("불가능")){
						System.out.println("대출이 취소되었습니다.");
					}
				}		
			}				
		}
	}
	
	public static void menu() {
		System.out.println("1.모든 책 조회");
		System.out.println("2.책찾기(이름,저자)");
		System.out.println("3.책 추가");
		System.out.println("4.책 ID 조회");
		System.out.println("5.책 폐기");
		System.out.println("6.책 대여/반납");
		
	}

	}



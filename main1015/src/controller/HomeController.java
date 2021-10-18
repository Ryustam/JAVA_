package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.memberVO;
import service.memberService;

public class HomeController {

	public static void main(String[] args) {
		
		ArrayList<memberVO> dtos;
		memberService service = new memberService();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		while(true) {
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				//아이디, 비밀번호 입력받아서
				//일치여부 판단..
				
			}else if(choice==2) {
				dtos=service.getAllMembers();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("아이디:%s\n",dtos.get(i).getID());
					System.out.printf("비밀번호:%s\n",dtos.get(i).getPw());
				}
			}else if (choice==3) {
				//service.signUpMembers();
			}
			else if(choice==6) {
				break;
			}
		}
		sc.close();
	}
	
	public static void menu() {
		System.out.println("1.모두조회");
		System.out.println("2.데이터 조건조회");
		System.out.println("3.데이터 삽입");
		System.out.println("4.데이터 수정");
		System.out.println("5.데이터 삭제");
	}
}
